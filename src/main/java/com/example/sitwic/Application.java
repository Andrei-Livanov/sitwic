package com.example.sitwic;

import com.example.sitwic.controller.MessageController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(MessageController.class, args);
    }
}
