package com.yeonew.readinggarden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class ReadingGardenApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingGardenApplication.class, args);
    }

}
