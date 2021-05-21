package com.springbank.user;

import com.springbank.user.core.configuration.AxonConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@Import({AxonConfig.class})
@EnableAuthorizationServer
public class APIApplication {

    public static void main(String[] args) {
        SpringApplication.run(APIApplication.class, args);
    }

}
