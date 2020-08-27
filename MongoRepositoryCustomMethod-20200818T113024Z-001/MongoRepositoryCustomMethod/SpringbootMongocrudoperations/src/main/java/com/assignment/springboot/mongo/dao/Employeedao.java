package com.assignment.springboot.mongo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assignment.springboot.mongo.model.Employee;

@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {

	List<Employee> findByLastName(String lastname);
}