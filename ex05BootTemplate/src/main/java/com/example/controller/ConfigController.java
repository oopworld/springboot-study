package com.example.controller;

import java.util.ArrayList;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.BoardTO;

//@Component 스프링에선 이렇게 썼으나, 스프링부트에선 다름. EX05BootTemplateApplication클래스에서 @ComponentScan사용
@RestController
public class ConfigController {
	//    /
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");// /templates/index.html
	}
	//    /view1.do 
	@RequestMapping("/view1.do")
	public ModelAndView view1() {
		return new ModelAndView("view1");// /templates/view1.html
	}
	//    /view2.do
	@RequestMapping("/view2.do")
	public ModelAndView view2() {
		BoardTO to=new BoardTO();
		to.setSeq("10");
		to.setSubject("제목 10");
		
		ArrayList<BoardTO> lists=new ArrayList<>();
		BoardTO to2=new BoardTO();
		to2.setSeq("20");
		to2.setSubject("제목 20");
		
		BoardTO to3=new BoardTO();
		to3.setSeq("30");
		to3.setSubject("제목 30");
		
		lists.add(to2);
		lists.add(to3);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("view2");
		modelAndView.addObject("data1","값1");// jsp의 경우엔 ${data1} 이렇게 받을것이다 
		modelAndView.addObject("to",to);
		modelAndView.addObject("lists",lists);
		
		return modelAndView;
	}
}
