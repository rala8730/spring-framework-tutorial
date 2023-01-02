package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //class declare one or more bean method
@ComponentScan(basePackages = "org.example")
public class AppConfig {

}
