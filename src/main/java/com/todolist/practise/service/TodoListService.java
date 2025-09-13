package com.todolist.practise.service;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.dto.ToDoResponse;
import org.h2.util.json.JSONObject;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public interface TodoListService {
    Mono<String> createList(CreateToDoList request);
    List<ToDoResponse> getList();

}
