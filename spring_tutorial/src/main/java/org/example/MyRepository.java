package org.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// MyRepository bean
// @Component
//@Repository //using repository instead of component // removing this to create java based bean in AppConfig
public class MyRepository {
    public void doQuery(){
        System.out.println("Doing DB Query");
    }
}
