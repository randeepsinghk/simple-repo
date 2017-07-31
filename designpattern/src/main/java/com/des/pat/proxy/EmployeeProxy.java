package com.des.pat.proxy;

public class EmployeeProxy implements EmpService {
	
	private boolean lazyLoading = false;
	
	public EmployeeProxy(boolean lazyLoading){
		this.lazyLoading=lazyLoading;
	}

	public Employee getEmp(Integer id) {
		Employee e = null;
		if (lazyLoading) {
			e = new Employee();
			e.setId(1);
		}else{
			EmpServiceImpl s = new EmpServiceImpl();
			e=s.getEmp(1);
		}
		

		return e;
	}

}
