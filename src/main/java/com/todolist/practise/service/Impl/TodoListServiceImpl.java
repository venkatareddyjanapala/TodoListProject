package com.todolist.practise.service.Impl;

import com.todolist.practise.dto.CreateToDoList;
import com.todolist.practise.dto.ToDoResponse;
import com.todolist.practise.enums.Status;
import com.todolist.practise.models.Task;
import com.todolist.practise.repository.TaskRepository;
import com.todolist.practise.service.TodoListService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TodoListServiceImpl implements TodoListService {
    private final TaskRepository taskRepository;
    @Override
    public void createList(CreateToDoList request) {
        log.info("The given request object is:" + request.toString());
        Task task = Task.builder()
                .taskName(request.taskName())
                .startTime(LocalDate.now())
                .status(request.status())
                .createdBy(request.createdBy())
                .build();

        taskRepository.save(task);
    }

    @Override
    public List<ToDoResponse> getList() {
        List<Task> tasksList = taskRepository.findAll();
        // Approach #1
       /* return tasksList.stream().map(
                task -> new ToDoRespose(
                        task.getTaskName(),
                        task.getStartTime(),
                        task.getStatus(),
                        task.getCreatedBy()
                )).toList();*/
        //Approach#2
        return tasksList
                .stream()
                .map(task -> ToDoResponse.builder()
                        .taskName(task.getTaskName())
                        .createdBy(task.getCreatedBy())
                        .status(task.getStatus())
                        .startTime(task.getStartTime())
                        .build())
                .toList();
    }
}
