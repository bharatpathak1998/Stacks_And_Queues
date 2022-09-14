package UC3;

public class MyQueue<K> {

    public INode<K> head;
    public INode<K> tail;

    public MyQueue() {
        this.head = null;
        this.tail = null;
    }

    public void enQueue(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void printMyNode() {
        System.out.println("My Nodes : "+head);
    }
}