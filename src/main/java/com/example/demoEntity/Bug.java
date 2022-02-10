package com.example.demoEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table (name= "Bug_details")
public class Bug {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private String email_address;
	@NotNull
	private String owner;
	@NotNull
	private String priority;
	@NotNull
	private String status;
	@NotNull
	private String owner_project;
	@NotNull
	private String start_date;
	@NotNull
	private String completion_date;
	@NotNull
	private String description;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="bug_idfk", referencedColumnName = "project_id")
	private BugProject bugproject;
	
	public Bug(Integer id, String email_address, String owner, String priority, String status, String owner_project,
			String start_date, String completion_date, String description) {
		super();
		this.id = id;
		this.email_address = email_address;
		this.owner = owner;
		this.priority = priority;
		this.status = status;
		this.owner_project = owner_project;
		this.start_date = start_date;
		this.completion_date = completion_date;
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getOwner_project() {
		return owner_project;
	}
	public void setOwner_project(String owner_project) {
		this.owner_project = owner_project;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getCompletion_date() {
		return completion_date;
	}
	public void setCompletion_date(String completion_date) {
		this.completion_date = completion_date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
