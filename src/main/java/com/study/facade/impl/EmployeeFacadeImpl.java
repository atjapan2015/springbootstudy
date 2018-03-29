package com.study.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.entity.Department;
import com.study.entity.Employee;
import com.study.facade.EmployeeFacade;
import com.study.service.DepartmentService;
import com.study.service.EmployeeService;

@Service
public class EmployeeFacadeImpl implements EmployeeFacade {

	@Autowired
	EmployeeService employeeService;

	@Autowired
	DepartmentService departmentService;

	@Override
	public Employee selectByPrimaryKey(Short id) {

		Employee e = employeeService.selectByPrimaryKey(id);

		return e;
	}

	@Override
	public Department selectDepartmentByPrimaryKey(Short id) {

		return departmentService.selectByPrimaryKey(id);
	}

}
