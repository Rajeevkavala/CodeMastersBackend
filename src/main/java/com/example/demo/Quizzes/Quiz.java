package com.example.demo.Quizzes;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "quizzes")
public class Quiz {
	@Id
    private String id;
    private String title;
    private String iconClass;
    private String description;
    private String path;
    

	public Quiz() {
        // Default constructor required by Spring Data MongoDB
    }

    public Quiz(String title, String iconClass, String description,String path) {
        this.title = title;
        this.iconClass = iconClass;
        this.description = description;
        this.path = path;
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

    public String getIconClass() {
        return iconClass;
    }

    public void setIconClass(String iconClass) {
        this.iconClass = iconClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getPath() {
    	return path;
    }
    
    public void setPath(String path) {
    	this.path = path;
    }
}
