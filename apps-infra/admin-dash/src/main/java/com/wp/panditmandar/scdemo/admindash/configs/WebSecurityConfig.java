package com.wp.panditmandar.scdemo.admindash.configs;

import java.util.UUID;

import org.springframework.context.annotation.Bean;

import static org.springframework.security.config.Customizer.withDefaults;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import de.codecentric.boot.admin.server.config.AdminServerProperties;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

	private final AdminServerProperties adminServer;

	public WebSecurityConfig(AdminServerProperties adminServer) {
		this.adminServer = adminServer;
	}

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		SavedRequestAwareAuthenticationSuccessHandler successHandler = new SavedRequestAwareAuthenticationSuccessHandler();
		successHandler.setTargetUrlParameter("redirectTo");
		successHandler.setDefaultTargetUrl(this.adminServer.getContextPath() + "/");
        http.authorizeHttpRequests().antMatchers(this.adminServer.getContextPath() + "/assets/**").permitAll()
                .antMatchers(this.adminServer.getContextPath() + "/login").permitAll().anyRequest().authenticated()
                .and().formLogin(login -> login.loginPage(this.adminServer.getContextPath() + "/login")
                .successHandler(successHandler)).logout(logout -> logout.logoutUrl(this.adminServer.getContextPath() + "/logout")).httpBasic(withDefaults()).csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                .ignoringRequestMatchers(
                        new AntPathRequestMatcher(this.adminServer.getContextPath() + "/instances",
                                HttpMethod.POST.toString()),
                        new AntPathRequestMatcher(this.adminServer.getContextPath() + "/instances/*",
                                HttpMethod.DELETE.toString()),
                        new AntPathRequestMatcher(this.adminServer.getContextPath() + "/actuator/**"))).rememberMe(me -> me.key(UUID.randomUUID().toString()).tokenValiditySeconds(1209600));
		return http.build();
	}

}
