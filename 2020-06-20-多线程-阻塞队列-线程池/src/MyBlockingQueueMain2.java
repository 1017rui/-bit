/**
 * @author 张瑞瑞
 * @date 2020/06/21 23:07
 */
import java.util.Scanner;

/**
 * 多生产者，单消费者的现象
 * 5 个生产者，一个消费者
 */
public class MyBlockingQueueMain2 {
    private static final MyBlockingQueue queue = new MyBlockingQueue();

    static class Producer extends Thread {
        Producer(int i) {
            super("生产者-" + i);
        }

        @Override
        public void run() {
            try {
                for (int i = 0; true; i++) {
                    queue.push(i);
                    System.out.println(getName() + ": 放入: " + i);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
/*
预期是，5个线程加起来一共放16个数据之后就会全部阻塞，直到被消费
但是，
 */
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            new Producer(i).start();
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("输入回车，进行消费");
            scanner.nextLine();
            int i = queue.pop();
            System.out.println("消费者取出了: " + i);

        }
    }
}
