package org.matidev.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Task {


    /**
     * A unique identifier for the task
     */
    private Long id;

    /**
     * A short description of the task.
     */
    private String description;

    /**
     * The status of the task (todo, in-progress, done)
     */
    private String status;

    /**
     * The date and time when the task was created
     */
    private LocalDate createdAt;

    /**
     * The date and time when the task was last updated
     */
    private LocalDate updateAt;

    public Task() {}

    public Task(Long id, String description, String status, LocalDate createdAt, LocalDate updateAt) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDate updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(id, task.id) && Objects.equals(description, task.description) && Objects.equals(status, task.status) && Objects.equals(createdAt, task.createdAt) && Objects.equals(updateAt, task.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, status, createdAt, updateAt);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
