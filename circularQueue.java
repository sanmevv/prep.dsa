public class circularQueue {
    static class Queue {
        int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int n) {
            this.size = n;
            arr = new int[this.size];
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            if (rear == front) {
                rear = -1;
                front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);
            System.out.println(q.dequeue());
            q.enqueue(6);
            System.out.println(q.dequeue());
            q.enqueue(7);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.dequeue();
            }
        }
    }
}
