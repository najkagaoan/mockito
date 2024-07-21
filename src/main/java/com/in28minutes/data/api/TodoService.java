package com.in28minutes.data.api;

import java.util.List;

// Create ToDoServiceStub
// Test TodoBusinessImpl using ToDoServiceStub
public interface TodoService {
    public List<String> retrieveTodos(String user);
}
