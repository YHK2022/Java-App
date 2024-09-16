package tz.go.jsc.jscconfigurationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class JscConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JscConfigurationServiceApplication.class, args);
    }

}
