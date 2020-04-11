
//1. 写代码实现: 给定两个 int 变量, 交换变量的值
// public class WorkTest{
	// public static void main(String[] args){
		// int a=5;
		// int b=10;
		// int tmp=0;
		// tmp=a;
		// a=b;
		// b=tmp;
		// System.out.println("交换之后a="+a+",b="+b);
	// }
// }
//2. 写代码实现: 给定三个 int 变量, 求其中的最大值和最小值
// public class WorkTest{
	// public static void main(String[] args){
		// int a=56;
		// int b=160;
		// int c=30;
		// int max=0;
		// int min=0;
		// if(a>b){
			// if(b>c){
				// max=a;
				// min=c;
			// }else{
				// min=b;
				// if(a>c){
					// max=a;
				// }else{
					// max=c;
				// }
			// }
		// }else{
			// if(b<c){
				// max=c;
				// min=a;
			// }else{
				// max=b;
				// if(a<c){
					// min=a;
				// }else{
					// min=c;
				// }
			// }
		// }
		// System.out.println("最大值为："+max);
		// System.out.println("最小值为："+min);
	// }
// }
//1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上) 
/* import java.util.Scanner;
public class WorkTest{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in); 
		System.out.println("请输入你的年龄：");
		int age=scan.nextInt();
		if(age<=18){
			System.out.println("少年！");
		}else if(age>=19&&age<=28){
			System.out.println("青年！");
		}else if(age>=29&&age<=55){
			System.out.println("中年！");
		}else if(age>=56){
			System.out.println("老年！");
		}
	}
} */
//2. 判定一个数字是否是素数 
// import java.util.Scanner;
// public class WorkTest{
	// public static void main(String[] args){
		// Scanner scan=new Scanner(System.in);
		// int num=scan.nextInt();
		// int flag=0;
		// for(int i=2;i<num;i++){
			// if(num%i==0){
				// System.out.println("这个数不是素数！");
				// flag=1;
				// break;
			// }
		// }
		// if(flag==0){
			// System.out.println("这个数是素数！");
		// }
			
	// }
// }
//3. 打印 1 - 100 之间所有的素数 

// public class WorkTest{
	// public static void main(String[] args){
		
		// for(int num=2;num<=100;num++){
			// int flag=1;
			// for(int i=2;i<num;i++){
				// if(num%i==0){
					// flag=0;
					// break;
				// }
			// }
			// if(flag==1){
				// System.out.println(num );
			// }
		// }
	// }
// }
//4. 输出 1000 - 2000 之间所有的闰年 
/* public class WorkTest{
	public static void main(String[] args){
		for(int year=1000;year<=2000;year++){
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				System.out.println(year);
			}
		}
	}
} */
//5. 输出乘法口诀表 
/* import java.util.Scanner;
public class WorkTest{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入n:");
		int n=scan.nextInt();
	   for(int i=1;i<=n;i++) {
		   for(int j=1;j<=i;j++){
			   System.out.print(j+"*"+i+"="+i*j+" ");
		   }
		   System.out.println("\n");
	   }
	}
} */
//6. 求两个正整数的最大公约数 
/* import java.util.Scanner;
public class WorkTest{
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int ret=a%b;
		while(ret!=0){
			a=b;
			b=ret;
			ret=a%b;
		}
		if(ret==0){
			System.out.println("两个数的最大公约数为："+b);
		}
	}
} */
//7. 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
/* public class WorkTest{
	public static void main(String[] args){
		int flag=1;
		double sum=0;
		for(int i=1;i<=100;i++){
			sum=sum+flag/(double)i;
			flag=-flag;
		}
		System.out.println(sum);
	}
} */
//8. 编写程序数一下 1到 100 的所有整数中出现多少个数字9
/* public class WorkTest{
	public static void main(String[] args){
		int sum=0;
		for(int num=1;num<=100;num++){
			
			if(num%10==9){
			    sum++;
			}
			if(num/10==9){
				sum++;
			}
		}
	  System.out.println(sum);
	}
} */
//9. 求出0～999之间的所有“水仙花数”并输出。
//(“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
//如；153＝1^3＋5^3＋3^3，则153是一个“水仙花数”。)
// public class WorkTest{
	// public static void main(String[] args){
		// for(int i=100;i<=999;i++){
			// //已知水仙花数是三位数
			// //求这个数的立方和
		   // int tmp=i;
		   // double sum=0;
		   // while(tmp!=0){
			   // int ret=tmp%10;
			   // sum=sum+Math.pow(ret,3);
			   // tmp=tmp/10;
		   // }
		   // if(i==sum){
			   // System.out.print(i+" ");
		   // }
		
		// }
	// }
// }
//10. 编写代码模拟三次密码输入的场景。
 //最多能输入三次密码，密码正确，提示“登录成功”,
 //密码错误，可以重新输入，最多输入三次。
// 三次均错，则提示退出程序 
 /* import java.util.Scanner;
public class WorkTest{
	public static void main(String[] agrs){
		Scanner scan=new Scanner(System.in);
		int flag=0;
		for(int i=0;i<3;i++){
			System.out.println("请输入密码：");
			Sting password=scan.nextLine();//123456
			if(password.equals("123456")){
				System.out.println("密码正确，登录成功！");
				break;
			}else{
				System.out.println("密码错误！");
				flag++;
			}
		}
		if(flag==3){
			System.out.println("三次密码均错误，退出程序！");
		}
		
	}
} */
//11. 写 一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个1 
/* import java.util.Scanner;
public class WorkTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int sum=0;
		System.out.println("请输入一个数：");
		int num=scan.nextInt();
	    while(num!=0){
			if(num%2==1){
				sum++;
			}
			num=num/2;
		}
	System.out.println("二进制中1的个数："+sum);	
	}
} */
//12. 获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
/* import java.util.Scanner;
public class WorkTest{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num=scan.nextInt();
		for(int i=30;i>=0;i-=2){
			System.out.print((num>>i)&1);
		}
		System.out.println("\n");
		for(int i=31;i>=1;i-=2){
			
			System.out.print((num>>i)&1);
		}
		System.out.println("\n");
	}
} */
//13. 输出一个整数的每一位. ?
import java.util.Scanner;
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
}
//14. 完成猜数字游戏?
/* import java.util.Scanner;
import java.util.Random;
public class WorkTest{
	public static void main(String[] args){
		Random random=new Random();
		Scanner scan =new Scanner(System.in);
		int guess=random.nextInt(100);//电脑生成一个随机数[0-100)
		while(true){
			System.out.println("请输入要输入的数字：");
			int sum=scan.nextInt();
			if(sum<guess){
				System.out.println("猜小了");
			}else if(sum<guess){
				System.out.println("猜大了");
			}else{
				System.out.println("恭喜你，猜中啦！");
				break;
			}
		}
	}
} */

