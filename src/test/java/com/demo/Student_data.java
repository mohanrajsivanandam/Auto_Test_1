package com.demo;

public class Student_data extends Utility_FIle{
	public static void main(String[] args) {
		student_name("Mohan");//reusable methods
		student_age(17);//reusable methods
		student_marks(99);
		//can call as many times you want.
		student_name("Stark");//reusable methods
		student_age(21);
		student_marks(100);
	}
}
