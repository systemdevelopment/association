package com.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;
import org.springframework.data.mongodb.core.MongoFactoryBean;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

@Configuration
public class AppConfig {
    
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