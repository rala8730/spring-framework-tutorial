package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

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

        // prototype scope
        //MyService bean1 = ctx.getBean(MyService.class);
        //MyService bean2 = ctx.getBean(MyService.class);
        //MyService bean3 = ctx.getBean(MyService.class);


        //bean.doSomething();

        //setter dependency injection
        MyService service = ctx.getBean(MyService.class);
        service.doBusinessLogic();

        MyRepository repository=ctx.getBean(MyRepository.class);
        repository.doQuery();




    }
}
