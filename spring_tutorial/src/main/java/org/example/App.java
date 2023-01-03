package org.example;

import org.example.business.AnotherServiceImpl;
import org.example.business.MyService;
import org.example.business.MyServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Xml based
        //ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");

        //non xml based; by adding configuration class
        //ApplicationContext ctx=new AnnotationConfigApplicationContext("org.example");
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);


        //using interface
        //MyService service=ctx.getBean(MyService.class);

        //using AnotherserviceImpl
        MyService service = ctx.getBean(AnotherServiceImpl.class);
        MyService service1 = ctx.getBean(MyServiceImpl.class);

        // prototype scope
        //MyService bean1 = ctx.getBean(MyService.class);
        //MyService bean2 = ctx.getBean(MyService.class);
        //MyService bean3 = ctx.getBean(MyService.class);


        //bean.doSomething();

        //setter dependency injection
        //MyServiceImpl service = ctx.getBean(MyService.class);
        //MyServiceImpl service1 = ctx.getBean(MyService.class);
        //service.doBusinessLogic();

        //MyRepository repository=ctx.getBean(MyRepository.class);
        //repository.doQuery();




    }
}
