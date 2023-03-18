package org.example;

import java.util.Comparator;

public class TaskPriorityComparator implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        return getPriorityNumber(o2.getTask().getPriority()) - getPriorityNumber(o1.getTask().getPriority());
    }

    private int getPriorityNumber(Priority priority) {
        switch (priority) {
            case high -> {
                return 3;
            }
            case middle -> {
                return 2;
            }
            case low -> {
                return 1;
            }
            default -> {
                return 0;
            }
        }
    }
}
