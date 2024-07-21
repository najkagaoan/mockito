package com.in28minutes.business;

import com.in28minutes.data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/*Problems
 * Dynamic Conditions
 * Changes in Intefaces*/

public class TodoBusinessImplMockTest {
    @Test
    public void testRetrieveTodosRelatedToSpring_usingAMock() {

        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to Dance");
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessimpl todoBusinessimpl =  new TodoBusinessimpl(todoServiceMock);

        List<String> filteredToDos = todoBusinessimpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2, filteredToDos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_withEmptyList() {

        TodoService todoServiceMock = mock(TodoService.class);
        List<String> todos = Arrays.asList();
        when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);
        TodoBusinessimpl todoBusinessimpl =  new TodoBusinessimpl(todoServiceMock);

        List<String> filteredToDos = todoBusinessimpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(0, filteredToDos.size());
    }
}