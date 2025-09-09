package com.todolist.practise.dto;

import java.time.LocalDate;

public record CreateToDoList (
        String listName,
        LocalDate createTime,
        String user
){
}
