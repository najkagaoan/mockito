package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;

public class TodoBusinessimpl {
    private TodoService todoService;
    // TodoBusinessimpl SUT
    // TodoService dependency
    public TodoBusinessimpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredToDos = new ArrayList<>();
        List<String> todos = todoService.retrieveTodos(user);
        todos.stream().forEach((todo) -> {
            if(todo.contains("Spring")){
                filteredToDos.add(todo);
            }
        });
        return filteredToDos;
    }
}
