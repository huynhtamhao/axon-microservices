package com.springbank.user.cmd;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/commandAPITest")
public class TestCommandApiController {
    @GetMapping
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Turn on Command API thành công", HttpStatus.OK);
    }
}
