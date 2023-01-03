package org.example.data;

import org.springframework.stereotype.Repository;

// MyRepository bean
// @Component
@Repository //using repository instead of component // removing this to create java based bean in AppConfig
public class SomeOtherRepositoryImpl implements MyRepository {
    @Override
    public void doQuery(){
        System.out.println("Doing a different DB Query");
    }
}
