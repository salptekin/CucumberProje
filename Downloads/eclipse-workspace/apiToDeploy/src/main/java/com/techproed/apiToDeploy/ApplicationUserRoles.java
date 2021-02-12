package com.techproed.apiToDeploy;

import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.google.common.collect.Sets;
import static com.techproed.apiToDeploy.ApplicationUserPermissions.*;

public enum ApplicationUserRoles {
	
	STUDENT(Sets.newHashSet(STUDENT_READ)),
	TEACHER(Sets.newHashSet(TEACHER_READ, TEACHER_WRITE));
	
	private final Set<ApplicationUserPermissions> permissions;

	private ApplicationUserRoles(Set<ApplicationUserPermissions> permissions) {
		this.permissions = permissions;
	}

	public Set<ApplicationUserPermissions> getPermissions() {
		return permissions;
	}
	
	public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
		
		Set<SimpleGrantedAuthority> permissions = getPermissions().
															stream().
															map(t -> new SimpleGrantedAuthority(t.getPermission())).
															collect(Collectors.toSet());
		permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));
		
		return permissions;
	}
	
	
	
	
}
