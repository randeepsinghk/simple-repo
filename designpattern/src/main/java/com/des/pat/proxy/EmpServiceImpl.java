package com.des.pat.proxy;

public class EmpServiceImpl implements EmpService{

	public Employee getEmp(Integer id) {
		Employee e = new Employee();
		e.setId(1);
		e.setFirstName("John");
		e.setLastName("Paul");
		e.setAddress("1234 Downtown,New York");
		return e;
	}
	

}
