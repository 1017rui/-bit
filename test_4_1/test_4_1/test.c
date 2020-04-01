//复习之前相关代码
//计算n的阶乘
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
//int main()
//{
//	int n=0;
//	int i=0;
//	int ret=1;
//	printf("请输入：");
//	scanf("%d",&n);
//	for(i=1;i<=n;i++)
//	{
//		ret=ret*i;
//	}
//	printf("这个数的阶乘为：%d\n",ret);
//	return 0;
//}
//计算1！+2！+3！+.........+n!
//int main()
//{
//	int n=0;
//	int i=0;
//	int j=0;
//	int ret=1;
//	int sum=0;
//	scanf("%d",&n);
//	for(i=1;i<=n;i++)
//	{
//		ret=1;//要给ret置1
//		for(j=1;j<=i;j++)
//		{
//			ret=ret*j;//i!
//		}
//		sum=sum+ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//二分查找数组中某个元素的下标

//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	int k=7;//要查找的数字
//	int left=0;
//	int right=sz-1;
//	while(left<=right)
//	{
//	    int mid=(left+right)/2;
//		if(arr[mid]<k)
//		{
//		  left=mid+1;
//		}
//		 else if(arr[mid]>k)
//		{
//			right=mid-1;
//		}
//		else if(arr[mid]==k)
//		{
//			printf("找到了，下标为：%d\n",mid);
//			break;
//		}
//	}
//	if(left>right)
//	{
//	  printf("对不起，找不到");
//	}
//	return 0;
//}
//演示多个字符从两端移动，向中间汇聚
//#include<string.h>
//#include<windows.h>
//int main()
//{
//	char arr1[]="welcome to bit!!!";
//	char arr2[]="#################";
//	int len=strlen(arr1);
//	int left=0;
//	int right=len-1;
//	while(left<=right)
//	{
//		arr2[left]=arr1[left];
//		arr2[right]=arr1[right];
//		printf("%s\n",arr2);
//		Sleep(1000);//睡眠函数，单位是毫秒
//		system("cls");//执行系统命令，清理屏幕信息
//		left++;
//		right--;
//	}
//	return 0;
//}
//模拟用户登录情景，并且只能登陆三次，只允许输入三次密码，如果密码正确，则提示登陆成功，如果三次输入错误，则退出程序
//#include<string.h>
//int main()
//{
//	int i=0;
//	char password[20]={0};
//	for(i=0;i<3;i++)
//	{
//		printf("请输入密码:>");
//		scanf("%s",password);
//		//字符串比较大小不能直接用==进行比较，而应该使用strcmp(),进行比较
//		if(strcmp(password,"123456")==0)
//		{
//			printf("登陆成功\n");
//			break;
//		}
//		else
//		{
//			printf("密码错误\n");
//		}
//	}
//	if(i==3)
//    {
//		printf("三次密码错误，退出程序\n");
//    }
//return 0;
//}
//猜数字游戏
//#include <stdlib.h>
//#include<time.h>
//void game()
//{
//	//首先要让电脑随机生成一个数
//	int guess=0;
//	int ret=rand()%100+1;//生成1-100之间的随机整数
//	//接下来，开始猜数字
//	
//	while(1)
//	{
//	printf("请猜数字:>");
//	scanf("%d",&guess);
//	if(guess>ret)
//	{
//		printf("猜大了\n");
//	}
//	else if(guess<ret)
//	{
//		printf("猜小了\n");
//	}
//	else
//	{
//		printf("恭喜你，猜中啦！\n");
//		break;
//	}
// }
//}
//void menu()
//{
//	printf("*******************\n");
//	printf("***1.play 0.exit***\n");
//	printf("*******************\n");
//
//}
//int main()
//{
//	int input=0;
//	srand((unsigned int)time(NULL));//在调用rand之前，使用srand函数设置伪随机数生成器的种子
//	do{
//	 menu();
//	 printf("请选择:>");
//	 scanf("%d",&input);
//	 switch(input)
//	 {
//	 case 1:
//		 //printf("玩游戏\n");
//		 game();
//		 break;
//	 case 0:
//		 printf("退出游戏\n");
//		 break;
//	 default:
//		 printf("选择错误\n");
//		 break;
//	 }
//	}while(input);
//	return 0;
//}
//#include<string.h>
//int main()
//{
//	char arr1[20]="#########";
//	char arr2[]="bit";
//	strcpy(arr1,arr2);//把arr2中字符串的内容拷贝到arr1中
//	printf("%s\n",arr1);
//}
//递归求字符串的长度
//int my_strlen(char* str)
//{
//  if(*str!='\0')
//  {
//	  return 1+my_strlen(str+1);
//  }
//  else
//  {
//	  return 0;
//  }
//}
//int main()
//{
//	char arr[]="jiaxing";
//	int len=my_strlen(arr);
//	//my_strlen("bit")
//	//1+my_strlen("it")
//	//1+1+my_strlen("t")
//	//1+1+1+my_strlen("\0");
//	//1+1+1+0=3
//	printf("%d\n",len);
//	return 0;
//}
//递归求n!
//int Fac(int n)
//{
//	if(n==1)
//	{
//		return 1;
//	}
//	else
//	{
//		return n*Fac(n-1);
//	}
//}
//int main()
//{
//	int n=0;
//	int ret=0;
//	printf("请输入：\n");
//	scanf("%d",&n);
//	ret=Fac(n);
//	printf("%d\n",ret);
//	return 0;
//}
//冒泡排序：
 /*void BubbleSort(int arr[],int sz)
 {
	 int i=0;
	 int flag=0;
	 for(i=0;i<sz-1;i++)
	 {
		 int j=0;
		 for(j=0;j<sz-1-i;j++)
		 {
			 if(arr[j]<arr[j+1])
			 {
				 int tmp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=tmp;
				 flag=1;
			 }
			 if(flag==0)
			 {
			 break;
			 }
		 }
	 }
 }
 void  PrintArr(int* arr,int sz)
 {
	 int i=0;
	 for(i=0;i<sz;i++)
	 {
		 printf("%d ",arr[i]);
	 }
	 printf("\n");
 }

int main()
{
   int arr[10]={1,2,3,4,5,6,7,8,9,10};
   int sz=sizeof(arr)/sizeof(arr[0]);
   BubbleSort(arr,sz);
   PrintArr(arr,sz);
   return 0;
}
*/
//作业继续讲解
//写一个函数显示一个数二进制(补码)中1的个数
//方法一
//int Numberof1(unsigned int n)
//{
//	int count=0;
//	while(n)
//	{
//	   if(n%2==1)
//	   {
//		   count++;
//	   }
//	   n=n/2;
//	}
//	return count;
//}
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	//-1
//	//10000000000000000000000000000001原码
//	//11111111111111111111111111111110反码
//	//11111111111111111111111111111111补码
//	//13
//	//00000000000000000000000000001101
//	ret=Numberof1(num);
//	printf("%d\n",ret);
//	return 0;
//}
//方法二：效率低
//int Numberof1(int n)
//{
//	int i=0;
//	int count=0;
//	for(i=0;i<32;i++)
//	{
//		if((n>>i)&1==1)
//		{
//			count++;
//		}
//	}
//}
////13&1
////00000000000000000000000000001101
////00000000000000000000000000000001
////00000000000000000000000000000001
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	//-1
//	//10000000000000000000000000000001原码
//	//11111111111111111111111111111110反码
//	//11111111111111111111111111111111补码
//	//13
//	//00000000000000000000000000001101
//	ret=Numberof1(num);
//	printf("%d\n",ret);
//	return 0;
//}
//方法三
//int Numberof1(int n)
//{
//	int count=0;
//	while(n)
//	{
//		n=n&(n-1);//每执行一次，去掉一个1
//		count++;
//	}
//	return count;
//}
//
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	//-1
//	//10000000000000000000000000000001原码
//	//11111111111111111111111111111110反码
//	//11111111111111111111111111111111补码
//	//13
//	//00000000000000000000000000001101
//	ret=Numberof1(num);
//	printf("%d\n",ret);
//	return 0;
//}
//
//求两个数二进制位中不同的个数
//异或
//int main()
//{
//	int m=0;
//	int n=0;
//	int tmp=0;
//	int count=0;
//	scanf("%d%d",&m,&n);
//	tmp=m^n;//异或相同为0不同为1
//	while(tmp)
//	{
//		tmp=tmp&(tmp-1);
//		count++;
//	}
//	printf("%d\n",count);
//	return 0;
//}
//打印出奇数位和偶数位
//int main()
//{
//	int m=0;
//	int i=0;
//	scanf("%d",&m);
//	//10
//	//00000000000000000000000000001010
//	//打印奇数位
//	for(i=30;i>=0;i-=2)
//	{
//		printf("%d ",(m>>i)&1);
//	}
//	printf("\n");
//	//打印偶数位
//	for(i=31;i>=1;i-=2)
//	{
//		printf("%d ",(m>>i)&1);
//	}
//	printf("\n");
//	return 0;
//}
//指针
//int main()
//{
//	//int a=10;
//	//int* pa=&a;
//	char ch='w';
//	int a=10;
//	double d=10.0;
//	char* pc;
//	int* pa;
//	double* pd;
//	printf("%d\n",sizeof(pc));//4
//	printf("%d\n",sizeof(pa));//4
//    printf("%d\n",sizeof(pd));//4
//
//	return 0;
//}
//int main()
//{
//	int a=0x11223344;
//	int* pa=&a;
//	*pa=0;
//	return 0;
//}
//int main()
//{
//	int a=10;
//	int* pa=&a;
//	char* pc=&a;
//	printf("%p\n",pa);
//	printf("%p\n",pa+1);//pa是整型指针，+1就是跳过一个整型（4个字节）的意思，实际上加了4
//	printf("%p\n",pc);
//	printf("%p\n",pc+1);//pc是char*的指针，+1就是跳过一个字符（1个字节）的意思，实际上是加了1
//
//
//	return 0;
//}

