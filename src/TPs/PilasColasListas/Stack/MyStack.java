package TPs.PilasColasListas.Stack;

public class MyStack<T> implements Stack<T>{

    private int top;
    private final int DEFAULT_CAPACITY = 10;
    private T[] savedObjects;

    public MyStack() {
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            savedObjects[i] = null;
        }
        top = 0;
    }

    @Override
    public void push(T addedObject) {
        if (top <= savedObjects.length){
            addObjectToArray(addedObject);
        } else {
            duplicateSizeOfArray();
            addObjectToArray(addedObject);
        }
    }

    private void addObjectToArray(T addedObject){
        savedObjects[top] = addedObject;
        ++top;
    }

    private void duplicateSizeOfArray() {
        T[] temporalArray = (T[]) new Object[DEFAULT_CAPACITY + savedObjects.length] ;
        for (int i = 0; i < savedObjects.length; i++) {
            temporalArray[i] = savedObjects[i];
        }
        savedObjects = temporalArray;
    }

    @Override
    public void pop() throws StackIsEmptyException {
        if (isEmpty()){
            throw new StackIsEmptyException();
        } else {
            --top;
        }
    }

    @Override
    public T peek() throws StackIsEmptyException {
        if (isEmpty()){
            throw new StackIsEmptyException();
        }
        return savedObjects[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return !(top > 0);
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public void empty() {
        top = 0;
    }
}
