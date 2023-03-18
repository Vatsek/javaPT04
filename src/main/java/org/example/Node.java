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

    public Task getTask() {
        return task;
    }

    @Override
    public String toString() {
        return "id: " + task.getId()
                + "| Автор: " + task.getAuthor()
                + "| Дата создания: " + task.getDateCreate().getDayOfMonth() + " " + task.getDateCreate().getMonth() + " " + task.getDateCreate().getYear()
                + "| Время создания: " + task.getTimeCreate().getHour() + ":" + task.getTimeCreate().getMinute()
                + "| Дедлайн: " + task.getDeadLine().getDayOfMonth() + " " + task.getDeadLine().getMonth() + " " + task.getDeadLine().getYear()
                + "| описание: " + task.getDescription()
                +"| приоритет: " + this.priority ;
    }
}
