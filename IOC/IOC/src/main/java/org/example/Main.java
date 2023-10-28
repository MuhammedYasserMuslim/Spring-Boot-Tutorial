package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.printName("Ali");


        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Person person1 = (Person) context.getBean("per");
        System.out.println(person1.toString());


    }
}