package com.example.demo.Roadmaps;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roadmaps")
public class Roadmap {
	
	 @Id
	 private String id;
	 private String title;
	 private String description;
	 private String href;
	
	 public Roadmap() {
	 }
	
	 public Roadmap(String title, String description, String href) {
	     this.title = title;
	     this.description = description;
	     this.href = href;
	 }
	
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
	
	 public String getDescription() {
	     return description;
	 }
	
	 public void setDescription(String description) {
	     this.description = description;
	 }
	
	 public String getHref() {
	     return href;
	 }
	
	 public void setHref(String href) {
	     this.href = href;
	 }
}
