package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //class declare one or more bean method

//java based configuration
@ComponentScan("org.example")
public class AppConfig {



    /*
    // java based configuration
    @Bean
    @Scope("prototype")
    public MyService getService(){
        return new MyService(getRepository());
    }
    @Bean
    public MyRepository getRepository(){
        return new MyRepository();
    }
*/
}
