package com.demo.unan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // jpa Auditing 활성화
@SpringBootApplication
public class UnanApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnanApplication.class, args);
    }

}
