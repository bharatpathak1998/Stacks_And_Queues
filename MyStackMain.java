package UC1;

public class MyStackMain {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);

        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);

        myStack.printMyNode();
    }
}