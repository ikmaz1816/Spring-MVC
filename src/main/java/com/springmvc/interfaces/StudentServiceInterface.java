package com.springmvc.interfaces;

import java.util.List;

import com.springmvc.entity.Student;


public interface StudentServiceInterface {
	
	boolean addStudent(Student s);
	
	boolean updateStudent(Student s);
	
	boolean deleteStudent(Student s);
	
	Student getStudentById(int id);
	
	List<Student> getStudents();
}
