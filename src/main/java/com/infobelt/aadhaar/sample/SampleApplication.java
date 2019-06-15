package com.infobelt.aadhaar.sample;

import org.springframework.boot.SpringApplication;
import com.github.vanroy.springboot.autoconfigure.data.jest.ElasticsearchJestAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableWebMvc
@SpringBootApplication(exclude = ElasticsearchJestAutoConfiguration.class)
public class SampleApplication{
    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
