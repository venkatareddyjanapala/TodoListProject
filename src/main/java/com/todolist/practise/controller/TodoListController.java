package com.todolist.practise.controller;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.service.TodoListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/todolist")
@RequiredArgsConstructor
@Slf4j
public class TodoListController {


    private final TodoListService todoListService;
    @PostMapping("/create")
    public void createList(@RequestBody CreateToDoList request){
        todoListService.createList(request);
    }
}
