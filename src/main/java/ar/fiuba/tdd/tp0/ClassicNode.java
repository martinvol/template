package ar.fiuba.tdd.tp0;

class ClassicNode<T> implements Node<T> {

    public T data;
    Node<T> next = new EmptyNode<T>();

    public ClassicNode(T item) {
        data = item;
    }

    public int getPosition() {
        return next.getPosition() + 1;
    }

    public void push(Node<T> nodeToPush, Queue<T> queue) {
        next.push(nodeToPush, this);
    }

    public void push(Node<T> nodeToPush, Node<T> thisNode) {
        next.push(nodeToPush, this);
    }

    public T getNext(T item) {
        return next.getNext(this.data);
    }

    public T getNext() {
        return next.getNext(this.data);
    }

    public void setNext(Node neWnext) {
        this.next = neWnext;
    }


    public <T> Node<T> getNextNode() {
        return this.next.getNode();
    }


    public Node<T> getNode() {
        return this;
    }
}