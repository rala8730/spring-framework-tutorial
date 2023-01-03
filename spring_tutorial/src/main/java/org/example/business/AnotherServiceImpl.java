package org.example.business;
//MyService bean

import org.example.data.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Component
@Service //using service instead of component //removing this to create java based bean in AppConfig
public class AnotherServiceImpl implements MyService {
//@Autowired
    //private MyRepository repository;

    //loosely coupled constructor
    // constructor dependency type
/*@Autowired //removing this to create java based bean in AppConfig
   public AnotherServiceImpl(MyRepository repository){
        this.repository=repository;
    }
*/
    @Override
    public void doBusinessLogic(){

        System.out.println("Doing some business logic slightly differently.");
    }
    //setter dependency injection
    /*
    public void setRepository(MyRepository repository) {
        this.repository = repository;
    }
    */
}
