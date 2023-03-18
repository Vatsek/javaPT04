package org.example;
import javax.xml.transform.Source;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Task {
    private static int counter = 0;
    private int id = counter;
    private final Date dateTimeCreate = new Date();
    private final SimpleDateFormat formatDateCreate = new SimpleDateFormat("dd.MM.yyy");
    private final SimpleDateFormat formatTimeCreate = new SimpleDateFormat("HH:mm:ss");
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

    public SimpleDateFormat getFormatDateCreate() {
        return formatDateCreate;
    }

    public SimpleDateFormat getFormatTimeCreate() {
        return formatTimeCreate;
    }

    public Date getDateTimeCreate() {
        return dateTimeCreate;
    }

    public LocalDate getDeadLine() {
        return deadLine;

    }
}
