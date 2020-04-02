package TPs.PilasColasListas.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    MyStack myStack = new MyStack();
    MyDynamicStack myDynamicStack = new MyDynamicStack();

    @Test
    void push() {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myDynamicStack.push(1);
        myDynamicStack.push(2);
        myDynamicStack.push(3);
        myDynamicStack.push(4);
    }

    @Test
    void pop() throws StackIsEmptyException {
        myStack.pop();
        myDynamicStack.pop();
    }

    @Test
    void peek() throws StackIsEmptyException {
        push();
        assertEquals(4, myStack.peek());
        assertEquals(4, myDynamicStack.peek());
        pop();
        assertEquals(3, myStack.peek());
        assertEquals(3, myDynamicStack.peek());
    }

    @Test
    void isEmpty() {
        assertEquals(true, myStack.isEmpty());
        push();
        assertEquals(false , myStack.isEmpty());
    }

    @Test
    void size() {
        assertEquals(0, myStack.size());
        push();
        assertEquals(4, myStack.size());
    }

    @Test
    void empty() {
        push();
        myStack.empty();
        assertEquals(true, myStack.isEmpty());
    }
}