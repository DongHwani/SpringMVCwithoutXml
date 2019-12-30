package com.config.spring;

import com.config.security.SpringSecurityConfiguration;
import com.domain.member.controller.MemberController;
import com.domain.member.utill.validation.MemberValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@Import(value = SpringSecurityConfiguration.class)
@ComponentScan(basePackageClasses = {MemberController.class, MemberValidator.class})
public class WebAppContextConfiguration implements WebMvcConfigurer {


}
