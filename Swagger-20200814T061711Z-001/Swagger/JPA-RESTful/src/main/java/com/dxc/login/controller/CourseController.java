package com.dxc.login.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.login.entity.Course;
import com.dxc.login.service.CourseService;

import io.swagger.annotations.*;


//Class Level Comment
/************************************************************************************
 *          @author          Raghu
 *          Description      It is a Controller class that provides the Handler 
 *          methods for adding new course, 
                                         
  *         Version             1.0
  *         Created Date    13-Aug-2020
 ************************************************************************************/

@Api(value = "Swagger2DemoRestController")
@RestController
public class CourseController {
	@Autowired
	private CourseService service;

	@ApiOperation(value = "Get list of courses in the System ", response = Iterable.class, tags = "getCourses")
	@ApiResponses(value = { 
	            @ApiResponse(code = 200, message = "Success|OK"),
	            @ApiResponse(code = 401, message = "not authorized!"), 
	            @ApiResponse(code = 403, message = "forbidden!!!"),
	            @ApiResponse(code = 404, message = "not found!!!") })
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> list() {
		return new ResponseEntity<List<Course>>(service.listAll(),HttpStatus.OK);
	}

	//Method Level Comment
	/************************************************************************************
	  * Method: getCourseById
	  *Description: To get the details of course by it id.
	 
	  * @returns Course                - returns course by its id
	  * @throws NoSuchElementException - if no such id found
	  *Created By                      - Author Name
	  *Created Date                    - 13-Aug-2020                           
	  
	  ************************************************************************************/

	
	@GetMapping("/courses/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable int id) {
		try {
			Course course = service.get(id);
			return new ResponseEntity<Course>(course, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Course>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/add")
	public ResponseEntity<String> add(@RequestBody Course course) {
		service.save(course);
		return new ResponseEntity<String>("Course Added Successfylly.",HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<String> update(@RequestBody Course updateCourse) {
		try {
			// if the course already exists, update it
			Course course = service.get(updateCourse.getId());
			service.save(updateCourse);
			return new ResponseEntity<String>("course updated",HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<String>("Not a valid course id", HttpStatus.NOT_FOUND);
		}
	}
	
	
}