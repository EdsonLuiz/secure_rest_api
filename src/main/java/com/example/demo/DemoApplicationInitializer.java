package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.models.entities.User;
import com.example.demo.models.repositories.UserRepository;

@Configuration
public class DemoApplicationInitializer implements SmartInitializingSingleton {

	private final UserRepository users;
	private final PasswordEncoder passwordEncoder;
	
	
	public DemoApplicationInitializer(UserRepository users, PasswordEncoder passwordEncoder) {
		super();
		this.users = users;
		this.passwordEncoder = passwordEncoder;
	}



	@Override
	public void afterSingletonsInstantiated() {
		UUID edsonId = UUID.fromString("877665cc-87ba-4766-823b-b18dd27b24bc");
		UUID carolId = UUID.fromString("36505807-d180-4917-92db-a5515f229d67");
		
		User edson = new User(edsonId, "edson", this.passwordEncoder.encode("12345"));
		User carol = new User(carolId, "carol", this.passwordEncoder.encode("12345"));
		this.users.save(edson);
		this.users.save(carol);
	}

}
