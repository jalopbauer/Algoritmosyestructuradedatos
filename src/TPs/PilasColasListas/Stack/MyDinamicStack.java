package TPs.PilasColasListas.Stack;

public class MyDinamicStack<T> implements Stack<T>{

    Node<T> top;
    int size;

    public MyDinamicStack() {
        this.top = null;
        size = 0;
    }

    @Override
    public void push(T object) {
        if (top == null){
            top = new Node(object);
        } else {
            Node aux = new Node(object);
            aux.setNode(top);
            top = aux;
        }
        size++;

    }

    @Override
    public void pop() throws StackIsEmptyException {
        if (isEmpty()){
            throw new StackIsEmptyException();
        } else {
            top = top.getNode();
            size--;
        }
    }

    @Override
    public T peek() throws StackIsEmptyException{
        if (isEmpty()){
            throw new StackIsEmptyException();
        } else {
            return top.getObject();
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void empty() {
        top = null;
        size = 0;
    }
}
