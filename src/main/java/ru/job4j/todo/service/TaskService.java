package ru.job4j.todo.service;

import ru.job4j.todo.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    Task create(Task task);

    void update(Task task);

    void deleteById(int taskId);

    List<Task> findAll();

    List<Task> findAllByDone(boolean isDone);

    Optional<Task> findById(int taskId);
}
