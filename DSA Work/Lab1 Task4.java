import java.util.Iterator;
import java.util.NoSuchElementException;

public class OrderedList<T extends Comparable<T>> implements Iterable<T> {

    private class Node {
        T data;
        Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    public OrderedList() {
        head = null;
        size = 0;
    }

    public void add(T element) {
        head = new Node(element, head);
        size++;
    }

    public T removeFirst() {
        return removeAtIndex(0);
    }

    public T removeLast() {
        return removeAtIndex(size - 1);
    }

    public T remove(T element) {
        Node current = head;
        Node previous = null;

        while (current != null && !element.equals(current.data)) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            throw new NoSuchElementException("Element not found");
        }

        if (previous == null) {
            head = head.next;
        } else {
            previous.next = current.next;
        }

        size--;
        return current.data;
    }

    public T first() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
        return head.data;
    }

    public T last() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public boolean contains(T element) {
        for (T item : this) {
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("No more elements");
                }
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    private T removeAtIndex(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            throw new NoSuchElementException("Invalid index");
        }

        Node current = head;
        Node previous = null;

        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.next;
        }

        if (previous == null) {
            head = head.next;
        } else {
            previous.next = current.next;
        }

        size--;
        return current.data;
    }
}
