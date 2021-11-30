package com.codebrains.todoapi.controller;

import com.codebrains.todoapi.entity.Todo;
import com.codebrains.todoapi.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoRepository repository;


    @PostMapping
    public ResponseEntity<Todo> save(@RequestBody Todo todo){

        todo = repository.save(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body(todo);
    }

    @PutMapping
    public ResponseEntity<Todo> update(@RequestBody Todo todo){

        todo = repository.save(todo);
        return ResponseEntity.ok().body(todo);
    }

    @GetMapping
    public ResponseEntity<List<Todo>> findByAll(){

        List<Todo> listTodo = repository.findAll();

        return ResponseEntity.ok().body(listTodo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> findById(@PathVariable  Long id){
        Optional<Todo> result = repository.findById(id);
        Todo todo = result.get();
        return ResponseEntity.ok().body(todo);
    }

    @DeleteMapping("/{id}")
    public void  delete(@PathVariable Long id){

        repository.deleteById(id);
    }
}
