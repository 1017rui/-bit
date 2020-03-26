//递归方式实现打印一个整数的每一位
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//void Print(int n)
//{
//	if(n>9)
//	{
//		Print(n/10);
//	}
//	printf("%d ",n%10);
//}
//int main()
//{
//	int n=0;
//	scanf("%d",&n);
//	Print(n);
//	return 0;
//}
//递归和非递归分别实现求n的阶乘（不考虑溢出的问题）
//递归实现
//#define _crt_secure_no_warnings
//#include<stdio.h>
//int fac(int n)
//{
//	if(n<=1)
//		return 1;
//	else
//	return n*fac(n-1);
//}
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	ret=fac(num);
//	printf("%d",ret);
//	return 0;
//}
//非递归实现
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int Fac(int n)
//{
//	int i=0;
//	int ret=1;
//	for(i=1;i<=n;i++)
//	{
//		ret=ret*i;
//	}
//	return ret;
//}
//int main()
//{
//	int n=0;
//	int ret=0;
//	scanf("%d",&n);
//	ret=Fac(n);
//	printf("%d",ret);
//	return 0;
//}
//递归和非递归分别实现strlen
//递归实现
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int my_strlen(char* str)
//{
//	if(*str=='\0')
//	{
//		return 0;
//	}
//	return 1+my_strlen(str+1);
//
//}
//int main()
//{
//	char ch[]="abc";
//	int len=0;
//	len=my_strlen(ch);
//	printf("%d\n",len);
//	return 0;
//}
////非递归实现
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int my_strlen(char* str)
//{
//	int count=0;
//	while(*str!='\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char ch[]="abc";
//	int len=0;
//	len=my_strlen(ch);
//	printf("%d\n",len);
//	return 0;
//}
//编写一个函数 reverse_string(char * string)（递归实现）
//实现：将参数字符串中的字符反向排列。
//要求：不能使用C函数库中的字符串操作函数。
//#include<stdio.h>
//void reverse_string(char * string)
//{
//	if(*string=='\0')
//	{
//		return ;
//	}
//	reverse_string(string+1);
//	printf("%c",*string);
//}
//int main()
//{
//	char ch[]="abc";
//    reverse_string(ch);
//	//reverse_string(abc)
//	//a+reverse_string(bc)
//	//a+b+reverse_string(c)
//	//a+b+c+reverse_string(\0)
//	//a+b+c+
//	return 0;
//} 
//写一个递归函数DigitSum(n)，输入一个非负整数，返回组成它的数字之和
//例如，调用DigitSum(1729)，则应该返回1+7+2+9，它的和是19
//输入：1729，输出：19
//#define _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//int DigitSum(int n)
//{
//	int s=0;
//    if(n>0)
//	{
//		s= DigitSum(n/10)+n%10;
//	}
//	return s;
//}
//int main()
//{
//	int num=0;
//	int sum=0;
//	printf("请输入一个非负整数：\n");
//	scanf("%d",&num);//1729
//	sum=DigitSum(num);
//	//DigitSum(1729)
//	//DigitSum(1729/10)+1729%10=DigitSum(172)+9
//	//DigitSum(172/10)+172%10=DigitSum(17)+2+9
//	//DigitSum(1)+7+2+9
//	//1+7+2+9
//	printf("%d\n",sum);
//
//	return 0;
//
//}
//编写一个函数实现n的k次方，使用递归实现。
//#define _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//int power(int n,int k)
//{
//	if(k==0)
//	{
//		return 1;
//	}
//	else
//	{
//		return n*power(n,k-1);
//	}
//}
//int main()
//{
//	int num=0;
//	int k=0;
//	int ret=0;
//	scanf("%d%d",&num,&k);
//	ret=power(num,k);
//	printf("%d\n",ret);
//	return 0;
//}
//递归和非递归分别实现求第n个斐波那契数
//例如：
//输入：5  输出：5
//输入：10， 输出：55
//输入：2， 输出：1
//递归实现
//#define _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//int Fib(int n)
//{
//	int ret=0;
//	if(n<=2)
//	{
//		return 1;
//	}
//	else
//	{
//		return Fib(n-1)+Fib(n-2);
//	}
//}
//int main()
//{
//	int num=0;
//	int ret=0;
//	printf("请输入一个数: ");
//	scanf("%d",&num);
//	ret=Fib(num);
//	printf("斐波那契数为: %d\n",ret);
//	return 0;
//}
//非递归实现
#define _CRT_SECURE_NO_WARNINGS 
#include<stdio.h>
int Fib(int n)
{   int a=1;
	int b=1;
	int c=1;
	while(n>2)
	{
		c=a+b;
		a=b;
		b=c;
		n--;
	}
	return c;
}
int main()
{
	int num=0;
	int ret=0;
	printf("请输入一个数: ");
	scanf("%d",&num);
	ret=Fib(num);
	printf("斐波那契数为: %d\n",ret);
	return 0;
}