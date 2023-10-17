package br.com.stun106.todolist.models.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "tb_tasks")
public class TaskModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column(length = 50)
    private String title;
    private String description;
    private String priority;
    private UUID idUser;

    @CreationTimestamp
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public UUID getIdUser() {
        return idUser;
    }
    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }
    public LocalDateTime getStartAt() {
        return startAt;
    }
    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }
    public LocalDateTime getEndAt() {
        return endAt;
    }
    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }
    
   
   
}
