package org.example.data;

import org.springframework.stereotype.Repository;

// MyRepository bean
// @Component
@Repository //using repository instead of component // removing this to create java based bean in AppConfig
public class  MyRepositoryImpl implements MyRepository {
    @Override
    public void doQuery(){
        System.out.println("Doing DB Query");
    }
}
