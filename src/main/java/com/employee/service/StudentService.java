package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.Entity.Student;

public interface StudentService {
	
	public Student saveStudent(Student std);
	
	public List<Student> getAllStudent();
	
	public Optional<Student> getStudentById(Integer Id);

	public void deleteStudentById(Integer Id);
	
	// public List<Student> deleteStdById(Integer Id);
	
	
}
