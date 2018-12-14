package com.oauth.google.rest;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AuthRestController {
    
    @RequestMapping("/contacts")
    public String index() {
        return "Getting contacts related to the google accont!";
    }
    
}
