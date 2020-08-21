package dk.sunepoulsen.tech.enterprise.labs.authentication.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static dk.sunepoulsen.tech.enterprise.labs.core.service.utils.SpringBootApplicationUtils.COMPONENT_SCAN_PACKAGES;

@EnableWebMvc
@EnableAsync
@EnableAuthorizationServer
@SpringBootApplication( scanBasePackages = { COMPONENT_SCAN_PACKAGES } )
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run( Application.class, args );
    }
}
