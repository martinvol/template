package ar.fiuba.tdd.tp0;


public class EmptyNode<T> implements Node<T> {


    public int getPosition() {
        return 0;
    }

    public void push(Node<T> nodeToPush, Node<T> formerNode) {
        formerNode.setNext(nodeToPush);
    }

    public void push(Node<T> nodeToPush, Queue<T> queue) {
        throw new IllegalStateException("Method should not be called");
    }

    public T getNext() {
        throw new IllegalStateException("Method should not be called");
    }

    public T getNext(T item) {
        return item;
    }

    public void setNext(Node next) {

    }

    public <T> Node<T> getNextNode() {
        throw new IllegalStateException("Method should not be called");
    }

    public <T> Node<T> getNode() {
        return new FirstNode<T>();
    }


}
