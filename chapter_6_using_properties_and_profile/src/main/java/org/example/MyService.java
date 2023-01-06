package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @Value("${my.name}")
    private String name;
    private MyRepository repository;
    @Autowired
    public MyService(MyRepository repository){
        this.repository=repository;
    }
    public void doBusinessLogic(){
        System.out.println("Do Business logic for"+name);
        repository.doQuery();
    }

}
