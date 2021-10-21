package com.cl.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.cl")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
