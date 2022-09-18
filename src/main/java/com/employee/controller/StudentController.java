package com.employee.controller;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Entity.Student;
import com.employee.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	//private static final Logger logger = (Logger) LoggerFactory.getLogger(StudentController.class); //pass your class name

	// save data into database
	@RequestMapping("/save")
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student std) {
		//logger.info("In login service method");
		Student std1 = studentService.saveStudent(std);
		return ResponseEntity.ok().body(std1);
	}

	// get all data from database
	@RequestMapping("/all")
	@GetMapping
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> list = studentService.getAllStudent();
		return ResponseEntity.ok().body(list);
	}

	// get by id
	@RequestMapping("/get/{id}")
	@GetMapping
	public ResponseEntity<Optional<Student>> getStudentById(@PathVariable("id") Integer Id) {
		Optional<Student> list = studentService.getStudentById(Id);
		return ResponseEntity.ok().body(list);
	}

	// Delete data by id
	@RequestMapping("/delete/{id}")
	@DeleteMapping
	public void deleteById(@PathVariable("id") Integer Id) {
		studentService.deleteStudentById(Id);
	}

	/*
	 * // Delete data by id
	 * 
	 * @RequestMapping("/del/{id}")
	 * 
	 * @DeleteMapping public List<Student> deleteStdById(@PathVariable("id") Integer
	 * Id) { List<Student> list = studentService.deleteStdById(Id); return list; }
	 */
	
	// save data into database
	@RequestMapping("/update")
	@PutMapping
	public ResponseEntity<Student> updateStudent(@RequestBody Student std) {
		Student std1 = studentService.saveStudent(std);
		return ResponseEntity.ok().body(std1);
	}

}
