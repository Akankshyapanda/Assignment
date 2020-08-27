package com.dxc.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.login.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {	
	
}