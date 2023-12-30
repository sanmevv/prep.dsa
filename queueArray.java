public class queueArray {
    static class Queue {
        int[] arr;
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            this.size = n;
            arr = new int[this.size];
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("full queue");
                return;
            }
            if (isEmpty()) {
                front = 0;
            }
            rear++;
            arr[rear] = data;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int frontValue = arr[front];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            if (rear == -1) {
                front = -1;
            }

            return frontValue;
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

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.dequeue();
            }
        }
    }
}
