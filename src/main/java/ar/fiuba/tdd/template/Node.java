package ar.fiuba.tdd.template;

/**
 * Created by martin on 8/29/16.
 */
public interface Node<T> {

    public void push(Node<T> nodeToPush, MyQueue<T> queue);

    public T getNext();

    public int getPosition();

    public T getNext(T item);

    public void push (Node<T> nodeToPush, Node<T> thisNode);

    public void setNext(Node next);

    <T> Node<T> getNextNode();

    <T> Node<T> getNode();
}