//int main()
//{
//	int arr[10]={0x11223344,0x11223344,0x11223344,0x11223344,0x11223344,
//		0x11223344,0x11223344,0x11223344,0x11223344,0x11223344};
//	/*int i=0;
//	char* p= arr;
//	for(i=0;i<10;i++)
//	{
//		*(p+i)=1;
//	}*/
//	int i=0;
//	int* p=arr;
//	for(i=0;i<10;i++)
//	{
//		*(p+i)=1;
//	}
//	return 0;
//}
//1.没有初始化
//int main()
//{
//	//int a=0;
//	//printf("%d\n",a);
//	int *p;//野指针
//	*p=20;
//
//	return 0;
//}
//2.越界访问
//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int i=0;
//	int *p=arr;
//	for(i=0;i<=12;i++)
//	{
//		*p=0;
//		p++;
//	}
//	return 0;
//}
//3.指针指向的空间释放了
//int* test()
//{
//	int a=10;
//	return &a;
//}
//int main()
//{
//	int *p=test();
//	*p=20;
//	return 0;
//}
//int main()
//{
//	int a=10;
//	int *p=&a;//初始化
//	int *p2=NULL;
//	//使用p访问a
//	p=NULL;
//	if(p!=NULL)
//		*p=0;
//	return 0;
//}
//指针运算
//int main()
//{
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	int i=0;
//	int *p=arr;
//	for(i=0;i<10;i++)
//	{
//		printf("%d ",(*p+i));
//	}
//	return 0;
//}
//int main()
//{
//	//指针-指针的前提：
//	//两根指针指向同一块空间
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	printf("%d\n",&arr[9]-&arr[0]);
//	//指针-指针的绝对值是计算 指针和指针之间元素的个数
//	return 0;
//}
//#include<string.h>
////三种方法实现strlen
////1.计数器
////	2.递归
////	3.指针
//int my_strlen(char* str)
//{
//char* start=str;
//char* end=str;
//while(*end!='\0')
//{
//	end++;
//}
//return end-start;//?
//}
//
//int main()
//{
//	int len=my_strlen("abc");
//	//[a][b][c][\0]
//	printf("%d\n",len);
//	return 0;
//}
//int main()
//{
//	int arr[10]={0};
//	printf("%p\n",arr);
//	printf("%p\n",arr+1);
//
//	printf("%p\n",&arr[0]);
//	printf("%p\n",&arr[0]+1);
//
//	printf("%p\n",&arr);//数组指针类型
//	printf("%p\n",&arr+1);
//
//	//数组名是数组首元素的地址
//	//但是有两个例外
//	//sizeof(数组名)，计算的是整个数组的大小
//	//&数组名，表示整个数组
//
//	return 0;
//}

int main()
{
	int arr[10]={0};
	int i=0;
	int* p=arr;
	int sz=sizeof(arr)/sizeof(arr[0]);
	
	//数组可以通过指针来访问
	//初始化
	for(i=0;i<sz;i++)
	{
		//printf("%p---------%p",p+i,&arr[i]);
		*(p+i)=i+1;
	}
	//打印
	for(i=0;i<sz;i++)
	{
		//printf("%d ",*(p+i));//*(arr+i) arr[i] p[i]
		//printf("%d ",p[i]);//*(i+p)==*(p+i)==p[i]
		printf("%d ",i[p]);


	}
	/*for(i=0;i<sz;i++)
	{
		printf("%d ",arr[i]);
	}*/
	return 0;
}