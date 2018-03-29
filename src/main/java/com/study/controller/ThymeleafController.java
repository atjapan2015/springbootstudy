package com.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.entity.Department;
import com.study.entity.Employee;
import com.study.facade.EmployeeFacade;

@Controller
@RequestMapping("/demo")
public class ThymeleafController {

	@Autowired
	EmployeeFacade employeeFacade;

	@RequestMapping("/employee/{id}")
	public String employee(@PathVariable("id") Short id, Model model) {

		Employee e = employeeFacade.selectByPrimaryKey(id);

		model.addAttribute("e", e);

		return "/employee";
	}

	@RequestMapping("/department/{id}")
	public String department(@PathVariable("id") Short id, Model model) {

		Department d = employeeFacade.selectDepartmentByPrimaryKey(id);

		model.addAttribute("d", d);

		return "/department";
	}
}
