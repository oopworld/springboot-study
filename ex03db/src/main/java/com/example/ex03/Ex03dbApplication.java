package com.example.ex03;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex03dbApplication implements CommandLineRunner {

	@Autowired
	private SqlSession sqlSession;
	
	public static void main(String[] args) {
		SpringApplication.run(Ex03dbApplication.class, args);
	}

	//초기화
	@Override
	public void run(String... args) throws Exception {	//동적배열 String... args
		// TODO Auto-generated method stub
		//DB연결 Mybatis->SqlSession
		System.out.println("sqlSession=>"+sqlSession);
		
		String result=sqlSession.selectOne("select");//객체 하나
		
		System.out.println("result=>"+result);
	}
}
