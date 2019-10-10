package com.albertorosario.springboot_microservices.gatewayservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
  @Bean
  public UserDetailsService userDetailsService() throws Exception {
    InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    manager.createUser(User.withUsername("albertolaley").password("{noop}welcome1")
            .roles("USER").build());
    return manager;
  }
//  @Override
//  protected void configure(HttpSecurity httpSecurity) throws Exception {
//    httpSecurity
//            .csrf().disable()
//            .authorizeRequests().antMatchers("*").hasRole("USER")
//            .anyRequest().authenticated()
//            .and().httpBasic();
//    httpSecurity.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//  }
//
//  @Autowired
//  public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//    auth.inMemoryAuthentication().withUser("albertolaley").password("welcome1").roles("USER");
//  }
}
