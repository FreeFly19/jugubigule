package laba5;

public class Stack<E> {
    private Node<E> head = null;

    public void push(E e) {
        Node<E> firstElement = new Node<>(e, head);
        head = firstElement;
    }

    public E pop() {
        if (head == null) {
            throw new IllegalStateException();
        }
        Node<E> lastElement = this.head;
        head = head.next;
        return lastElement.value;
    }

    public boolean isEmpty(){
        return head == null;
    }

    private class Node<T> {
        T value;
        Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }
}