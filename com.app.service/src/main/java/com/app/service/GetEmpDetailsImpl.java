package com.app.service;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.app.service.DAO.EmpDAO;


@Component("getEmpDetails")
public class GetEmpDetailsImpl implements GetEmpDetails{

@Autowired
private EmpDAO empDAO;
	
	public Response getEmpDetail(String employeeId) {
		
		if(StringUtils.isEmpty(employeeId)){
			return Response.status(Response.Status.BAD_REQUEST).build();
		}

		
		return  Response.ok(empDAO.getEmp(employeeId)).build();
	}

}
