package com.neha.classes;

public class StudentProject {
	private String projectname;
	private String language;
	private String database;
	private int member;
	
	
	
	public StudentProject()
	{
		projectname="";
		language="";
		database="";
		member=0;
	}
	public StudentProject(String projectname, String language, String database, int member) {
		super();//This calls the constructor of the parent class.but our class doesn't explicitly extend another class:
//		but every Java class implicitly extends Object. eg,public class StudentProject extends Object
		this.projectname = projectname;
		this.language = language;
		this.database = database;
		this.member = member;
	}
	 


// set values to data members using setters 
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setDatabase(String database) {
		this.database = database;
	}

	public void setMember(int member) {
		this.member = member;
	}

	
	//get value using getter
	public String getProjectname() {
		return projectname;
	}

	public String getLanguage() {
		return language;
	}

	public String getDatabase() {
		
		return database;
	}

	public int getMember() {
		return member;
	}
	@Override
	public String toString() {
		return "StudentProject [projectname=" + projectname + ", language=" + language + ", database=" + database
				+ ", member=" + member + "]";
	}

	

	
}
