package com.codebrains.todoapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevConfig {

    @Autowired
    private DbInsertTodo dbInsertTodo;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String ddl;

    @Bean
    public void instanciaDB(){
        if(ddl.equals("update")){
            dbInsertTodo.insertTodo();
        }
    }
}
