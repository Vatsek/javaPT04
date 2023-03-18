package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Scheduler<E> {


    public ArrayList<Node> scheduler = new ArrayList<>();

    public ArrayList<Node> getScheduler() {
        return scheduler;
    }

    public void append(Task task, Person person, Priority priority) {
        scheduler.add(new Node(task, person, priority));
    }

    public void showAllTasks() {
        for (Node item : this.scheduler) {
            System.out.println(item);
        }
    }

    public void findByValue(E value) {
        for (Node i : this.scheduler) {
            if (i.toString().contains(value.toString())) {
                System.out.println(i.toString());
            }
        }
    }
}
