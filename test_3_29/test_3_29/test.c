//操作符
#include<stdio.h>
//int main()
//{
//	//+ - * /
//	//除法
//	//int a=7/2;
//	//double a=7.0/2;
//	//printf("%f\n",a);
//	
//	int a=7%2;
//	printf("%d\n",a);
//	//对于%操作数来说只能操作整数
//	return 0;
//}
//移位操作符
//>>-右移操作符
//有两种移动方式
//算术右移，
//逻辑右移
//<<-左移操作符
//移动的是二进制位
//整数二进制表示形式有三种：原码，反码，补码
//内存中存储整数的时候存的是补码
//正整数，原码反码补码相同
//负整数直接写的二进制序列就是原码，原码的符号位不变，其他未按位取反就是反码，反码+1为补码
//int main()
//{
//	//int a=14;
//	//采用算术右移
//	//4个字节-32个比特位
//	//00000000000000000000000000001110
//	//
//	//int a=-1;
//	//10000000000000000000000000000001原码
//	//11111111111111111111111111111110反码
//	//11111111111111111111111111111111补码
//    /*int b=a>>1;
//	printf("%d\n",b);*/
//	int a=5;
//	int b=a<<1;
//	//00000000000000000000000000000101
//	//00000000000000000000000000001010
//	printf("%d\n",b);
//	return 0;
//}
//int main()
//{
//	int a=3;
//	int b=5;
//	//int c=a&b;//按二进制位与
//	//000000000000000000000000000000011
//	//000000000000000000000000000000101
//	//000000000000000000000000000000001//1
//	//int c=a|b;//按二进制或
//	//000000000000000000000000000000011
//	//000000000000000000000000000000101
//	//000000000000000000000000000000111//7
//	int c=a^b;//按位异或
//	//对应二进制位，相同为0，不同为1
//	//000000000000000000000000000000011
//	//000000000000000000000000000000101
//	//000000000000000000000000000000110//6
//	printf("c=%d\n",c);
//	return 0;
//}
//不能创建临时变量（第三个变量），实现两个数的交换。
//int main()
//{
//	int a=3;
//	int b=5;
//	//把a,b两个数交换
//  /*int c=0;
//  c=a;
//  a=b;
//  b=c;*/
//	//溢出
//	/*a=a+b;
//	b=a-b;
//	a=a-b;*/
//	a=a^b;
//	b=a^b;
//	a=a^b;
//  printf("%d %d\n",a,b);
//	return 0;
//}
//int main()
//{
//	//int a=9;
//	int num=0;
//	num=num+10;
//	num+=10;
//	num=num>>1;
//	num>>=1;
//
//	return 0;
//}
//int main()
//{
//	//2+3;//+有两个操作数-双目操作符
//	//int a=0;
//	//printf("%d\n",!a);//1
//	int flag=0;
//	if(flag)
//	{
//		//如果flag为真
//	}
//	if(!flag)
//	{
//		//如果flag 为假
//	}
//	return 0;
//
//}
//int main()
//{
//	/*int a=-3;
//	a=-a;
//	a=+a ;*/
//	int a=10;
//	printf("%p\n",&a);//&取地址操作符
//	int* pa=&a;//pa是指针变量
//	*pa=20;//*解引用操作符
//	printf("a=%d\n",a);
//
//	return 0;

