package com.mou.tcs.SpringSecurityProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfigurer extends WebSecurityConfigurerAdapter {

	@Autowired
	private MyUserDetailsService userDetailsService;

	public void configure(AuthenticationManagerBuilder auth) {
		try {
			auth.userDetailsService(userDetailsService);

			
			/*
			 * auth.inMemoryAuthentication() .withUser("mou") .password("mou")
			 * .roles("USER") .and().withUser("blah") .password("blah") .roles("ADMIN");
			 */
			 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void configure(HttpSecurity security) {

		try {
			
			security.authorizeRequests(
					).antMatchers("/admin")
			         .hasRole("ADMIN")
			         .antMatchers("/user")
					 .hasAnyRole("ADMIN", "USER").and().formLogin();

			// security.authorizeRequests().anyRequest().permitAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Bean
	public PasswordEncoder passEncoder() {
		return NoOpPasswordEncoder.getInstance();

	}

}
