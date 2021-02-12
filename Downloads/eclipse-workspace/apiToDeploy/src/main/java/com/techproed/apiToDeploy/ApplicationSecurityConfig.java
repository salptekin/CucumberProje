package com.techproed.apiToDeploy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
			authorizeRequests().
			antMatchers("/", "index", "/css/*", "/js/*").permitAll().
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
									roles("STUDENT").
									build();
		
		return new InMemoryUserDetailsManager(suleyman);
		
	}
	
	

}
