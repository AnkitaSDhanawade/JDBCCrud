package com.map;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	private int pId;
	private String projectName;
	@ManyToMany(mappedBy = "projects")
	private List<Emp> employees;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Emp> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Emp> employees) {
		this.employees = employees;
	}
	public Project(int pId, String projectName, List<Emp> employees) {
		super();
		this.pId = pId;
		this.projectName = projectName;
		this.employees = employees;
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
