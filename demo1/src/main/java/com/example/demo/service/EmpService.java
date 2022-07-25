package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepsitory;
@Service
public class EmpService {
	@Autowired
	EmpRepsitory empRepsitory;

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empRepsitory.getAll();
	}

	public String add(Employee em) {
		// TODO Auto-generated method stub
		return empRepsitory.add(em);
	}

	public String edit(Employee em) {
		// TODO Auto-generated method stub
		return empRepsitory.edit(em);
	}

	public String delete(int empNo) {
		// TODO Auto-generated method stub
		return empRepsitory.delete(empNo);
	}

}
