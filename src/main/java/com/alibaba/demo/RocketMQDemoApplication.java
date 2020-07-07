package com.alibaba.demo;

import com.alibaba.demo.config.CustomBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding({CustomBinding.class})
public class RocketMQDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketMQDemoApplication.class, args);
    }
}
