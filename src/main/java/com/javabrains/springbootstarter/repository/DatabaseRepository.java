package com.javabrains.springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.javabrains.springbootstarter.beans.Student;

public interface DatabaseRepository extends CrudRepository<Student,String> {
	
	

}
