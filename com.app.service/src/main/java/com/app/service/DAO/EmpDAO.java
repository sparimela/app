package com.app.service.DAO;

import org.springframework.stereotype.Repository;

import com.app.domain.Emp;

@Repository
public class EmpDAO {

	public Emp getEmp(String empId){
		
		Emp emp = new Emp();
		emp.setEmployeeId("8");
		emp.setFirstName("Sri");
		emp.setLastName("Parimela");
		return emp;
		
	}
	
}
