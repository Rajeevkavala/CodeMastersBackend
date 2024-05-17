package com.example.demo.courses;

//CourseRepository.java
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepo extends MongoRepository<Course, String> {
}
