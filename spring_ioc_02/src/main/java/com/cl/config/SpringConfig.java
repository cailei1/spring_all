package com.cl.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.cl")
@PropertySource("classpath:myBean.properties")

public class SpringConfig {
}
