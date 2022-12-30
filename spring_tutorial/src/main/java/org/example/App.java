package org.example;

import org.springframework.context.ApplicationContext;
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
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        MyService bean1 = ctx.getBean(MyService.class);
        MyService bean2 = ctx.getBean(MyService.class);
        MyService bean3 = ctx.getBean(MyService.class);

        //bean.doSomething();
    }
}
