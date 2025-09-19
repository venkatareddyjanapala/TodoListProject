package com.todolist.practise.repository;

import com.todolist.practise.models.Task;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    Task findByTaskName(String taskName);
}
