package com.zyb.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("\"Hello,git\" = " + "Hello,git");
        System.out.println("\"Hello,git\" = " + "Hello,git2");
        System.out.println("\"Hello,git\" = " + "Hello,git3");
        System.out.println("\"Hello,git\" = " + "Hello,git4,master");
        System.out.println("\"Hello,git\" = " + "Hello,github");
        System.out.println("\"Hello,git\" = " + "Hello,github ssh 222222222222222222");
        System.out.println("\"Hello,git\" = " + "Hello,github ssh pull");
         System.out.println("\"Hello,git\" = " + "Hello,github update");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
