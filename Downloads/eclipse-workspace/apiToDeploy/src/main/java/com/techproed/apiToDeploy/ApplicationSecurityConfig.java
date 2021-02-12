package com.techproed.apiToDeploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter{
	
	private final PasswordConfig passwordEncoder;
	@Autowired
	public ApplicationSecurityConfig(PasswordConfig passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.
			csrf().disable().
			authorizeRequests().
			antMatchers("/", "index", "/css/*", "/js/*").permitAll().
			antMatchers("/api/**").hasRole(ApplicationUserRoles.STUDENT.name()).//Role-Based Auth
			antMatchers(HttpMethod.POST, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
			antMatchers(HttpMethod.PUT, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
			antMatchers(HttpMethod.DELETE, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
			antMatchers(HttpMethod.PATCH, "/management/api/**").hasAuthority(ApplicationUserPermissions.TEACHER_WRITE.name()).
			antMatchers(HttpMethod.GET, "/management/api/**").hasRole(ApplicationUserRoles.TEACHER.name()).
			anyRequest().
			authenticated().
			and().
			httpBasic();//For Basic Authentication
		
	}

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		
		UserDetails suleyman = User.
									builder().
									username("salptekin").
									password(passwordEncoder.passwordEncoder().encode("password12")).
									//roles(ApplicationUserRoles.STUDENT.name()).
									authorities(ApplicationUserRoles.STUDENT.getGrantedAuthorities()).//Permission-Based Auth
									build();
		
		UserDetails teacher = User.
									builder().
									username("teacher").
									password(passwordEncoder.passwordEncoder().encode("password1234")).
									//roles(ApplicationUserRoles.TEACHER.name()).
									authorities(ApplicationUserRoles.TEACHER.getGrantedAuthorities()).//Permission-Based Auth
									build();
		
		return new InMemoryUserDetailsManager(suleyman, teacher);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
