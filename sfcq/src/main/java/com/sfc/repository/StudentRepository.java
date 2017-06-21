package com.sfc.repository;

import org.springframework.data.repository.CrudRepository;

import com.sfc.entity.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>{
	
//	@Query("")
//	public Student findStudentByEmail(String email);

}
