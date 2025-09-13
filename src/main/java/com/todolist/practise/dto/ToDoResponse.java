package com.todolist.practise.dto;

import com.todolist.practise.enums.Status;
import lombok.Builder;

import java.time.LocalDate;

@Builder
public record ToDoResponse (
        String taskName,
        LocalDate startTime,
        Status status,
        String createdBy
){
}
