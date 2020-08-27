package com.assignment.springboot.mongo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.springboot.mongo.dao.Employeedao;
import com.assignment.springboot.mongo.model.Employee;

@Service
public class Employeeserviceimpl implements Employeeservice {

	@Autowired
	Employeedao employeeDao;

		@Override
	public void createEmployee(List<Employee> emp) {
		employeeDao.saveAll(emp);
	}

	@Override
	public Collection<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Optional<Employee> findEmployeeById(int id) {
		return employeeDao.findById(id);
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeDao.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		return employeeDao.save(emp);
	}

	@Override
	public void deleteAllEmployees() {
		employeeDao.deleteAll();
	}
}