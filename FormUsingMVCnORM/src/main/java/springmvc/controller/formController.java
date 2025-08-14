package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.Student;
import springmvc.service.StudentService;


@Controller
public class formController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
    //3rd way-
	@RequestMapping(path="/processform",method =RequestMethod.POST)
	public String handleData(@ModelAttribute Student user,Model model) 
	{
		studentService.createStudent(user);
		System.out.println(user);//to check Student k object m data aagya
		System.out.println("form works!");
		return "show";
	}
	
	//to show common line-
	@ModelAttribute
	public void CommonLines(Model model) {
		LocalDateTime localDateTime=LocalDateTime.now();
		model.addAttribute("first","Form Data:");
		model.addAttribute("second",localDateTime);
	}
}
