package org.example;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Task {
    private static int counter = 0;
    private int id = counter;
    private final LocalDate dateCreate = LocalDate.now();
    private final LocalTime timeCreate = LocalTime.now();
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private LocalDate deadLine;
    private Person author;
    private Priority priority;
    private String description;

    public Task(Person author, String description,Priority priority, String deadLine)  {
        this.author = author;
        this.description = description;
        this.priority = priority;
        this.id = ++counter;
        this.deadLine = LocalDate.parse(deadLine, formatter);

    }
    public int getId() {
        return id;
    }

    public Person getAuthor() {
        return author;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreate() {
        return dateCreate;
    }
    public LocalDate getDeadLine() {
        return deadLine;
    }
    public LocalTime getTimeCreate() {
        return timeCreate;
    }
}
