package com.prazjain.awscodepipelinespringhello.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello() throws UnknownHostException {
        return "Hello from " + InetAddress.getLocalHost().getHostName();
    }

    @GetMapping("/health")
    public ResponseEntity<?> health(){
        return ResponseEntity.ok("App is healthy.");
    }
}
