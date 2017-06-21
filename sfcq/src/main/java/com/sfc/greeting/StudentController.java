package com.sfc.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sfc.entity.Student;
import com.sfc.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	/*@RequestMapping("/findbyemail")
	public Student findStudentByEmail(String email){
		return studentService.findStudentByEmail(email);
	}*/
	
		
	@RequestMapping("/save")
	public Student saveStudent(@RequestParam("name") String name){
		Student s = new Student();
		s.setFirstName(name);
		return studentService.saveStudent(s);
	}
	
	@RequestMapping("/findbyid")
	public Student findStudentById(Integer id){
		return studentService.findStudentById(id);
	}
	
	@RequestMapping("/delete")
	public Student deleteStudent(Integer id){		
		return studentService.deleteStudent(id);
	}
	
	@RequestMapping("/update")
	public Student updateStudent(Integer id,Student st){		
		return studentService.deleteStudent(id);
	}
	
	
	

}
