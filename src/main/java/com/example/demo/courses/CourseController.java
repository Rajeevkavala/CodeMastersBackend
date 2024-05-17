package com.example.demo.courses;

//CourseController.java

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "https://codemasters-edu.netlify.app/") // Adjust origin as per your frontend URL
public class CourseController {
private final CourseService courseService;

 public CourseController(CourseService courseService) {
     this.courseService = courseService;
 }

 @GetMapping
 public List<Course> getAllCourses() {
     return courseService.getAllCourses();
 }

 @PostMapping
 public Course saveCourse(@RequestBody Course course) {
     return courseService.saveCourse(course);
 }

 // Other endpoints as needed
}
