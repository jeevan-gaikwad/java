package org.jeevan.usermgmt.global;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "org.jeevan.usermgmt")
public class UserMgmtConfig {

}
