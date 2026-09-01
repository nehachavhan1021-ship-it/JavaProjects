package com.neha.classes;

public class User04 {

	private String userId;
	private String password;
	private String Status;

	public String getStatus() {

		if (userId.equals("neha") && password.equals("makeit"))
			Status = "success";
		else
			Status = "failed";
		return Status;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
