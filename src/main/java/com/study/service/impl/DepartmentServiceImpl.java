package com.study.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.entity.Department;
import com.study.entity.DepartmentExample;
import com.study.mapper.DepartmentMapper;
import com.study.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentMapper departmentMapper;

	@Override
	public long countByExample(DepartmentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(DepartmentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByPrimaryKey(Short id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Department> selectByExample(DepartmentExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department selectByPrimaryKey(Short id) {

		return departmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(Department record, DepartmentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Department record, DepartmentExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
