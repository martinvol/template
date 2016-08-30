package ar.fiuba.tdd.template;

public interface Node<T> {

    void push(Node<T> nodeToPush, Queue<T> queue);

    void push(Node<T> nodeToPush, Node<T> thisNode);

    T getNext();

    T getNext(T item);

    int getPosition();

    <T> Node<T> getNextNode();

    void setNext(Node next);

    <T> Node<T> getNode();
}
