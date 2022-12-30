package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx= new FileSystemXmlApplicationContext("applicationContext.xml");
        MyService bean = ctx.getBean(MyService.class);
        bean.doSomething();
    }
}
