import java.util.Scanner;
public class TestDemo1{
	public static void main(String[] args){
		//计算5的阶乘、
		//5的阶乘的和
		
		int num=1;
		int sum=0;
		while(num<=5){
		int i=1;
		int ret=1;
		    while(i<=num){
				ret*=i;
				i++;
		   }
			sum=sum+ret;
			num++;
		}
		System.out.println(sum);
		
	}
}
	
		// int num=1;
		// while(num<=10)
		// {
			// System.out.println(num);
			// num++;
		// }
		
		// switch(a){
			// case 1:
			// System.out.println("1");
			// break;
			// case 2:
			// System.out.println("2");
			// break;
			// default：
			// System.out.println("请输入正确的数字：");
			// break;
		// Scanner scan=new Scanner(System.in);
		// while(scan.hasNext()){
		// int year=scan.nextInt();
		// if(((year%4==0)&&(year%100!=0))||(year%400==0)){
			// System.out.println("闰年！");
		// }else{
			// System.out.println("不是闰年！");
		// }
	// }//退出循环1.ctrl+c 直接中断2.ctrl+d正常退出
		//int a=scan.nextInt();
		// System.out.println(a);
		// String str=scan.nextLine();
		// System.out.println(str);
	//}
//}
	
		// int i=10;
		// i=i++;
		// System.out.println(i);
		// int a = 10;
		 // int b = 20;
		 // System.out.println(a == b); 
		// System.out.println(a != b); 
		// System.out.println(a < b); 
		// System.out.println(a > b); 
		// System.out.println(a <= b); 
		// System.out.println(a >= b);
		// int a = 10; 
		// int b = 20; 
		// int c = 30; 
		// System.out.println(a < b && b < c); 
		// System.out.println(10 > 20 && 10 / 0 == 0);             // 打印 false
		// System.out.println(10 < 20 || 10 / 0 == 0);             // 打印 true
	// }
// }
	// public static void main(String[] args){
		// System.out.println(5/2);
		// System.out.println(5.0/2);
		// System.out.println((float)5/2);
		// System.out.println((float)(5/2));
		// int a = 10;
		// int b = ++a; //先++再赋值
		// System.out.println(b); 
		// int c = a++; 
		// System.out.println(c); //先赋值再++

	// }
//}
