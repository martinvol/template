package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.EmptyNode;
import ar.fiuba.tdd.template.MyQueue;
import ar.fiuba.tdd.template.Node;

class ClassicNode<T> implements Node<T> {

    public T data;
    Node<T> next  = new EmptyNode<T>();

    public ClassicNode(T item){
        data = item;
    }

    public int getPosition(){
        return next.getPosition() + 1;
    }

    public void push(Node<T> nodeToPush, MyQueue<T> q){
        next.push(nodeToPush, this);
    }

    public void push (Node<T> nodeToPush, Node<T> thisNode ){
        next.push(nodeToPush, this);
    }

    public T getNext(T item){
        return next.getNext(this.data);
    }

    public T getNext(){
        return next.getNext(this.data);
    }

    public void setNext(Node neWnext){
        this.next = neWnext;
    }


    public <T> Node<T> getNextNode(){
        return this.next.getNode();
    }


    public Node<T> getNode() {
        return this;
    }
}