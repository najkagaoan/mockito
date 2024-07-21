package com.in28minutes.business;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    // Mock return value
    @Test
    public void letsMockListSizeMethod() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
        assertEquals(2, listMock.size());
    }

    // Multiple Return Values
    @Test
    public void letsMockListSize_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());

    }

    // Argument Matchers
    @Test
    public void letsMockListGet() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenReturn("in28Minutes");
        assertEquals("in28Minutes", listMock.get(0));
        assertEquals("in28Minutes", listMock.get(1));
    }

    @Test(expected = RuntimeException.class)
    public void letsMockList_thowAnException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException("Something"));
        listMock.get(0);
    }
}
