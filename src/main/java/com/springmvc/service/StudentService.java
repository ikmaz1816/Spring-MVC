package com.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.entity.Student;
import com.springmvc.interfaces.StudentServiceInterface;
import com.springmvc.repository.StudentRepository;

@Service
public class StudentService implements StudentServiceInterface{
	
	@Autowired
	private StudentRepository studentRepository;

	@Transactional
	@Override
	public boolean addStudent(Student s) {
		return studentRepository.addStudent(s);
	}

	@Transactional
	@Override
	public boolean updateStudent(Student s) {
		return studentRepository.updateStudent(s);
	}

	@Transactional
	@Override
	public boolean deleteStudent(Student s) {
		return studentRepository.deleteStudent(s);
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepository.getStudentById(id);
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.getStudents();
	}
	
	
}
