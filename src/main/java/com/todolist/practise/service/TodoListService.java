package com.todolist.practise.service;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.dto.ToDoResponse;
import com.todolist.practise.enums.Status;
import com.todolist.practise.models.Task;
import org.h2.util.json.JSONObject;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public interface TodoListService {
    Mono<String> createList(CreateToDoList request);
    void updateList(String taskName, Status status);
    void deleteList(String taskName);
    List<ToDoResponse> getList();

}
