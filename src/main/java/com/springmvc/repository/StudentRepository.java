package com.springmvc.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springmvc.entity.Student;

@Repository
public class StudentRepository {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public boolean addStudent(Student s) {
		int count=(int)hibernateTemplate.save(s);
		if(count>0)
			return true;
		return false;
	}

	@Transactional
	public boolean updateStudent(Student s) {
		Student stud=hibernateTemplate.get(Student.class,s.getId());
		if(stud==null)
			return false;
		hibernateTemplate.saveOrUpdate(s);
		return true;
	}

	@Transactional
	public boolean deleteStudent(Student s) {
		Student stud=hibernateTemplate.get(Student.class,s.getId());
		if(stud==null)
			return false;
		hibernateTemplate.delete(s);
		return true;
	}

	public Student getStudentById(int id) {
		return this.hibernateTemplate.get(Student.class, id);
	}

	public List<Student> getStudents() {
		return this.hibernateTemplate.loadAll(Student.class);
	}
	
}
