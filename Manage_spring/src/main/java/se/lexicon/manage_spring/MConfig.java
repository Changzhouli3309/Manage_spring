package se.lexicon.manage_spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import se.lexicon.manage_spring.util.ScannerInputService;
import se.lexicon.manage_spring.util.UserInputService;

@Configuration 
@ComponentScan("se.lexicon.manage_spring")
public class MConfig {
	
	@Bean
	public UserInputService scannerInputService() {
		ScannerInputService bean = new ScannerInputService();
		bean.setScan(scan());
		return bean;
	}
	
	@Bean
	public Scanner scan() {
		return new Scanner(System.in);
	}
}
