package assignment2;

public class Task2<E> {
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public Task2() {}

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public E first() {
        if (isEmpty()) return null;
        return head.getElement();
    }
    public E last() {
        if (isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0)
            tail = head;
        size++;
    }

    // Commented out as per task requirement
    // public void addLast(E e) {
    //     Node<E> newest = new Node<>(e, null);
    //     if (isEmpty())
    //         head = newest;
    //     else
    //         tail.setNext(newest);
    //     tail = newest;
    //     size++;
    // }

    public void add_after_predecessor(E e, Node<E> predecessor) {
        if (predecessor == null) {
            addFirst(e);
        } else if (predecessor.next == null) {
            Node<E> newest = new Node<>(e, null);
            predecessor.next = newest;
            tail = newest;
        } else {
            Node<E> newest = new Node<>(e, predecessor.next);
            predecessor.next = newest;
        }
        size++;
    }

    public Node<E> getHead() { return head; }
    public Node<E> getTail() { return tail; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        Node<E> walk = head;
        while (walk != null) {
            sb.append(walk.getElement());
            if (walk.getNext() != null)
                sb.append(", ");
            walk = walk.getNext();
        }
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        Task2<Object> mixedList = new Task2<>();
        mixedList.addFirst("Hello");
        mixedList.addFirst(4);
        mixedList.addFirst(7);
        mixedList.addFirst(5);
        Node<Object> tail = mixedList.getTail();
        mixedList.add_after_predecessor("World", tail);
        System.out.println("Mixed List: " + mixedList);
    }
}
