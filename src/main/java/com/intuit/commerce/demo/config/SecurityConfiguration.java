package com.intuit.commerce.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(HttpMethod.GET,"/api/**")
                .hasAnyRole("ADMIN")
                .and()
                .formLogin()
                //.anyRequest()
                //.permitAll()
                .and()
                .httpBasic()
        ;
    }
    //in-memory auth
    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails admin = User.builder().username("admin").password(
                passwordEncoder().encode("admin")).roles("ADMIN").build();
        UserDetails user = User.builder().username("user").password(
                passwordEncoder().encode("user")).roles("USER").build();
        return new InMemoryUserDetailsManager(admin,user);
    }
}
