package com.example.mongo;

import com.example.mongo.models.User;
import com.example.mongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class MongoApplication{
//public class MongoApplication implements CommandLineRunner {

//	private final UserRepository userRepository;
//
//	@Autowired
//	public MongoApplication (UserRepository userRepository){
//		this.userRepository = userRepository;
//
//	}

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//
//		if (userRepository.findAll().isEmpty()) {
//			userRepository.save(new User("1", "bhavesh", "kadam"));
//			userRepository.save(new User("2", "hrishi", "shedge"));
//		}
//
//		for(User user : userRepository.findAll()){
//			System.out.println(user);
//		}
//	}
}
