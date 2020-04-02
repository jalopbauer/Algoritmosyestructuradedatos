package TPs.PilasColasListas.Queue;


public class MyDynamicQueue<T> implements Queue<T> {

    private Node<T> front;
    private Node<T> back;
    private int amount;

    public MyDynamicQueue() {
        this.amount = 0;
        front = null;
        back = null;
    }


    @Override
    public void enqueue(T t) {
        Node newNode = new Node();
        newNode.data = t;
        newNode.next = null;

        if (isEmpty()){
            front = newNode;
            back = newNode;
        }
        else{
            back.next = newNode;
            back = newNode;
        }
        amount++;
    }

    @Override
    public T dequeue() throws QueueIsEmptyException {
        if (!isEmpty()){
            T data = front.data;
            if (front == back){
                front = null;
                back = null;
            }
            else{
                front = front.next;
            }
            amount--;
            return data;
        }
        else{
            throw new QueueIsEmptyException();
        }
    }

    @Override
    public boolean isEmpty() {
        return (amount == 0)? true : false;
    }

    @Override
    public int length() {
        return amount;
    }

    @Override
    public int size() {
        return amount;
    }

    @Override
    public void empty() {
        front = null;
        back = null;
        amount = 0;
    }

    private class Node<T> {
        T data;
        Node next;
    }
}
