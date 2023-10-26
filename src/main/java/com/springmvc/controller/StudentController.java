package com.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entity.Student;
import com.springmvc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		List<Student> list=this.studentService.getStudents();
		m.addAttribute("students", list);
		return "home";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String register(@ModelAttribute("student")Student s)
	{
		studentService.addStudent(s);
		return "redirect:/home";
	}
	@RequestMapping("/addstudent")
	public String addStudent(Model m)
	{
		Student s=new Student();
		m.addAttribute("student", s);
		return "addstudent";
	}
	
}
