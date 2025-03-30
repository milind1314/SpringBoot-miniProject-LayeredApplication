package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cnfg/applicationContext.xml")
//@ComponentScan(basePackages = "com.nt")
public class BootProj02DesignPatternVehicleEngineApplication {

  

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02DesignPatternVehicleEngineApplication.class, args);) {
			
			Vehicle travel = ctx.getBean("vehicle",Vehicle.class);
			
			travel.journey("Hyderabad", "Pune");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
