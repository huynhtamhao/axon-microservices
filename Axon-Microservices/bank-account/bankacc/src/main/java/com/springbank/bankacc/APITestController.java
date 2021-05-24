package com.springbank.bankacc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/bank-api-test")
public class APITestController {
    @GetMapping
    @PreAuthorize("hasAuthority('READ_PRIVILEGE')")
    public ResponseEntity<String> test() {
        return new ResponseEntity<>("Test call API thành công", HttpStatus.OK);
    }
}
