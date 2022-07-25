package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmpRepsitory;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{
	@Autowired
	EmpRepsitory empRepo;

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee e1 = new Employee(1,"Rushi","Plvd");
		Employee e2 = new Employee(2,"Thor","HYd");
		
	empRepo.employee.addAll(Arrays.asList(e1,e2));
		
	}
	

}
