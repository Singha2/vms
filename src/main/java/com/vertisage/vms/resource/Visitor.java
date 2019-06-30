package com.vertisage.vms.resource;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("api/v1/visitor")
public class Visitor {

    private MongoTemplate mongoTemplate;

    public Visitor(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }

    @RequestMapping(
            path = "/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Collection<com.vertisage.vms.domain.Visitor> getVisitor(){
        Collection<com.vertisage.vms.domain.Visitor> visitors
                = this.mongoTemplate.findAll(com.vertisage.vms.domain.Visitor.class);
        return visitors;
    }

    @PostMapping
    public void createVisitor(@RequestBody com.vertisage.vms.domain.Visitor newVisitor){
            this.mongoTemplate.insert(newVisitor);
    }
}
