package tcp.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerThreadPool {
    public static final int SERVER_PORT = 9260;

    public static void main(String[] args) throws IOException {

        ExecutorService threadPool= Executors.newFixedThreadPool(8);//固定长度的线程池
        //Executors.newCachedThreadPool() ;


        // 1. 开店（创建 TCP 的 服务端 socket —— ServerSocket）
        Logger.debug("准备创建 ServerSocket");
        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            Logger.debug("创建 ServerSocket 成功，端口是: " + SERVER_PORT);
            // 2. 等着客户打来订餐电话
            while (true) {
                // 3. 因为TCP是有连接的，所以，不能直接读取数据，应该先接电话
                // 这个 accept() 方法的调用，就是在接电话
                // 备注：该方法时阻塞的 —— 没有人打电话过来之前，一直不会返回
                Logger.debug("等待获取建立好的连接（等待接电话）");
                Socket socket = serverSocket.accept();
                Logger.debug("获取建立好的连接成功（有人打来了电话，并成功接听）");
                // Socket socket 代表的就是连接的那个连接（已经通了的电话）

                Runnable task=new RequestResponseTask(socket) ;
                threadPool.execute(task);//调用线程池去处理
            }
        }
    }

    private static String echoService(String request) {
        return request;
    }
}
