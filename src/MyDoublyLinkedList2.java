
import java.util.AbstractSequentialList;
import java.util.ListIterator;
import java.util.NoSuchElementException;

class Node
{
    String data;
    Node prev, next;
    public Node(String d, Node p, Node next)
    {
        this.data = d;
        this.prev = p;
        this.next = next;
    }
}

public class MyDoublyLinkedList2 extends AbstractSequentialList<String> {

    private Node head, tail;
    private int size;

    public MyDoublyLinkedList2(){
        head = new Node(null, null, null);
        tail = new Node(null, head, null);
        head.next = tail;
    }



    @Override
    public ListIterator<String> listIterator(int index) {
        return new MyLIterator(index);
    }

    private class MyLIterator implements ListIterator<String>

    {
        Node toRemove;
        int indexToReturn = -1;
        Node current;
        int count = 0;

        public MyLIterator(int i){
            if (i > size() || i < 0){
                throw new NoSuchElementException();
            }
            current = head;
            while (count < i){
                current = current.next;
                count++;
                indexToReturn++;
            }
        }

        @Override
        public boolean hasNext() {
            return current.next != tail;
        }

        @Override
        public String next() {
            if (! hasNext()) {
                throw new NoSuchElementException();
            }
            indexToReturn++;
            toRemove = current.next;
            current = current.next;
            return toRemove.data;
        }

        @Override
        public boolean hasPrevious() {
            return current != head;
        }

        @Override
        public String previous() {
            if (! hasPrevious()) {
                throw new NoSuchElementException();
            }
            indexToReturn--;
            toRemove = current;
            current = current.prev;
            return toRemove.data;
        }

        @Override
        public int nextIndex() {
            return indexToReturn + 1;
        }

        @Override
        public int previousIndex() {
            return indexToReturn;
        }

        @Override
        public void remove() {
            toRemove.prev.next = toRemove.next;
            toRemove.next.prev = toRemove.prev;
            --size;
        }

        @Override
        public void set(String s) {
            toRemove.data = s;
        }

        @Override
        public void add(String s) {
            Node newNode = new Node(s, current, current.next);
            current.next = newNode;
            newNode.next.prev = newNode;
            ++size;
        }
    }
    @Override
    public int size() {
        return size;
    }
}