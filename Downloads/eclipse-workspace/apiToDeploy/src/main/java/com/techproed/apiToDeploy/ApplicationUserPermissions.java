package com.techproed.apiToDeploy;

public enum ApplicationUserPermissions {
	
	STUDENT_READ("student:read"),
	TEACHER_READ("teacher:read"),
	TEACHER_WRITE("teacher:write");
	
	private final String permission;

	private ApplicationUserPermissions(String permission) {
		this.permission = permission;
	}
	
	public String getPermission() {
		return permission;
	}
	
}
