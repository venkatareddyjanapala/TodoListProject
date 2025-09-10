package com.todolist.practise.repository;

import com.todolist.practise.models.Task;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
