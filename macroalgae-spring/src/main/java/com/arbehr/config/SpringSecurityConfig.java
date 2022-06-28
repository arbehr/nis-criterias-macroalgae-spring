package com.arbehr.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;  
 
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)  
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
            .csrf().disable().antMatcher("/**")  
            .authorizeRequests()  
            .antMatchers("/", "/api/macroalgae*/**").permitAll()  
            .anyRequest().authenticated()
            .and()
            .httpBasic();
    }
}
