package com.pugb.pugb.config;

import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class Oauth2ClientAutoConfiguration extends WebSecurityEnablerConfiguration{
	
	protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
         .anyRequest().authenticated()
         .and()
         .oauth2Login();
    }
}
