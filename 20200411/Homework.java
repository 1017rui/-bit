import java.util.Scanner;
import java.util.Random;
//import java.util.*;//导入java.util所有的包
public class Homework{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		//生成随机数
		Random random=new Random();
		int randNum=random.nextInt(100);//[0-100)
		System.out.println(randNum);
		//猜随机数
		while(true){
			System.out.println("请输入你要猜的数字：");
			int num=scan.nextInt();
			if(num<randNum){
				System.out.println("猜小了");
			}else if(num<randNum){
				System.out.println("猜大了");
			}else{
				System.out.println("恭喜你，猜中了！");
				break;
			}
		}
	}
}