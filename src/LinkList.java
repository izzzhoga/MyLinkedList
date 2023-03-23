public class LinkList<T> {
    public Node<T> head;
    public Node<T> tail;
    public int size = 0;

    public LinkList() {
        head = null;
        tail = null;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public T getFirst() {
        return head.data;
    }

    public T getLast() {
        return tail.data;
    }

    public void addFirst(T data) {
        Node<T> current = new Node<T>(data);

        if (isEmpty())
            head = tail = current;
        else {
            head.previous = current;
            current.next = head;
            head = current;
        }

        size++;
    }

    public void addLast(T data) {
        Node<T> current = new Node<T>(data);

        if (isEmpty())
            tail = head = current;
        else {
            tail.next = current;
            current.previous = tail;
            tail = current;
        }

        size++;
    }

    public void add(int index, T data) {
        Node<T> current = new Node<T>(data);
        int countIndex = 0;

        if ((isEmpty() && index != 0) || index < 0 || index > getSize())
            throw new IndexOutOfBoundsException("Element " + index + " not found");
        else {
            Node<T> tmpNode = head;
            while (countIndex != index && tmpNode != tail) {
                tmpNode = tmpNode.next;
                countIndex++;
            }
            if (tmpNode == head) {
                current.next = tmpNode;
                tmpNode.previous = current;
                head = current;
            } else if (index == countIndex + 1) {
                tmpNode.next = current;
                current.previous = tmpNode;
                tail = current;
            } else {
                current.previous = tmpNode.previous;
                current.previous.next = current;
                current.next = tmpNode;
                tmpNode.previous = current;
            }
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("List is clear!");
        else {
            if (head == tail)
                head = tail = null;
            else {
                head.next.previous = null;
                head = head.next;
            }
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("List is clear!");
        else {
            if (head == tail)
                head = tail = null;
            else {
                tail.previous.next = null;
                tail = tail.previous;
            }
            size--;
        }
    }

    public void remove(int index) {
        int countIndex = 0;

        if ((isEmpty() && index != 0) || index < 0 || index >= getSize())
            throw new IndexOutOfBoundsException("Element " + index + " not found");
        else {
            Node<T> tmpNode = head;
            while (countIndex != index && tmpNode != tail) {
                tmpNode = tmpNode.next;
                countIndex++;
            }
            if (tmpNode == head) {
                head.next.previous = null;
                head = head.next;
            } else if (index == countIndex) {
                tail.previous.next = null;
                tail = tail.previous;
            } else {
                tmpNode.next.previous = tmpNode.previous;
                tmpNode.previous.next = tmpNode.next;
            }
            size--;
        }
    }

    public void printLinkList() {
        if (isEmpty())
            throw new IndexOutOfBoundsException("List is clear!");
        else {
            Node<T> tmpNode = head;
            while (tmpNode != null) {
                System.out.println(tmpNode.data);
                tmpNode = tmpNode.next;
            }
        }
    }
}
