package com.springbank.user.query.api.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/queryAPITest")
public class TestQueryApiController {
    @GetMapping
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Turn on Query API thành công", HttpStatus.OK);
    }
}
