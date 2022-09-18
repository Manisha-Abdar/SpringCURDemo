package com.employee.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.Entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Serializable>{

}
