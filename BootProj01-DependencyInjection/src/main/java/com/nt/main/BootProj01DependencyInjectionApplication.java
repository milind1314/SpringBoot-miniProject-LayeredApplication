package com.nt.main;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
@ComponentScan(basePackages="com.nt")
public class BootProj01DependencyInjectionApplication {

	public BootProj01DependencyInjectionApplication() {
		super();
		System.out.println("BootProj01DependencyInjectionApplication.DefaultConstructor()");
	}

	@Bean(name = "ld")
	public LocalDate createDate() {
		return LocalDate.now();
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
		SeasonFinder season = ctx.getBean("sf",SeasonFinder.class);
		
		System.out.println("Current season is : "+season.findSeason());
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
