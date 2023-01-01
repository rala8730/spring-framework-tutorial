package org.example;

import org.springframework.stereotype.Component;

// MyRepository bean
@Component
public class MyRepository {
    public void doQuery(){
        System.out.println("Doing DB Query");
    }
}
