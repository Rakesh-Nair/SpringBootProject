package com.javabrains.springbootstarter.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javabrains.springbootstarter.beans.Student;
import com.javabrains.springbootstarter.service.StudentService;

@RestController
public class HelloController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/Students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
				
	}
	
	@RequestMapping("/Students/{id}")
	public Student getStudent(@PathVariable String id){
		
		return studentService.getStudent(id);
	}

	@RequestMapping(method=RequestMethod.POST,value="/Students")
	public void addStudent(@RequestBody Student student){
		studentService.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/Students/{id}")
	public void updateStudent(@RequestBody Student student,@PathVariable String id){
		studentService.updateStudent(student,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/Students/{id}")
	public void deleteStudent(@PathVariable String id){
		studentService.deleteStudent(id);
	}
}
