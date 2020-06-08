package com.thoughtworks.capability.gtb.alice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class AliceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AliceApplication.class, args);
  }

}
