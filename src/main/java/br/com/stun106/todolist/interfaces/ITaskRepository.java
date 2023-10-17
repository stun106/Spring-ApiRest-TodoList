package br.com.stun106.todolist.interfaces;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.stun106.todolist.models.task.TaskModel;


public interface ITaskRepository extends JpaRepository<TaskModel,UUID>{
    List<TaskModel> findByIdUser(UUID idUser);
}
