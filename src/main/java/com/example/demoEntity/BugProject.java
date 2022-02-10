package com.example.demoEntity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "Bugproject_details")
public class BugProject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer project_id;
	@NotNull
	private String name;
	@NotNull
	private String description;
	@NotNull
	private String Created_date;
	@NotNull
	private String Completion_date;
	
	@OneToMany(mappedBy = "bugproject")
	private List<Bug>bug;
	public BugProject(Integer project_id, String name, String description, String created_date,
			String completion_date) {
		super();
		this.project_id = project_id;
		this.name = name;
		this.description = description;
		Created_date = created_date;
		Completion_date = completion_date;
	}
	public Integer getProject_id() {
		return project_id;
	}
	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(String created_date) {
		Created_date = created_date;
	}
	public String getCompletion_date() {
		return Completion_date;
	}
	public void setCompletion_date(String completion_date) {
		Completion_date = completion_date;
	}
	
}
