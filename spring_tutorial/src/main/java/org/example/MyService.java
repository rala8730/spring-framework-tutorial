package org.example;
//MyService bean

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
//@Component
//@Service //using service instead of component //removing this to create java based bean in AppConfig
public class MyService {
//@Autowired
    private MyRepository repository;

    //loosely coupled constructor
    // constructor dependency type
//@Autowired //removing this to create java based bean in AppConfig
    public MyService(MyRepository repository){
        this.repository=repository;
    }

    public void doBusinessLogic(){

        System.out.println("Doing business logic.");
    }
    //setter dependency injection
    /*
    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
    */
}
