package com.assignment.springboot.mongo.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.springboot.mongo.model.Employee;
import com.assignment.springboot.mongo.service.Employeeservice;

@RestController
@RequestMapping(value = "/api/mongo/emp")
public class Employeecontroller {

	@Autowired
	Employeeservice employeeService;

	@PostMapping(value = "/create")
	public String create(@RequestBody List<Employee> emp) {

		employeeService.createEmployee(emp);
		return "Employee records created.";
	}

	@GetMapping(value = "/getall")
	public Collection<Employee> getAll() {

		return employeeService.getAllEmployees();
	}
	
	@GetMapping(value = "/getbyLastName/{name}")
	public List<Employee> getByName(@PathVariable(value="name")String name) {

		return employeeService.getEmployeeByLastName(name);
	}


	@GetMapping(value = "/getbyid/{employee-id}")
	public Optional<Employee> getById(@PathVariable(value = "employee-id") int id) {

		return employeeService.findEmployeeById(id);
	}

	@PutMapping(value = "/update/{employee-id}")
	public String update(@PathVariable(value = "employee-id") int id, @RequestBody Employee e) {
		e.setId(id);
		employeeService.updateEmployee(e);
		return "Employee record for employee-id= " + id + " updated.";
	}

	@DeleteMapping(value = "/delete/{employee-id}")
	public String delete(@PathVariable(value = "employee-id") int id) {
		employeeService.deleteEmployeeById(id);
		return "Employee record for employee-id= " + id + " deleted.";
	}

	@DeleteMapping(value = "/deleteall")
	public String deleteAll() {
		employeeService.deleteAllEmployees();
		return "All employee records deleted.";
	}
}