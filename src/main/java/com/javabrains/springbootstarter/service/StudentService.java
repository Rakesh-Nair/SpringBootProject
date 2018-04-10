package com.javabrains.springbootstarter.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import com.javabrains.springbootstarter.beans.Student;

@Service
public class StudentService {
	
	private List<Student> studentList = Arrays.asList(
			
			new Student("1","Luffy","Pirate King","A"),
			new Student("2","Zoro","Pirate Hunter","B"),
			new Student("3","Nami","Cat Burglar","C"),
			new Student("4","Usopp","Sniper King","D"),
			new Student("5","Sanji","Black Leg","E")
			);
	
	public List<Student> getAllStudents(){
		
		return studentList;
	}
	
	public Student getStudent(String id){
		return studentList.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

}
