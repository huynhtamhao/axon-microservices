package com.springbank.bankacc;

import com.springbank.bankacc.core.configuration.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@Import({AxonConfig.class})
@EnableAuthorizationServer
@EnableResourceServer
@EnableAutoConfiguration
@EntityScan(basePackages = "com.springbank.bankacc.core.models")
public class BankAccApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankAccApplication.class, args);
    }

}
