package com.softura.healthcareapi;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;




@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)

public class HealthcareapiApplication  implements CommandLineRunner {

	private static Logger LOG = LoggerFactory
			.getLogger(HealthcareapiApplication.class);
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(HealthcareapiApplication.class);
		application.setBanner(new CustomBanner());
		application.run(args);
		//SpringApplication.run(HealthcareapiApplication.class, args);
	}
	@Override
	public void run(String... args) {
		System.out.println("EXECUTING : command line runner");

		for (int i = 0; i < args.length; ++i) {
			//System.out.println("args[{}]: {}", i, args[i]);
			System.out.println(i+args[i]);
		}
	}
}
