package com.company.tasks;

import java.util.LinkedList;
import java.util.Queue;

public class HitCounter {

    Queue<Integer> hits;

    public HitCounter() {
        hits = new LinkedList<Integer>();
    }

    public void hit(int timestamp) {
        hits.add(timestamp);
    }

    public int getHits(int timestamp) {
        while (hits.size() > 0 && hits.peek() <= timestamp - 300) {
            hits.poll();
        }
        return hits.size();

    }
}

