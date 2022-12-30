package org.example;
//MyService bean

import org.springframework.stereotype.Repository;

public class MyService {
    private MyRepository repository;
    public MyService(MyRepository repository){
        this.repository=repository;
    }
    public void doBusinessLogic(){
        System.out.println("Doing business logic.");
    }
}
