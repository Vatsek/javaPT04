package org.example;

public class Node {
    Task task;
    Person person;
    Priority priority;

    public Node(Task task, Person person, Priority priority){
        this.task = task;
        this.person = person;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "id: " + task.getId()
                + "| Автор: " + task.getAuthor()
                + "| Дата создания: " + task.getFormatDateCreate().format(task.getDateTimeCreate())
                + "| Время создания: " + task.getFormatTimeCreate().format(task.getDateTimeCreate())
                + "| Дедлайн: " + task.getFormatDateCreate().format(task.getDeadLine()) + task.getFormatTimeCreate().format(task.getDeadLine())
                + "| описание: " + task.getDescription()
                +"| приоритет: " + this.priority ;
    }
}
