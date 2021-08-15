package data_structure.arrays.queue;

import java.util.Queue;
import java.util.Stack;

public class QueueImpl {

    //use 2 stacks

    Stack<Integer> enqueue = new Stack<>();
    Stack<Integer> dequeue = new Stack<>();

    public void enqueue(int item) {
        enqueue.push(item);
    }

    public int dequeue() {
        if (dequeue.empty() && enqueue.empty()) throw new IllegalStateException();

        while (!enqueue.empty()) {
            dequeue.push(enqueue.pop());
        }

        return dequeue.pop();
    }

    public static void reverse(Queue<Integer> queue) {
        // q [10 ,20 ,30 ]
        // s [30, 20, 10]
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.empty()) {
            queue.add(stack.pop());
        }

    }

    @Override
    public String toString() {
        return String.valueOf(dequeue);
    }
}
