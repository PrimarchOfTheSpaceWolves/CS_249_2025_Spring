package edu.realemj.exercises16;
import java.util.*;
public class GenericQueue<E> {
    private ArrayList<E> q = new ArrayList<>();

    public int getSize() {
        return q.size();
    }

    public E peek() {
        return q.get(0);
    }

    public E dequeue() {
        return q.remove(0);
    }

    public void enqueue(E e) {
        q.add(e);
    }

    public boolean isEmpty() {
        return q.isEmpty();
    }

    public String toString() {
        return q.toString();
    }
}
