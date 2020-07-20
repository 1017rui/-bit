public class Client{
	public static void main(String[] args){
		//1.
		try(Socket socket=new Socket("192.168.1.4",8080)){
			//2.代表三次握手中，我的TCP作为主动方，收到了对方的syn+ack了，并且
			//第三次ack也发送了，但是没有达到对方我不知道
			//TCP的状态一定是ESTABLISHED
			String httpRequest="GET .../";
			socket.getOutputStream().write(httpRequest.getBytes());
			socket.getOutputStream().flush();
			//3.数据刚刚到达TCP的发送缓冲区		
		}
	}
}
