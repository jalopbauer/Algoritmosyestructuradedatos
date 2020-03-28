package TPs.PilasColasListas.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    MyStack myStack = new MyStack();


    @Test
    void push() {
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
    }

    @Test
    void pop() throws StackIsEmptyException {
        myStack.pop();
    }

    @Test
    void peek() throws StackIsEmptyException {
        push();
        assertEquals(4, myStack.peek());
        pop();
        assertEquals(3, myStack.peek());
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