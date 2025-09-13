package com.todolist.practise.models;
import com.todolist.practise.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TASK")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "TASK_NAME")
    private String taskName;

    @Column(name = "START_TIME")
    private LocalDate startTime;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "END_TIME")
    private LocalDate endTime;

    @Column(name = "CREATED_BY")
    private String createdBy;
}
