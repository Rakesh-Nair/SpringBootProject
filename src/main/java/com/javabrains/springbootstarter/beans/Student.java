package com.javabrains.springbootstarter.beans;

public class Student {
	
	private String id;
	private String name;
	private String project;
	private String grade;
	
	
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param id
	 * @param name
	 * @param project
	 * @param grade
	 */
	public Student(String id, String name, String project, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.project = project;
		this.grade = grade;
	}


	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}


	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}


	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}


	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	

}
