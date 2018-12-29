package com.tutorialspoint.designpattern.mvcdp;

public class StudentController {
	
	private Student model;
	private StudentView view;
	
	public StudentController(Student student, StudentView view) {
		this.model = student;
		this.view = view;
	}
	
	public void setStudentName(String name){
		model.setName(name);
	}
	
	public String getStudentName(){
		return model.getName();
	}
	
	public void setStudentRollNo(String rollNo){
		model.setRollNo(rollNo);
	}
	
	public String getStudentRollNo(){
		return model.getRollNo();
	}
	
	public void updateView(){
		view.printStudentDetails();
		view.printStudentDetails(getStudentName(), getStudentRollNo());
	}

}
