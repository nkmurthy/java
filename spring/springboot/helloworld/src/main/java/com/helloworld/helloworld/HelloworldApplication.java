package com.helloworld.helloworld;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(HelloworldApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("Hello world!....");
    System.out.println("Welcome to spring boot commandline application");

  }

}
