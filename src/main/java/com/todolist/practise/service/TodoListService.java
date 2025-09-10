package com.todolist.practise.service;

import com.todolist.practise.dto.CreateToDoList;
import org.springframework.stereotype.Service;

@Service
public interface TodoListService {
    void createList(CreateToDoList request);

}
