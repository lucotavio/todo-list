package com.codebrains.todoapi.repository;

import com.codebrains.todoapi.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
