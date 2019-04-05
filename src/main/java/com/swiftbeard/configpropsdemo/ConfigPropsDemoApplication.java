package com.swiftbeard.configpropsdemo;

import com.swiftbeard.configpropsdemo.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class ConfigPropsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigPropsDemoApplication.class, args);
    }

}
