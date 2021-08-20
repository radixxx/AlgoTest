package data_structure.queue;

public class Main {

    public static void main(String[] args) {

        QueueImpl queue = new QueueImpl();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.dequeue();


        System.out.println(queue);

    }

}
