package com.example.demo.courses;

//Course.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "courses")
public class Course {
	 @Id
	 private String id;
	 private String title;
	 private String path;
	 private String icon;
	 private String description;

 public Course() {
	 
 	}

 public Course(String title, String path, String icon, String description) {
     this.title = title;
     this.path = path;
     this.icon = icon;
     this.description = description;
 }

 // Getters and setters
 public String getId() {
     return id;
 }

 public void setId(String id) {
     this.id = id;
 }

 public String getTitle() {
     return title;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public String getPath() {
     return path;
 }

 public void setPath(String path) {
     this.path = path;
 }

 public String getIcon() {
     return icon;
 }

 public void setIcon(String icon) {
     this.icon = icon;
 }

 public String getDescription() {
     return description;
 }

 public void setDescription(String description) {
     this.description = description;
 }
}

