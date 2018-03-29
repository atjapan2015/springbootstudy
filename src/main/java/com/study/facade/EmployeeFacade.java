package com.study.facade;

import com.study.entity.Department;
import com.study.entity.Employee;

public interface EmployeeFacade {

	Employee selectByPrimaryKey(Short id);

	Department selectDepartmentByPrimaryKey(Short id);
}
