package com.kavin.GitHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitHubApplication {
	
	Message message= new Message();
	
	public static void main(String[] args) {
		SpringApplication.run(GitHubApplication.class, args);
	}
	
	public void print(){
		System.out.println(message.getMessage());
	}

}
