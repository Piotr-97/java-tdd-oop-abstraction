package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoItemTest {
    TodoItem todoItem;

    @BeforeEach
    public void preapare(){
        todoItem = new TodoItem("Title1","detail1","done");
    }


    @Test
    public void shouldReturnTitleForTodoItem() {
        assertEquals("Title1", todoItem.getTitle());
    }

    @Test
    public void shouldReturnDetailsForTodoItem(){
        assertEquals("detail1",todoItem.getDetail());
    }
    @Test
    public void shouldReturnStatusForTodoItem() {
        assertEquals("done", todoItem.getStatus());
    }

        @Test
    public void shouldChangeTitleForTodoItem(){
        //given
        String title2 = "title2";
        //when
        todoItem.setTitle(title2);
        ///then
        assertEquals(title2,todoItem.getTitle());
    }

    @Test
    public void shouldChangeDetailsForTodoItem(){
        //given
        String details2 = "details";
        //when
        todoItem.setDetail(details2);
        ///then
        assertEquals(details2,todoItem.getDetail());
    }

    @Test
    public void shouldChangeStatusForTodoItem(){
        //given
        String status2 = "status2";
        //when
        todoItem.setStatus(status2);
        ///then
        assertEquals(status2,todoItem.getStatus());
    }



}
