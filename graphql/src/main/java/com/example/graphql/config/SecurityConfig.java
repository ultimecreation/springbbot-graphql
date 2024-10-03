package com.example.graphql.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import
// org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import
// org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

// // @Configuration
// public class SecurityConfig {

// @Bean
// public SecurityFilterChain securityFilterChain(HttpSecurity http) throws
// Exception {
// return http
// .csrf(csrf -> csrf.disable())
// .authorizeHttpRequests(auth -> auth
// .requestMatchers("/**").permitAll()
// .requestMatchers("/h2-console/**").permitAll()
// .requestMatchers("/store/**").permitAll()
// .requestMatchers("/auth/login").permitAll()
// .requestMatchers("/auth/register").permitAll()
// .anyRequest().authenticated())
// .sessionManagement(session ->
// session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
// .build();
// }

// @Bean
// public WebSecurityCustomizer webSecurityCustomizer() {
// return (web) -> web.ignoring().requestMatchers(new
// AntPathRequestMatcher("/h2-console/**"));
// }

// }
