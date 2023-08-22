package com.kn.springwsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.ws.config.annotation.EnableWs;

@SpringBootApplication
@EnableWs
public class SpringwsdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringwsdemoApplication.class, args);
    }

}
