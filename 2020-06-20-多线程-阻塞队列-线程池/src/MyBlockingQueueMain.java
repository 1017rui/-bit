/**
 * @author 张瑞瑞
 * @date 2020/06/21 22:50
 */
import java.util.Scanner;
//单生产者 单消费者
public class MyBlockingQueueMain {
    private static final MyBlockingQueue queue = new MyBlockingQueue();//初始化一个阻塞队列

    static class Producer extends Thread {
        @Override
        public void run() {
            try {
                /*
                for (int i = 0; true; i++) {
                    queue.push(i);
                    System.out.println("生产者放入: " + i);
                }*/
                while(true){
                    int i=queue.pop();
                    System.out.println("消费者取出："+i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        producer.start();

        Scanner scanner = new Scanner(System.in);
        int i=0;
        while (true) {
            //消费者快于生产者
            System.out.print("输入任何值，进行一次消费");
            scanner.nextLine();
            queue.push(i);
            System.out.println("生产者放入："+i);
            i++;
            /*
            //生产者快于消费者
            int i = queue.pop();
            System.out.println("消费者消费: " + i);

             */
        }
    }
}
