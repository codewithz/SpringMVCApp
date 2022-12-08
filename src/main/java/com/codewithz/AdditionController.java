package com.codewithz;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	
	@RequestMapping(value="/add",method = RequestMethod.GET)
	public ModelAndView add(@RequestParam int num1,@RequestParam int num2) {
		
		int addition=num1+num2;
		System.out.println(addition);
		ModelAndView mv=new ModelAndView("addition");
		mv.addObject("result",addition);
		
		return mv;
		
	}

}
