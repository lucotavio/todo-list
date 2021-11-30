package com.codebrains.todoapi.config;

import com.codebrains.todoapi.entity.Todo;
import com.codebrains.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DbInsertTodo {

    @Autowired
    private TodoRepository repository;

    public void insertTodo(){

        Todo todo1 = new Todo("Fazer café", false);
        Todo todo2 = new Todo("Fazer almoço", false);

        repository.save(todo1);
        repository.save(todo2);
    }
}
