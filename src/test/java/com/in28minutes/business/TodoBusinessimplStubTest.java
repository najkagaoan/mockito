package com.in28minutes.business;

import com.in28minutes.data.api.TodoServiceStub;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/*Problems
* Dynamic Conditions
* Changes in Intefaces*/

public class TodoBusinessimplStubTest {
    @Test
    public void testRetrieveTodosRelatedToSpring_usingAStub() {
        TodoServiceStub todoServiceStub = new TodoServiceStub();
        TodoBusinessimpl todoBusinessimpl =  new TodoBusinessimpl(todoServiceStub);

        List<String> filteredToDos = todoBusinessimpl.retrieveTodosRelatedToSpring("Dummy");

        assertEquals(2, filteredToDos.size());
        assertEquals(true, filteredToDos.contains("Learn Spring MVC"));
        assertEquals(false, filteredToDos.contains("Learn to Dance"));
    }
}