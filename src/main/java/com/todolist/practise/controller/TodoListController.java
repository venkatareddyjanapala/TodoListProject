package com.todolist.practise.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.dto.ToDoResponse;
import com.todolist.practise.dto.UpdateRequest;
import com.todolist.practise.enums.Status;
import com.todolist.practise.service.TodoListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/v1/api/todolist")
@RequiredArgsConstructor
@Slf4j
public class TodoListController {


    private final TodoListService todoListService;
    @PostMapping("/create")
    public Mono<String> createToDoList(@RequestBody CreateToDoList request){
       return todoListService.createList(request);
    }

    @PutMapping("/{taskName}/update")
    public void updateToDoList(@PathVariable String taskName, @RequestBody UpdateRequest updateRequest){
         todoListService.updateList(taskName, updateRequest.status());
    }
    @DeleteMapping("/{taskName}")
    public void deleteToDoList(@PathVariable String taskName){
        todoListService.deleteList(taskName);
    }

    @GetMapping()
    public List<ToDoResponse> getToDoList(){
        return todoListService.getList();
    }
}
