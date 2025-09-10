package com.todolist.practise.service.Impl;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.models.Task;
import com.todolist.practise.repository.TaskRepository;
import com.todolist.practise.service.TodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoListServiceImpl implements TodoListService {
    private final TaskRepository taskRepository;
    @Override
    public void createList(CreateToDoList request) {
        Task task = Task.builder()
                .taskName(request.taskName())
                .startTime(request.startTime())
                .createdBy(request.createdBy())
                .build();

        taskRepository.save(task);
    }
}
