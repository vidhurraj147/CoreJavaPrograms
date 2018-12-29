package com.tutorialspoint.designpattern.mvcdp;

public class StudentView {

	private Student student;
	
	public StudentView(Student student) {
		this.student = student;
	}
	
	public void printStudentDetails(){
		System.out.println("Student { name : "+student.getName()+ ", rollNo "+student.getRollNo());
		System.out.println("This is from toString() "+student.toString());
	}
	
	public void printStudentDetails(String name, String rollNo){
		System.out.println("WITH PARAMETERS --> Student { name : "+name+ ", rollNo "+rollNo);
	}
	
}
