package com.thoughtworks.capability.gtb.bob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class BobApplication {

  public static void main(String[] args) {
    SpringApplication.run(BobApplication.class, args);
  }
}