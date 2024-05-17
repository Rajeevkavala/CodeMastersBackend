package com.example.demo.courses;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
private final CourseRepo courseRepository;

 public CourseService(CourseRepo courseRepository) {
     this.courseRepository = courseRepository;
 }

 public List<Course> getAllCourses() {
     return courseRepository.findAll();
 }

 public Course saveCourse(Course course) {
     return courseRepository.save(course);
 }

 // Other methods as needed
}
