package com.javabrains.springbootstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.javabrains.springbootstarter.beans.Student;
import com.javabrains.springbootstarter.repository.DatabaseRepository;

@Service
public class StudentService {
	
	@Autowired
	private DatabaseRepository databaseRepository;
	private List<Student> studentList;
	
	public List<Student> getAllStudents(){
		List<Student> studentList = new ArrayList<>();
		databaseRepository.findAll().forEach(studentList::add);
		return studentList;
	}
	
	public Student getStudent(String id){
		//return studentList.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return databaseRepository.findOne(id);
		
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
		//studentList.add(student);
		databaseRepository.save(student);
		
		
	}

	public void updateStudent(Student student, String id) {
		// TODO Auto-generated method stub
		
		/*for(int i=0; i< studentList.size();i++){
			
			Student s = studentList.get(i);
			
			if(s.getId().equals(id)){
				studentList.set(i,student);
				return;
			}
		}*/
		databaseRepository.save(student);
		
	}

	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		
		/*studentList.removeIf(t->t.getId().equals(id));*/
		databaseRepository.delete(id);
		
	}

}
