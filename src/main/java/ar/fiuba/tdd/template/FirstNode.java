package ar.fiuba.tdd.template;

import java.util.NoSuchElementException;

/**
 * Created by martin on 8/30/16.
 */
public class FirstNode<T> implements Node<T> {
    public void push(Node<T> nodeToPush, MyQueue<T> queue){
        queue.first = nodeToPush;
    }

    public T getNext(){
        throw new NoSuchElementException();
    }

    public int getPosition(){
        return 0;
    }

    public T getNext(T item){
        throw new NoSuchElementException();
    }

    @Override
    public void push(Node<T> nodeToPush, Node<T> thisNode) {

    }

    public void setNext(Node next){}

    @Override
    public <T1> Node<T1> getNextNode() {
        throw new NoSuchElementException();
    }

    @Override
    public <T1> Node<T1> getNode() {
        return null;
    }


}
