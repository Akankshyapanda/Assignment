package com.dxc.login.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.login.entity.Course;
import com.dxc.login.service.CourseService;

/**
 * @author anant
 *
 */
@RestController
public class CourseController {
	@Autowired
	private CourseService service;

	
	@GetMapping("/courses")
	public List<Course> list() {
		return service.listAll();
	}

	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> get(@PathVariable int id) {
		try {
			Course course = service.get(id);
			return new ResponseEntity<Course>(course, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Course>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public void add(@RequestBody Course course) {
		service.save(course);
	}

	@PutMapping("/update")
	public String update(@RequestBody Course updateCourse) {
		try {
			// if the course already exists, update it
			Course course = service.get(updateCourse.getId());
			service.save(updateCourse);
			return "course updated";
		} catch (NoSuchElementException e) {
			return "Not a valid course id";
		}
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		try {
			 service.get(id);
			service.delete(id);
			return "deleted";
		} catch (NoSuchElementException e) {
			return "Not a valid course id";
		}
	}
	
	
}