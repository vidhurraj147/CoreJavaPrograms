package com.tutorialspoint.designpattern.mvcdp;

public class MVCPatternImpl {

	public static void main(String[] args) {
		Student student = new Student();
		StudentController studentController = new StudentController(student, new StudentView(student));
		studentController.setStudentName("Daniel");
		studentController.setStudentRollNo("123");
		
		System.out.println(studentController.getStudentName());
		studentController.updateView();
		
		StudentController studentController2 = new StudentController(student, new StudentView(student));
		studentController2.setStudentName("Daniel2");
		studentController2.setStudentRollNo("1232");
		
		System.out.println(studentController.getStudentName());
		studentController.updateView();
		
		studentController2.setStudentName("Rahul kadgekar");
		studentController.updateView();
	}

}
