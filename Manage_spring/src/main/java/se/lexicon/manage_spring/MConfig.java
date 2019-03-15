package se.lexicon.manage_spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration 
@ComponentScan("se.lexicon.manage_spring")
public class MConfig {
	
	@Bean
	public Scanner scan() {
		return new Scanner(System.in);
	}
}
