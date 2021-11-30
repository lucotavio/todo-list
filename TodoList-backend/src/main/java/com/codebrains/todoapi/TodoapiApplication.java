package com.codebrains.todoapi;

import com.codebrains.todoapi.entity.Todo;
import com.codebrains.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoapiApplication{


    public static void main(String[] args) {
        SpringApplication.run(TodoapiApplication.class, args);

    }

}
