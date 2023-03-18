package org.example;

import java.sql.Time;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Иван");
        Person p2 = new Person("Анна");
        Task t1 = new Task(p1, "погулять",Priority.low, "03.02.1999");
        Task t2 = new Task(p2, "поспать", Priority.high, "26.03.2023");
        Task t3 = new Task(p1, "почитать книгу", Priority.middle, "28.03.2023");
        Task t4 = new Task(p2, "позаниматься спортом", Priority.high, "30.03.2023");

        Scheduler sch1 = new Scheduler();
        sch1.append(t1, p1, Priority.high);
        sch1.append(t2, p2, Priority.low);
        sch1.append(t3, p2, Priority.middle);
        sch1.append(t4, p1, Priority.high);
        sch1.showAllTasks();

//        sch1.findByValue("погулять");
//        sch1.findByValue(Priority.high);
//        sch1.findByValue("Анна");
//        sch1.findByValue(3);






    }





}