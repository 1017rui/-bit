
/* import java.util.Scanner;
public class WorkTest{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=scan.nextInt();
		while(num!=0){
			System.out.print(num%10+" ");
			num=num/10;
		}
		
	}
} */

import java.util.Scanner;
public class WorkTest{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n=scan.nextInt();
		print();
	}
	
}
public static void print(int n){
	if(n>9){
		print(n/10);
	}
	System.out.println(n%10+" ");
}
/* import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int count=3;
		while(count!=0){
		System.out.println("请输入你的密码：");
		String password=scan.nextLine();
		if(password.equals("123456")){
			System.out.println("密码正确，登录成功！");
			break;
		}else{
			count--;
			System.out.println("密码错误，你还有"+count+"次机会！");
		}
	}
	if(count==0){
		System.out.println("三次密码均输入错误，退出程序！");
	 }
  }
} */
/* public class Test{
	public static void main(String[] args){
		for(int i=1;i<=100;i++){
			int j=2;
			for(;j<=(int)Math.sqrt(i);j++){
				if(i%j==0){
					//不是素数
					break;
				}
			}
			if(j>(int)Math.sqrt(i)){
				//是素数
				System.out.println(i+"是素数！");
			}
		}
	}
} */
/* import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int i=2;
		for(;i<=num/2;i++){
			if(num%i==0){
				System.out.println(num+"不是素数");
				break;
			}
		}
		if(i>num/2){
			System.out.println(num+"是素数");
		}
	}
} */

/* import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		for(int i=1;i<=999;i++){
			//1.确定数字的位数
			int ret=i;
			int count=0;
			while(ret!=0){
				count++;
				ret=ret/10;
			}
			//2.求的每一位进行运算
			ret=i;
			int sum=0;
			while(ret!=0){
				sum=sum+(int)Math.pow(ret%10,count);
				ret=ret/10;
			}
		//3.和原来的数比较 如果相同 那么符合要求 输出
		if(sum==i){
			System.out.println(sum+" is my result!");
		}		
	  }
	}
}
		  */
		/* int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			
		int j=2;
		for(;j<=(int)Math.sqrt(i);j++){
		
			if(i%j==0){
				System.out.println(n+"不是素数");
				break;
			}
		}
		if(j>(int)Math.sqrt(i)){
			System.out.println(i+"是素数");
		}
		} */
		/* while(scan.hasNextInt()){
			int num=scan.nextInt();
			System.out.println(num);
		} */
		/* System.out.println("hello world"); 
 
			int x = 10; 
			System.out.printf("x = %d\n", x);//格式化输出
		 */
		// int num=scan.nextInt();//5 求5的阶乘。
		// int sum=0;
		// for(int j=1;j<=num;j++){
			
			// int ret=1;
			// for(int i=1;i<=j;i++){
				// ret=ret*i;
			// }
			// sum+=ret;
		// }
		// System.out.println(sum);
		
	//}
//}
	
		// for(int i=0; ; i++){
			// System.out.println(i);
		// }
		
		// while(scan.hasNextInt()){//循环读入多个整形
			// int num=scan.nextInt();
			// System.out.println(num);
		// }
		// int i=1;
		// for(;i<=10;i++){
		// System.out.println(i);
		// }
		
		
		
		// int num=scan.nextInt();
		// while(num<100){
			// if(num%15==0){
				// System.out.println(num);
				// //break;
				// continue;
			// }
			// System.out.println("hello");
		    // num++;
		//}
	//}
//}