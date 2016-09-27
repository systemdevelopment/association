package com.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import com.google.common.base.Predicate;
import org.springframework.data.mongodb.core.MongoTemplate;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static com.google.common.base.Predicates.*;
import com.mongodb.Mongo;

@Configuration
@EnableSwagger2
public class AppConfig {
    @Bean
    public Docket document() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select().paths(paths()).build().apiInfo(apiInfo());
    }


    private Predicate<String> paths() {
        return or(containsPattern("/project*"));  //APIのエントリポイントを正規表現で指定
    }
    private ApiInfo apiInfo() {
        ApiInfo apiInfo = new ApiInfo("Sample API", "",
                "terms of service", "", "", "", "");
        return apiInfo;
    }
    
    @Bean
    public MongoClientFactoryBean mongoClientFactoryBean() {
        MongoClientFactoryBean factoryBean = new MongoClientFactoryBean();
        factoryBean.setHost("localhost");
        return factoryBean;
    }
    
    @Bean 
    public MongoTemplate mongoTemplate(Mongo mongo) {
        MongoTemplate mongoTemplate = new MongoTemplate(mongo, "example");
        return mongoTemplate;
    }
}