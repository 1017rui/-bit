//#include <stdio.h>
//int main()
//{
//	int a = 0, b = 0;
//	for (a = 1, b = 1; a <= 100; a++)
//	{
//		if (b >= 20) break;
//		if (b % 3 == 1)
//		{
//			b = b + 3;
//			continue;
//		}
//		b = b-5;
//	}
//	printf("%d\n", a);
//	return 0;
////}编写程序数一下 1到 100 的所有整数中出现多少个数字9
//#include<stdio.h>
//int main()
//{
//	int i=1;
//	int count=0;
//	while(i<=100)
//	{
//      if(i%10==9)
//	     count++;
//	  if(i/10==9)
//		  count++;
//      i++;
//	}
//	printf("%d ",count);
//	return 0;
//}//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值，打印出结果
//#include <stdio.h>
//int main()
//{
//	int i=1;
//	int flag=1;
//	double num=0;
//	while(i<=100)
//	{
//		
//      num=num+((double)flag)/i;
//	  flag=-flag;
//	  i++;
//	}
//	printf("%f",num);
//	return 0;
//}//求10 个整数中最大值
////
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//int main()
//{
//	int arr[10];
//	int i=0;
//	int max=0;//注意：一开始不能给max赋值成arr[0],因为此时还没有输入值，没有任何意义。
//	printf("请输入十个整数：\n");
//	//录入十个整数，放在数组中
//	for(i=0;i<10;i++)
//	{
//		scanf("%d",&arr[i]);
//	}
//	//找出十个数中的最大数
//     max=arr[0];
//    for(i=0;i<10;i++)
//	{
//		if(arr[i]>=max)
//		{
//			max=arr[i];
//		}
//	}
//	//输出最大值
//	printf("%d ",max);
//	return 0;
//}//在屏幕上输出9*9乘法口诀表
//#include<stdio.h>
//int main()
//{
//	int row=1;//行
//	int column=1;//列
//	for(column=1;column<=9;column++)
//	{
//		for(row=1;row<=9;row++)
//		{
//			if(row<=column)	
//			{	
//				printf("%d*%d=%d ",row,column,row*column);
//			}
//			if(row==column)
//			{
//				printf("\n");
//				break;
//			}
//		}
//	}
//	return 0;
//}
//上课回顾：
//求两个数的最大公约数：
//#include<stdio.h>
//int main()
//{
//	int m=24;
//	int n=18;//24，18最大公约数最大最大是18
//	int min=m>n?n:m;
//	while(1)
//	{
//		if(m%min==0&&n%min==0)
//		{
//			printf("最大公约数是：%d\n",min);
//			break;
//		}
//		min--;
//	}
//
//
//	return 0;
//}
//int main()
//{
//	int m=24;
//	int n=18;
//	//辗转相除法
//	while(m%n)
//	{//循环为假进入循环
//		int r=m%n;
//		m=n;
//		n=r;
//	}
//	printf("最大公约数：%d",n);//循环为假的情况，说明m%n=0，n为最大公约数。
//	return 0;
//}
//求100-200之间的素数
//int main()
//{
//	int i=100;
//	while(i<=200)
//	{
//		int j=2;
//		while(j<i)
//		{
//			if(i%j==0)
//			{
//				break;
//				
//			}
//			j++;
//		}
//		if(j==i)
//		{
//			printf("%d ",i);
//		}
//		i++;
//	}
//	return 0;
//}//当i=a*b的时候，则a或b中至少有一个数字是<开平方i
//#include<math.h>
//int main()
//{
//	int i=101;
//	int count=0;
//	while(i<=200)
//	{
//		int j=2;
//		while(j<=sqrt(i))
//		{
//			if(i%j==0)
//			{
//				break;
//				
//			}
//			j++;
//		}
//		if(j>sqrt(i))
//		{
//			printf("%d ",i);
//			count++;
//		}
//		i=i+2;//直接跳过素数，偶数一定不是素数
//	}
//	printf("%d\n ",count);
//	return 0;
//}
//int main()
//{
//	int ch=0;
//     /*ch=getchar();
//     putchar(ch);*/
//	while((ch=getchar())!=EOF)//EOF文件结束标志，放在文件末尾，按ctrl＋Z即可。
//		putchar(ch);
//	return 0;
//}
//int main()
//{
//	char input[20]={0};
//	int ch=0;
//	printf("请输入密码：>");
//	scanf("%s",input);
//	printf("请确认密码（Y/N）:>");
//	//getchar();
//	//清空缓冲区
//	while((ch=getchar())!='\n')
//	{
//		;
//	}
//	ch=getchar();
//	if(ch=='Y')
//	{
//		printf("确认成功\n");
//	}
//	else
//	{
//		printf("确认失败\n");
//	}
//	return 0;
//}代码二：
//int main()
//{
//	int ch=0;
//	while((ch=getchar())!=EOF)
//	{
//		if(ch<'0'||ch>'9')
//			continue;
//		putchar(ch);
//	}
//	return 0;
//}计算n的阶乘
//int main()
//{
//	int n=0;
//	int i=1;
//	int ret=1;
//	scanf("%d",&n);
//	for(i=1;i<=n;i++)
//	{
//	 ret=ret*i;
//	}
//	printf("%d",ret);
//	return 0;
//}计算1!+2!+3!+.....+n!
//int main()
//{
//	int n=0;
//	int i=1;
//	int ret=1;
//	int sum=0;
//	for(n=1;n<=3;n++)
//	{
//		ret=1;
//		for(i=1;i<=n;i++)
//		{
//			ret=ret*i;
//			
//		}
//		sum=sum+ret;
//	}
//printf("%d",sum);
//	return 0;
//}计算n的阶乘：
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//int main()
//{
//int n=0;
//int i=1;
//int ret=1;
//printf("输入一个整数:");
//scanf("%d",&n);
//for(i=1;i<=n;i++)
//{
//ret=ret*i;
//}
//printf("它的阶乘为：%d",ret);
//	return 0;
//}计算1！+2！+3!+4!+5!....+n!
//int main()
//{
//	int n=0;
//	int i=1;
//	int m=1;
//	int ret=1;
//	int sum=0;
//	printf("输入一个整数:");
//    scanf("%d",&n);
//    for(m=1;m<=n;m++)
//     {
//	 ret=1;
//	 for(i=1;i<=m;i++)
//	{
//
//	 ret=ret*i;
//	}
//	sum=sum+ret;
//}
//printf("结果为：%d",sum);
//	return 0;
//}
//int main()
//{
//	int n=0;
//	int i=1;
//	int ret=1;
//	int sum=0;
//	for(n=1;n<=3;n++)
//	{
//		ret=ret*n;
//		sum=sum+ret;
//	}
//	printf("%d",sum);
//
//	return 0;
//}
//在一个有序数组中查找具体的某个数字n
#include<stdio.h>
//int main()
//{
//	//int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	//下标从零开始
//	int k=7;//要找的数字
//	int sz=sizeof(arr)/sizeof(arr[0]);//计算元素个数
//	int i=0;
//	for(i=0;i<sz-1;i++)
//	{
//		//0-9
//		if(arr[i]==k)
//		{
//			printf("找到了，下标是：%d\n",i);
//		break;
//		}
//	}
//	if(i==sz)
//	{
//		printf("找不到\n");
//	}
//	return 0;
//}
//int main()
//{
//	//int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	//下标从零开始
//	int k=7;//要找的数字
//	int sz=sizeof(arr)/sizeof(arr[0]);//计算元素个数
//	
//    int left=0;
//	int right=sz-1;
//	
//	while(left<=right)
//	{
//		//0-9
//		int mid=(left+right)/2;
//		if(arr[mid]<k)
//		{
//			left=mid+1;
//		}
//		else if(arr[mid]>k)
//		{
//			right=mid-1;
//		}
//		else
//		{
//			printf("找到了，下标是：%d\n",mid);
//		    break;
//		}
//		
//	}
//	if(left>right)
//	{
//		printf("找不到\n");
//	}
//	return 0;
//}
//. 编写代码，演示多个字符从两端移动，向中间汇聚
#define _CRT_SECURE_NO_WARNINGS
#include<string.h>
#include<windows.h>
//int main()
//{
//	//welcome to bit!!!!!!!!
//	//######################
//	//w####################!
//	//we##################!!
//	//wel################!!!
//	//welcome to bit !!!!!!!
//	char arr1[]="welcome to bit!!!!!!!!";
//	char arr2[]="######################";
//	int len=strlen(arr1);
//	int left=0;
//	int right=len-1;
//	while(left<=right)
//	{
//		arr2[left]=arr1[left];
//		arr2[right]=arr1[right];
//		printf("%s\n",arr2);
//		Sleep(1000);//睡眠函数-单位是毫秒
//		system("cls");//执行系统命令,cls清理屏幕信息
//		left++;
//		right--;
//	}
//	printf("%s\n",arr2);
//	return 0;
//}
//编写代码实现，模拟用户登录情景，并且只能登录三次。
//（只允许输入三次密码，如果密码正确则 提示登录成，如果三次均输入错误，则退出程序。
//int main()
//{
//	int i=0;
//	char password[20]={20};
//	for(i=0;i<3;i++)
//	{
//		printf("请输入密码：>");
//		scanf("%s",password);//假设正确的密码是123456
//		//判断
//		//两个字符串比较大小不能直接用==。应该使用strcmp(),
//		if(strcmp(password,"123456")==0)
//		{
//			printf("登录成功\n");
//			break;
//		}
//		else
//		{
//			printf("密码错误\n");
//		}
//	}
//	if(i==3)
//	{
//		printf("三次密码错误，退出程序\n");
//	}
//	return 0;
//}
//猜数字游戏：
#include<stdlib.h>
#include<time.h>
//void menu()
//{
//	printf("***************************\n");
//	printf("*** 1.play       0.exit ***\n");
//	printf("***************************\n");
//}
////RAND_MAX-32767
////rand函数返回0-32767之间的随机整数
////time 函数可以返回时间戳
////时间戳指计算机在调用time函数这个时间和计算机的起始时间（1970.1.1  0:0:0）的一个差值，单位是秒
//void game()
//{
//	int guess=0;
//	//1.电脑生成一个随机数
//
//	//srand只要调用一次，不能频繁的调用
//	//srand((unsigned int)time(NULL));
// 	int ret =rand()%100+1;//1-100之内
//	//printf("%d\n",ret);
//	//2.猜数字
//	while(1)
//	{
//		printf("请猜数字：>");
//		scanf("%d",&guess);
//		if(guess>ret)
//		{
//			printf("猜大了\n");
//		}
//		else if(guess<ret)
//		{
//			printf("猜小了\n");
//		}
//		else
//		{
//			printf("恭喜你 ，猜对啦\n");
//			break;
//		}
//	}
//}
//int main()
//{
//	int input=0;
//	
//	//srand只要调用一次，不能频繁的调用
//	srand((unsigned int)time(NULL));
//	do{
//		menu();
//		printf("请选择:>");
//		scanf("%d",&input);
//		switch(input)
//		{
//		case 1:
//			//printf("猜数字\n");
//			game();
//			break;
//		case 0:
//			printf("退出游戏\n");
//			break;
//		default:
//			printf("选择错误\n");
//			break;
//
//		}
//
//	  }while(input);
//	return 0;
//}
//关机程序：
//
//作业：编写程序数一下 1到 100 的所有整数中出现多少个数字9、
//int main()
//
//{
//
//int i=1;
//
//int count=0;
//
//for(i=1;i<=100;i++)
//{
//	if(i%10==9)
//	{
//		count++;
//	}
//	if(i/10==9)
//	{
//		count++;
//	}
//}
//printf("%d ",count);
//
//return 0;
//
//}
//打印乘法口诀表：
//int main()
//{
//	int i=0;
//	for(i=0;i<=9;i++)
//	{
//		//每次打印一行
//		int j=0;
//		for(j=1;j<=i;j++)
//		{
//			printf("%d*%d=%2d ",i,j,i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//}
//int main()
//{
//	int len=strlen("abc");
//	printf("%d\n",len);
//}