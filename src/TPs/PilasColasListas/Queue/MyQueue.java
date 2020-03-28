package TPs.PilasColasListas.Queue;

public class MyQueue <T> implements Queue <T> {

    private int front, back, quantity;
    private final int DEFAULT_CAPACITY = 5;
    private T[] savedObjects;

    public MyQueue() {
        front = 0;
        back = -1;
        quantity = 0;
        savedObjects = (T[]) new Object[DEFAULT_CAPACITY];

    }

    private void duplicateSizeOfArray() {
        T[] temporalArray = (T[]) new Object[DEFAULT_CAPACITY + savedObjects.length];
        for (int i = 0; i < savedObjects.length; i++) {
            temporalArray[i] = savedObjects[i];
        }
        savedObjects = temporalArray;
    }

    @Override
    public void enqueue(T addedObject) {
        if (front == back){
            duplicateSizeOfArray();
        }
        if (back == savedObjects.length){
            back = -1;
        }
        ++quantity;
        ++back;
        savedObjects[back] = addedObject;
    }

    @Override
    public T dequeue() throws QueueIsEmptyException {
        if (isEmpty()){
            throw new QueueIsEmptyException();
        }
        if (front < savedObjects.length){
            front++;
        } else {
            front = 0;
        }
        quantity--;
        return savedObjects[front];
    }

    @Override
    public boolean isEmpty() {
        return quantity == 0;
    }

    @Override
    public int length() {
        return quantity;
    }

    @Override
    public int size() {
        return savedObjects.length;
    }

    @Override
    public void empty() {
        quantity = 0;
        front = 0;
    }

}
