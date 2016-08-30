package ar.fiuba.tdd.template;

import java.util.NoSuchElementException;

/**
 * Created by martin on 8/29/16.
 */
public class EmptyNode<T> implements Node<T> {


    public int getPosition(){
        return 0;
    }

    public void push(Node<T> nodeToPush, Queue<T> q){
        //next.push(nodeToPush);
    }

    public void push(Node<T> nodeToPush, Node<T> formerNode){
        formerNode.setNext(nodeToPush);

    }

    @Override
    public void push(Node<T> nodeToPush, MyQueue<T> queue) {

    }

    public T getNext(){

        return null;
    }

    public T getNext(T item){
        return item;
    }

    public void setNext(Node next){}

    @Override
    public <T> Node<T> getNextNode() {
        return null;
    }

    @Override
    public <T> Node<T> getNode() {
        return new FirstNode<T>();
    }


}
