package ar.fiuba.tdd.template;

public class MyQueue<T> implements Queue<T>{

    public Node<T> first = new FirstNode<T>() ;

    public boolean isEmpty() {
        return first.getPosition() == 0;
    }

    public int size() {
        return first.getPosition();
    }

    public void add(T item) {
         // FIXME no tengo que meter la cola acá
        // Tengo que meter otro objeto que tenga público primero
        // así no queda público el first
        first.push(new ClassicNode<T>(item), this);
    }

    public T top() {
        return first.getNext();
    }

    public void remove() {
        first = first.getNextNode();
    }
}
