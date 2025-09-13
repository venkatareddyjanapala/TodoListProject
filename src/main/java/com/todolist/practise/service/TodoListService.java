package com.todolist.practise.service;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.dto.ToDoResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TodoListService {
    void createList(CreateToDoList request);
    List<ToDoResponse> getList();

}
