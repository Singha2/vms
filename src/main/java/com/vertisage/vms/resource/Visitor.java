package com.vertisage.vms.resource;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("api/v1/visitor")
public class Visitor {

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Map<String, String> getVisitor(){

        Map<String, String> visitor = new HashMap<>();
        visitor.put("firstName", "Amit");
        visitor.put("lastName", "Singh");
        visitor.put("mobileNumber", "9811005678");
        visitor.put("email", "amit.pccs@gmail.com");
        return visitor;
    }
}
