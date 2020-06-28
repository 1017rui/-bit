package udp.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

/**
 * @author 张瑞瑞
 * @date 2020/06/28 18:48
 */
public class Server {
    // 作为服务端，需要公开自己的地址
    // ip 地址，交给 OS 选，在所有的 ip 地址上都公开
    // port 端口，需要我们自己明确，随便选
    //1.[0,65535] 一般建议选1024以后的
    //2.端口只能属于一个进程  不能选择已经使用的端口
    public static final int PORT=8260;
    public static void main(String[] args) {

       // 1.作为服务端  需要先开张  可以理解为创建一个socket出来

        try(DatagramSocket serverSocket=new DatagramSocket(PORT) ){
            System.out.printf("%s: DEBUG: 服务端 Socket 已创建，UDP 端口是: %d%n", new Date(), PORT);
            //2.在循环里头不停的接受请求
            while(true){
                //2.1等待客户发来请求  被动的等待
                //会调用一个阻塞的方法，不知道什么时候才能返回。
                byte[] receiveBuffer=new byte[1024];
                //需要应用的开发人员和用户保证的请求不会超过1024字节
                // 创建一个 DatagramPacket 对象，并且把 接收缓冲区（receive buffer）关联上去
                DatagramPacket receivePacket=new DatagramPacket(receiveBuffer ,0,receiveBuffer .length) ;

                // 通过 socket 等待客户端发送数据，会把接收数据放入 receivePacket 对象（关联的 receiveBuffer 中）
                // 会调用一个阻塞的方法，不知道什么时候才能返回
                System.out.printf("%s: DEBUG: 等待客户端发送请求过来 ...%n", new Date());
                serverSocket.receive(receivePacket);
                System.out.printf("%s: DEBUG: 收到了客户端发送来的请求%n", new Date());
                // 数据接收成功，需要明确
                // 2.1.1 对方是谁（对方的 ip + port)
                String host = receivePacket.getAddress().getHostName();
                System.out.printf("%s: DEBUG: 对方的 host 是: %s%n", new Date(), host);
                int port = receivePacket.getPort();
                System.out.printf("%s: DEBUG: 对方的 port 是: %d%n", new Date(), port);
                // 2.1.2 我接收了多少的数据
                int length = receivePacket.getLength();
                System.out.printf("%s: DEBUG: 接收到 %d 字节的数据%n", new Date(), length);

                // 2.1.3 还有一个任务：目前接收到的数据是字节形式的，我们转换成字符形式，便于理解
                //涉及到了字符集编码的问题
                //假设双方都是用utf-8的编码（我需要保证的）
                String request=new String(receiveBuffer ,0,length,"UTF-8");
                System.out.printf("%s: DEBUG: 收到的请求是: %s%n", new Date(), request);
                // 2.2 进行业务处理，并得到准备发送回客户端的响应
                String response = service(host, port, request);
                System.out.printf("%s: DEBUG: 准备发送给对方的响应是: %s%n", new Date(), response);

                // 2.3 通过 socket 发送响应
                // 2.3.1 需要把 目前 字符数据 转化为 字节数据
                byte[] sendBuffer = response.getBytes("UTF-8");
                // 2.3.2 创建发送用的 DatagramPacket
                //       同时，关联上 byte[] 发送的数据
                //       和接收的时候不同的是：需要关联上对方是谁，便于经过 socket，让 OS 发送给网上的正确进程
                DatagramPacket sendPacket = new DatagramPacket(sendBuffer, sendBuffer.length,
                        receivePacket.getAddress(), port);
                // 2.3.3 经过 socket 正式发送了
                System.out.printf("%s: DEBUG: 准备发送数据 ...%n", new Date());
                serverSocket.send(sendPacket);
                System.out.printf("%s: DEBUG: 发送数据成功%n", new Date());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    /**
     * 实现回显服务（echo service）
     * @param host
     * @param port
     * @param request
     * @return
     */
    private static String service(String host, int port, String request) {
        return request ;
    }
}
