package ar.fiuba.tdd.template;

public class Queue<T> implements Queuerable<T> {

    public Node<T> first = new FirstNode<T>();

    public boolean isEmpty() {
        return first.getPosition() == 0;
    }

    public int size() {
        return first.getPosition();
    }

    public void add(T item) {
        first.push(new ClassicNode<T>(item), this);
    }

    public T top() {
        return first.getNext();
    }

    public void remove() {
        first = first.getNextNode();
    }

    protected void changeFirst(Node<T> newRoot) {
        first = newRoot;
    }
}
