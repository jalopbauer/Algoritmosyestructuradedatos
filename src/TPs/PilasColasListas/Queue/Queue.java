package TPs.PilasColasListas.Queue;

public interface Queue<Q> {
    void enqueue(Q q);
    Q dequeue() throws QueueIsEmptyException;
    boolean isEmpty();
    int length();
    int size();
    void empty();

}