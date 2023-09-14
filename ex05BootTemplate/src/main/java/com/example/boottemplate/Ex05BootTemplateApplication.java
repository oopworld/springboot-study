package com.example.boottemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//스프링에서 빈즈등록할 컨트롤러에 @Component로 했던것을 스프링부트에선 한꺼번에
@ComponentScan(basePackages= {"com.example.controller"}) //basePackages={경로포함 패키지명}
public class Ex05BootTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ex05BootTemplateApplication.class, args);
	}

}
