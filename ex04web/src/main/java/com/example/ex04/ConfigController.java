package com.example.ex04;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller	//view를 반환
//@RestController  //json 형태(key:value)로 객체 데이터를 반환
public class ConfigController {	
	
	@RequestMapping("/hello1")
	@ResponseBody	//json형태로 객체 데이터를 반환시키기 위해 사용
	public ModelAndView hello1() {
		return new ModelAndView("hello1");//view 파일 
	}
}
