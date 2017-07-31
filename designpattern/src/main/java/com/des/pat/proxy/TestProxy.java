package com.des.pat.proxy;

public class TestProxy {

	public static void main(String[] args) {
		test();
	}

	private static void test() {
	EmpService e = new EmployeeProxy(true);
	Employee emp=e.getEmp(1);
	System.out.println(emp);		
	e = new EmployeeProxy(false);
	 emp=e.getEmp(1);
	System.out.println(emp);
	}

}
