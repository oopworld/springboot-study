package com.example.ex03;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//xml 대신에 환경설정을 해주는 클래스로 만들어주는 어노테이션 
public class DatabaseConfiguration {

	@Autowired
	private ApplicationContext applicationContext;//환경설정xml 파일을 메모리에 올릴때 필요함 
		
	
	/*
	 * @Bean => 빈즈로 등록시켜주는 어노테이션
	 * 클래스의 자료형 메서드명(id 이름 대신) (매개변수(DataSource)){
	 * 		return new 클래스형();
	 * }
	 * 
	 */
	@Bean
	SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception{
		System.out.println("sqlSessionFactory()호출");
		SqlSessionFactoryBean sqlSessionFactoryBean=new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		//xml파일의 위치를 불러온다.
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/mapper.xml"));
		
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean
	SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		System.out.println("sqlSessionTemplate()호출됨 !!");
		
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
