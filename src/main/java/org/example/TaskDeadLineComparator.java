package org.example;

import java.util.Comparator;

public class TaskDeadLineComparator implements Comparator<Node> {
    @Override
    public int compare(Node o1, Node o2) {
        return o1.getTask().getDeadLine().compareTo(o2.getTask().getDeadLine());
    }
}
