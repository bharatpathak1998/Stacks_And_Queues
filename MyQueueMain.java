package UC3;

public class MyQueueMain {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        myQueue.enQueue(myFirstNode);
        myQueue.enQueue(mySecondNode);
        myQueue.enQueue(myThirdNode);

        myQueue.printMyNode();
    }
}