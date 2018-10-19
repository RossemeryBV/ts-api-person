package com.jk.person.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	/*@Autowired
	private AuthenticationEntryPoint authEntryPoint;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
				.anyRequest().authenticated()
				.and().httpBasic()
				.authenticationEntryPoint(authEntryPoint);
	}*/
	
	 @Override
	 protected void configure(HttpSecurity http) throws Exception {
		 http
		 .authorizeRequests()
		 //.antMatchers(HttpMethod.POST, "/cliente/**").hasRole("ADMIN")
		 .antMatchers(HttpMethod.POST, "/cliente/**").hasRole("USER")
		 .antMatchers("/cliente/**").hasAnyRole("ADMIN","USER").and()
		 .httpBasic()
		 .and()
		 .csrf().disable();
	 }

	/*@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("jken123").password("b4nc0_c3ntRal").roles("USER");
	}*/
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.
		inMemoryAuthentication()
		.withUser("jken123").password("{noop}b4nc0_c3ntRal").roles("USER").and()
		.withUser("admin").password("{noop}b4nc0_c3ntRal").roles("USER","ADMIN");
	
	}

}