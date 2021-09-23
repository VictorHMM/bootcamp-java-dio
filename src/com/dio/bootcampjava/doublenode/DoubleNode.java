package com.dio.bootcampjava.doublenode;

public class DoubleNode<T> {

    T content;
    DoubleNode<T> nextNode, previousNode;

    public DoubleNode(T content) {
        this.content = content;
        this.nextNode = null;
        this.previousNode = null;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public DoubleNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoubleNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    public DoubleNode<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(DoubleNode<T> previousNode) {
        this.previousNode = previousNode;
    }

}
