package com.todolist.practise.service.Impl;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.repository.TaskRepository;
import com.todolist.practise.service.TodoListService;
import org.springframework.stereotype.Service;

@Service
public class TodoListServiceImpl implements TodoListService {
    private TaskRepository taskRepository;
    @Override
    public void createList(CreateToDoList request) {

    }
}
