package com.java.taskmanager.dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.java.taskmanager.entities.Task;

public class TaskDTO {
	private Long id;
	private String title;
	private boolean completed;
	private Long categoryId;
	private String categoryName;
	private String date;
	
    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public TaskDTO() {

	}
	
	public TaskDTO(Long id, String title, boolean completed, Long categoryId, String categoryName, LocalDate date) {
		this.id = id;
		this.title = title;
		this.completed = completed;
		this.categoryId = categoryId;
		this.categoryName= categoryName; 
		this.date = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	public TaskDTO(Task task) {
		id = task.getId();
		title = task.getTitle();
		completed = task.isCompleted();
		categoryId = task.getCategory().getId();
		categoryName = task.getCategory().getName();
		date = task.getDate() != null ? task.getDate().format(FORMATTER) : null;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
