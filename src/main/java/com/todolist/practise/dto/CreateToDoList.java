package com.todolist.practise.dto;

import com.todolist.practise.enums.Status;

import java.time.LocalDate;

public record CreateToDoList (
        String taskName,
        LocalDate startTime,
        Status status,
        String createdBy
){
}
