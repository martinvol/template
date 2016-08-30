package ar.fiuba.tdd.template;

public class FirstNode<T> implements Node<T> {

    public void push(Node<T> nodeToPush, Queue<T> queue) {
        queue.changeFirst(nodeToPush);
    }

    public void push(Node<T> nodeToPush, Node<T> thisNode) {
        throw new IllegalStateException();
    }

    public T getNext() {
        throw new AssertionError();
    }

    public T getNext(T item) {
        throw new AssertionError();
    }

    public int getPosition() {
        return 0;
    }


    public void setNext(Node next) {
        throw new IllegalStateException();
    }

    public <T1> Node<T1> getNextNode() {
        throw new AssertionError();
    }

    public <T1> Node<T1> getNode() {
        throw new IllegalStateException();
    }


}
