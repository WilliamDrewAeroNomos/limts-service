package com.governmentcio.condor.limitsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableHystrix
public class LimitsServiceApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(LimitsServiceApplication.class, args);

		// for (String name : applicationContext.getBeanDefinitionNames()) {
		// System.out.print(name);
		// }
	}
}