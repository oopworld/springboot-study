package com.example.ex01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex01ApplicationTests {//단위테스트하고싶은파일명 ~Test 

	@Test	//메서드명 위에 @Test=> 실제로 실행을 시켜서 작동하는지 확인
	void contextLoads() {
		System.out.println("단위테스트 연습중");
	}

}
