package com.zyb.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("\"Hello,git\" = " + "Hello,git");
        System.out.println("\"Hello,git\" = " + "Hello,git2");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}