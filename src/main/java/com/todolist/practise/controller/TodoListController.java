package com.todolist.practise.controller;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.dto.ToDoResponse;
import com.todolist.practise.models.Task;
import com.todolist.practise.service.TodoListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/todolist")
@RequiredArgsConstructor
@Slf4j
public class TodoListController {


    private final TodoListService todoListService;
    @PostMapping("/create")
    public void createToDoList(@RequestBody CreateToDoList request){
        todoListService.createList(request);
    }

    @GetMapping()
    public List<ToDoResponse> getToDoList(){
        return todoListService.getList();
    }
}
