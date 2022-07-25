package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmpRepsitory {
	public List<Employee> employee = new ArrayList<Employee>();

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return employee;
	}

	public String add(Employee em) {
		employee.add(em);
		return "Succesfully Added";
	}

	public String edit(Employee em) {
		employee.stream().filter(e->e.getEmployeeId() == em.getEmployeeId()).forEach(e->{
			e.setAddress(em.getAddress());
			e.setName(em.getName());
		});
		return "Succesfully Updated";
	}

	public String delete(int empNo) {
		employee.remove(empNo-1);
		return "Deleted";
	}

	

}
