package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Иван");
        Person p2 = new Person("Анна");
        Task t1 = new Task(p1, "купить хлеб",Priority.low, "03.02.1999");
        Task t2 = new Task(p2, "поспать", Priority.high, "26.03.2023");
        Task t3 = new Task(p1, "дочитать книгу", Priority.middle, "28.03.2024");
        Task t4 = new Task(p2, "сдать домашнее задание", Priority.high, "30.03.2023");

        Scheduler sch1 = new Scheduler();
        sch1.append(t1, p1, Priority.low);
        sch1.append(t2, p2, Priority.high);
        sch1.append(t3, p2, Priority.middle);
        sch1.append(t4, p1, Priority.high);

        System.out.println("Все задачи планировщика:");
        sch1.showAllTasks();

        System.out.println("Отсортированные по дате дедлайна задачи:");
        Collections.sort(sch1.getScheduler(), new TaskDeadLineComparator());
        sch1.showAllTasks();

        System.out.println("Отсортированные по приоритету задачи:");
        Collections.sort(sch1.getScheduler(), new TaskPriorityComparator());
        sch1.showAllTasks();

        System.out.println("Нахождение задач по значению:");
        sch1.findByValue("купить хлеб");
        System.out.println("-".repeat(20));
        sch1.findByValue(Priority.high);
        System.out.println("-".repeat(20));
        sch1.findByValue("Анна");
        System.out.println("-".repeat(20));
        sch1.findByValue(3);
        System.out.println("-".repeat(20));


    }
}