package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
        Student stu = (Student)context.getBean("student1");
        Student student=(Student)context.getBean("student2");
        System.out.println(stu);
        System.out.println(student);
    }
}
