package com.employee.serviceimpl;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Entity.Student;
import com.employee.dao.StudentRepository;
import com.employee.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student saveStudent(Student std) {
		return studentRepository.save(std);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Optional<Student> getStudentById(Integer Id) {
		Optional<Student> std = studentRepository.findById(Id);
		return std;
	}

	@Override
	public void deleteStudentById(Integer Id) {
		studentRepository.deleteById(Id);
	}

	List<Student> list;

	/*
	 * @Override public List<Student> deleteStdById(Integer Id) { list=
	 * studentRepository.findAll(); for (Iterator<Student> iterator =
	 * list.iterator(); iterator.hasNext();) { Student student = iterator.next(); if
	 * (student.getStdId() == Id) { iterator.remove(); } } return list; }
	 */

	
}
