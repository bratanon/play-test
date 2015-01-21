package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "task")
public class Task {

    @Id
    private int id;

    private String description;

    private Status status;

    private Priority priority;

    public Task (String description, Status status, Priority priority) {
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public Status getStatus () {
        return status;
    }

    public void setStatus (Status status) {
        this.status = status;
    }

    public Priority getPriority () {
        return priority;
    }

    public void setPriority (Priority priority) {
        this.priority = priority;
    }

    public enum Status {
        NEW("New"), OPEN("Open"), CLOSED("Closed");

        private String title;

        private Status(String title) {
            this.title = title;
        }

        public String getTitle() {
            return this.title;
        }
    }
}
