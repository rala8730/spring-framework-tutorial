package org.example;
//MyService bean

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Component
public class MyService {

    private MyRepository repository;

    //loosely coupled constructor
    //constructor dependency type
   /*
    public MyService(MyRepository repository){
        this.repository=repository;
    }
    */
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