//}
//int main()
//{int a=3;
//int b=5;
//int c=a&&b;
//printf("%d\n",c);//1
//return 0;
//}
//int main()
//{
//	int a=10;
//	int b=20;
//	int max=0;
//	if(a>b)
//	{
//		max=a;
//	}
//	else
//		max=b;
//	//条件操作符-三目操作符
//	max=(a>b)?(a):(b);
//	return 0;
//}
//int main()
//{
//	int arr[]={1,2,3,4,5,6};
//	printf("%d\n",arr[2]);//[]下标引用操作符
//	return 0;
//	
//}
//int Add(int x,int y)
//{
//	int z=0;
//	z=x+y;
//	return z;
//}
//int main()
//{
//	int a=10;
//	int b=20;
//	int ret=Add(a,b);
//	printf("%d\n",ret);
//}
//#include <stdio.h>
//int main()
//{
//    int i = 1;
//    int ret = (++i)+(++i)+(++i);
//    printf("ret = %d\n", ret);
//	return 0;
//}
//#include <stdio.h>
//int i;
//int main()
//{
//    i--;
//    if (i > sizeof(i))
//    {
//        printf(">\n");
//    }
//    else
//    {
//        printf("<\n");
//    }
//    return 0; 
//}
//赋值操作符
//int main()
//{
//	//int a=0;
//	//a=20;//赋值操作符
//	int num=0;
//	num=num+10;
//	num+=10;
//
//	return 0;
//}
//int main()
//{
//	//2+3;//有两个操作数-双目操作符，只有一个操作数的叫单目操作符
//	//int a=0;
//	//printf("%d\n",!a);//1,注意并不是1表示真，在c语言中，0表示假，非零表示真。
//	
//	int flag=0;
//	if(flag)
//	{
//		//如果 flag为真进来
//	}
//	if(!flag)
//	{
//		//如果flag为假进来
//	}
//	return 0;
//}
//int main()
//{
//	int a=10;
//	int* pa=&a;//pa是一个指针变量
//	*pa=20;//*解引用操作符
//	printf("%p\n",&a);//&取地址操作符
//	printf("a=%d\n",a);
//	return 0;
//}
//int main()
//{
//	int a=0;//sizeof可以计算变量所占空间大小
//	int arr[10]={0};
//	printf("%d\n",sizeof(a));//4
//	printf("%d\n",sizeof(int));//4
//
//	printf("%d\n",sizeof(arr));//40计算数组的总大小，单位是字节
//	printf("%d\n",sizeof(int[10]));//40
//	return 0;
//}
//int main()
//{
//	int a=10;//int 长整型长度4
//	short s=5;//short 短整长度2
//	printf("%d\n",sizeof(s=a+3));//2，sizeof中放的表达式不会真的计算，
//	printf("%d\n",s);//5，s没有改变
//	return 0;
//
//}
//int main()
//{
//	int a=0;
//	printf("%d\n",~a);//-1
//	//00000000000000000000000000000000-补码
//	//11111111111111111111111111111111-补码
//	//11111111111111111111111111111110-反码
//	//10000000000000000000000000000001-原码
//	return 0;
//}
//int main()
//{
//	int a=13;
//	a=a|(1<<4);
//	printf("%d\n",a);//29
//	a=a &(~(1<<4));
//	printf("%d\n",a);//13
//	//00000000000000000000000000001101
//	//00000000000000000000000000010000 |   1<<4
//	//--------------------------------
//	//00000000000000000000000000011101
//	//11111111111111111111111111101111 &  ~(1<<4)
//	//00000000000000000000000000001101
//	return 0;
//}
//void test1(int arr[])//传过来的是首元素的地址，实质上是指针
//{
//	printf("%d\n",sizeof(arr));//指针的大小是4或8，本机是4
//}
//void test2(char ch[])
//{
//	printf("%d\n",sizeof(ch));//4
//}
//int main()
//{
//	int arr[10]={0};
//	char ch[10]={0};
//	printf("%d\n",sizeof(arr));//4*10=40
//	printf("%d\n",sizeof(ch));//1*10=10
//	test1(arr);
//	test2(ch);
//	return 0;
//}
//int main()
//{
//	int i=0,a=0,b=2,c=3,d=4;
//	i=a++&&++b&&d++;
//	printf("a=%d\n b=%d\n c=%d\n d=%d\n",a,b,c,d);//由于是后置++操作，所以先赋值
//	//则a=0,赋给i，之后a++,则结果a=1;
//	//由于是与操作，只要有一个表达式的结果为零，那么整个表达式的结果为零
//	//所以++b,d++不会执行
//	//则a=1;b=2;c=3;d=4
//	return 0;
//}
//结构体
//复杂对象-描述-复杂类型
//学生：姓名+电话+年龄+性别
//#include<string.h>
//struct Stu
//{
//	char name[20];
//	int age;
//	char tele[12];
//	char sex[5];
//};
//int main()
//{
//	struct Stu s={"张三",20,"13772746887","男"};//s是结构体变量，
//	//结构体变量.成员名
//	//结构体指针->成员名
//	//
//	//strcpy(s.name,"zhangsan");
//	//printf("%d\n",s.name);
//    struct Stu* ps=&s;
//    printf("%s\n",ps->name);
//    printf("%d\n",ps->age);
//
//return 0;
//}
//int main()
//{
//	char a=3;//截断
//	//00000000000000000000000000000011
//	//00000011-a
//	char b=127;
//	//00000000000000000000000001111111
//	//01111111-b
//	char c=a+b;
//	//00000000000000000000000000000011
//	//00000000000000000000000001111111
//    //00000000000000000000000010000010      
//	//10000010-c
//	//11111111111111111111111110000010-补码
//	//11111111111111111111111110000001=反码
//	//10000000000000000000000001111110-原码
//	//-126
//	printf("%d\n",c);//%d打印10进制的有符号整型
//
//	return 0;
//
//}、
//int main()
//{
//	char a=0xb6;
//	short b=0xb600;
//	int c=0xb6000000;
//	if(a==0xb6)//a发生了整型提升后值发生了改变
//		printf("a");
//	if(b==0xb600)//b发生整型提升后值发生了改变
//		printf("b");
//	if(c==0xb6000000)
//		printf("c");//c
//
//	return 0;
//}
//int main()
//{
//	char c=1;
//	printf("%u\n",sizeof(c));
//	printf("%u\n",sizeof(+c));
//    printf("%u\n",sizeof(-c));
//
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int a, b, c;
//	a = 5;
//	c = ++a;
//	b = ++c, c++, ++a, a++;
//	b += a++ + c;
//	printf("a = %d b = %d c = %d\n:", a, b, c);
//	return 0;
//}


