package com.study.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.entity.Employee;
import com.study.facade.EmployeeFacade;

@RestController
@RequestMapping("/sample")
public class SampleController {

	@Autowired
	EmployeeFacade employeeFacade;

	@RequestMapping("/helloworld")
	public String helloworld() {
		return "Hello World!";
	}

	@RequestMapping("/employees")
	public List<Employee> listEmployee() {

		List<Employee> employees = new ArrayList<>();

		for (short i = 0; i < 2; i++) {
			Employee e = new Employee();
			e.setId(i);
			e.setFirstname("firstname" + i);
			e.setLastname("lastname" + i);

			employees.add(e);
		}

		return employees;
	}

	@RequestMapping("/employee/{id}")
	public Employee employee(@PathVariable("id") Short id) {

		Employee e = employeeFacade.selectByPrimaryKey(id);

		return e;
	}
}
