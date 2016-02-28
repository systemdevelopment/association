package com.project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectResearchController {
        @RequestMapping(value="/project/search", consumes=MediaType.APPLICATION_JSON_VALUE)
        public Project findByProject(@RequestBody UserDTO request) {
            //TODO-リポジトリクラスを分離
            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
            MongoTemplate mongoTemplate = ctx.getBean(MongoTemplate.class);

            Query query = new Query(Criteria.where("userID").is(request.getUserID()));
            Project project = mongoTemplate.findOne(query, Project.class);
            
            return project;
        }
}
