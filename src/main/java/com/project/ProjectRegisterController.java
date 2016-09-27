package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.AppConfig;
import com.project.Project;

@RestController
public class ProjectRegisterController {
    @RequestMapping(value="project/register", consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResultCode registProject(@RequestBody Project request) {
        //TODO-リポジトリクラスを分離
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MongoTemplate mongoTemplate = ctx.getBean(MongoTemplate.class);
        
        mongoTemplate.insert(request);
        return new ResultCode();
    }

}