//打印整数二进制的奇数位和偶数位
//获取一个整数二进制序列中所有的偶数位和奇数位，分别打印出二进制序列
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//void FindEvenBit( int n)//获取偶数位
//{
//	int i=0;
//	for(i=30;i>=0;i=i-2)
//	{
//		printf("%d",(n>>i)&1);
//	}
//	printf("\n");
//}
//void FindOddBit(int n)//获取奇数位
//{
//	int i=0;
//	for(i=31;i>=0;i=i-2)
//	{
//		printf("%d",(n>>i)&1);
//	}
//	printf("\n");
//}
//int main()
//{
//	int num=0;
//	printf("请输入一个整数：");
//	scanf("%d",&num);
//	FindEvenBit(num);
//	FindOddBit(num);
//	return 0;
//}
//统计二进制中1的个数
//写一个函数返回参数二进制中 1 的个数。
//比如： 15    0000 1111    4 个 1
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int FindCount(int n)
//{
//	int i=0;
//	int count=0;
//	for(i=31;i>=0;i--)
//	{
//		if(((n>>i)&1)==1)
//			count++;
//	}
//	return count;
//}
//int main()
//{
//	int num=0;
//	printf("请输入一个整数:");
//	scanf("%d",&num);
//	printf("这个数二进制中 1 的个数为:%d\n",FindCount(num));
//	return 0;
//}
//交换两个变量（不创建临时变量）
//不允许创建临时变量，交换两个整数的内容
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int main()
//{
//	int a=0;
//	int b=0;
//	printf("请输入两个数：");
//	scanf("%d%d",&a,&b);
//	a=a^b;
//	b=a^b;
//	a=a^b;
//	printf("交换之后：a=%d,b=%d\n",a,b);
//	return 0;
//}
//求两个数二进制中不同位的个数
//编程实现：两个int（32位）整数m和n的二进制表达中，有多少个位(bit)不同？ 
//输入例子:
//1999 2299
//输出例子:7
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
int DifferentBit(int a,int b)
{
	int tmp = a^b;
	int count = 0;
	while(tmp)
	{
		tmp = tmp&(tmp-1);
		count++;
	}
	return count;
	
}
int main()
{
	int m=0;
	int n=0;
	printf("请输入两个整数：");
	scanf("%d%d",&m,&n);
	printf("二进制不同位为：%d",DifferentBit(m,n));
	return 0;
}