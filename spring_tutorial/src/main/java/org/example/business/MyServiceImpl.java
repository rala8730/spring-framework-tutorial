package org.example.business;
//MyService bean

import org.example.data.MyRepository;
import org.example.data.SomeOtherRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
//@Component
@Service //using service instead of component //removing this to create java based bean in AppConfig
public class MyServiceImpl implements MyService {
//@Autowired
    private MyRepository repository;

    //loosely coupled constructor
    // constructor dependency type
@Autowired //removing this to create java based bean in AppConfig
    //public MyServiceImpl(SomeOtherRepositoryImpl repository){
    public MyServiceImpl(@Qualifier("myRepositoryImpl") MyRepository repository){ // adding qualifier
        this.repository=repository;
    }

    @Override
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
