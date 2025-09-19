package com.todolist.practise.dto;

import com.todolist.practise.enums.Status;

public record UpdateRequest(
        Status status
) {
}
