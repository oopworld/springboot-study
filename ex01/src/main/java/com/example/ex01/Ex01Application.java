package com.example.ex01;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//스프링의 기본설정에 대한 어노테이션 
//서버가 내장되어 있다.
//스프링부트 구동시점에 특정한 메서드를 호출해서 특정 구문을 실행 
// => CommandLineRunner 인터페이스를 상속 
@SpringBootApplication
public class Ex01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Ex01Application.class, args);
		System.out.println("Hello Spring Boot1!");
	}

	//시작점
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Spring Boot2!");
		//내부적인 처리 객체를 확인
		for(String arg:args) {
			System.out.println("args=>"+arg);
			
		}
		
	}
}
