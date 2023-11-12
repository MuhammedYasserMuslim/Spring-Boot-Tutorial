package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception{

        ObjectMapper mapper = new ObjectMapper();

        Person person = mapper.readValue("{ \"id\" :\"5\",\n" +
                " \"name\" :\"muhammed\",\n" +
                " \"age\" : 23,\n" +
                "\"phones\":[\n" +
                "    \"01014129303\",\"01550449403\"\n" +
                "]}" , Person.class);

        person.toString();



    }
}