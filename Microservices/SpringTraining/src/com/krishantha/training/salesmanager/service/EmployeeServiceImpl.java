package com.krishantha.training.salesmanager.service;

import com.krishantha.training.salesmanager.repository.EmployeeRepository;
import com.krishantha.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

import java.util.List;

import com.krishantha.training.salesmanager.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}


	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}


	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.getAllEmployees();
		
	}

}
