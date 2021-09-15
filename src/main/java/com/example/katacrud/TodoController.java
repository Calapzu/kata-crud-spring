package com.example.katacrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private TodoService service;

    public Iterable<Todo> list() {
        return service.list();
    }

    public Todo save(Todo todo) {
        return service.save(todo);
    }

    public void delete(Long id) {
        service.delete(id);
    }

    public Todo get(Long id) {
        return service.get(id);
    }
}
