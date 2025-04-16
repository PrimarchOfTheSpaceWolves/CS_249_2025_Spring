package edu.realemj.exercises16;

public class BinNode<E extends Comparable<E>>
        implements Comparable<BinNode<E>> {

    private E data;
    private BinNode<E> left = null;
    private BinNode<E> right = null;

    public BinNode(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public BinNode<E> getLeft() {
        return left;
    }

    public BinNode<E> getRight() {
        return right;
    }

    public void setLeft(BinNode<E> left) {
        this.left = left;
    }

    public void setRight(BinNode<E> right) {
        this.right = right;
    }

    @Override
    public int compareTo(BinNode<E> other) {
        return data.compareTo(other.data);
    }

    public String toString() {
        return "(" + data.toString() + ")";
    }
}
