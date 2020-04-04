//喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，给20元，可以多少汽水（编程实现）。
//#include<stdio.h>
//#define money 20
//int main()
//{
//	int soda=money/1;//初始的汽水数
//	int bottle=soda;//初始的汽水瓶
//	int num=soda;//记录总的汽水数
//	while(bottle>=2)
//	{
//		soda=bottle/2;//两个空瓶兑换一瓶汽水
//		num=num+soda;
//		bottle=bottle-soda*2;
//		bottle=bottle+soda;
//	}
//	printf("汽水总数：%d\n",num);
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//    int arr[] = {1,2,(3,4),5};
//    printf("%d\n", sizeof(arr));//4*4=16,其中arr指的是整个数组，sizeof(arr)求的是整个数组的大小。
//    return 0;
//}
//实现对数组元素的逆置
#include<stdio.h>
//void reverse1(int arr[],int sz)
//{
//
//	int* left=arr;
//	int* right=arr+sz-1;
//	while(left<right)
//	{
//		int tmp=*left;
//		*left=*right;
//		*right=tmp;
//		left++;
//		right--;
//	}
//}
//void reverse2(int arr[],int sz)
//{
//	int left=0;
//	int right=sz-1;
//	while(left<right)
//	{
//		int tmp=arr[left];
//		arr[left]=arr[right];
//		arr[right]=tmp;
//		left++;
//		right--;
//	}
//}
//void print(int arr[],int sz)
//{
//	int i=0;
//	for(i=0;i<sz;i++)
//	{
//		printf("%d ",arr[i]);
//	}
//	printf("\n");
//}
//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	reverse1(arr,sz);
//	print(arr,sz);
//	reverse2(arr,sz);
//	print(arr,sz);
//
//	return 0;
//}
//不创建变量交换两个数
/*int main()
{
	int a=0;
	int b=0;
	printf("请输入两个数：");
	scanf("%d%d",&a,&b);
	a=a^b;
	b=a^b;
	a=a^b;
	printf("交换之后：%d %d",a,b);
	return 0;
}*/
//逆置字符串
#define _CRT_SECURE_NO_WARNINGS
#include<string.h>
#include<stdio.h>
//void reverse_string(char arr[])
//{
//	int len=strlen(arr);
//	int left=0;
//	int right=len-1;
//	
//	while(left<right)
//	{
//		char tmp=arr[left];
//		arr[left]=arr[right];
//		arr[right]=tmp;
//		left++;
//		right--;
//	}
//
//}
//void reverse_string(char* str)
//{
//	char tmp=*str;
//	int len=strlen(str);
//	str[0]=str[len-1];
//	str[len-1]='\0';
//	if(strlen(str+1)>=2)
//	{
//		reverse_string(str);
//	}
//	str[len-1]=tmp;
//}
//int main()
//{
//	char arr[100]={0};//bit
//	gets(arr);
//	reverse_string(arr);
//	printf("%s\n",arr);
//	return 0;
//}
//int main()
//{
//	int n=10;
//	char* pc=(char*)&n;
//	int* pi=&n;
//	int i=0;
//	for(i=0;i<5;i++)
//	{
//		*(pc+i)=0;
//	}
//	printf("%p\n",&n);//
//	printf("%p\n",pc);
//	printf("%p\n",pc+1);
//	printf("%p\n",pi);//
//	printf("%p\n",pi+1);
//	return 0;
//}
//int main()
//{
//	int n=0x11223344;
//	char*pc=(char*)&n;
//	int* pi=&n;
//	*pc=0;
//	*pi=0;
//
//	return 0;
//}
//int main()
//{
//	int a=10;
//	int* pa=&a;
//	char* pc=(char*)&a;
//	printf("%p\n",pa);//pa是int*指针，+1就是跳过一个整型的意思，实际上是加了4
//	printf("%p\n",pa+1);
//	printf("%p\n",pc);//pc是char*的指针，+1就是跳过一个字符的意思，实际上是加了1
//	printf("%p\n",pc+1);
//	return 0;
//
//}
//int main()
//{
//	int arr[10]={0x11223344,0x11223344,0x11223344,0x11223344,0x11223344,
//		0x11223344,0x11223344,0x11223344,0x11223344,0x11223344};
//	int i=0;
//	char* p=(char*)arr;
//	for(i=0;i<10;i++)
//	{
//		*(p+i)=1;
//	}
//	/*int i=0;
//	int* p=arr;
//	for(i=0;i<10;i++)
//	{
//		*(p+i)=1;
//	}*/
//	return 0;
//}
//int main()
//{
//	int* p;//没有初始化的指针--野指针
//	*p=20;
//	return 0;
//}
//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int i=0;
//	int* p=arr;
//	for(i=0;i<=13;i++)
//	{
//		*p=0;
//		p++;//越界会导致野指针
//	}
//	return 0;
//
//}
//int* test()
//{
//	int a=10;//局部变量，生命周期进入这个函数开始，离开这个函数生命周期结束，a被销毁。
//	return &a;
//}
//int main()
//{
//	int* p=test();
//	*p=20;
//	return 0;
//}
//int main()
//{
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	printf("%d\n",&arr[9]-&arr[0]);//9
//	return 0;
//}
//int my_strlen(char* str)
//{
//		char*start=str;
//		char*end=str;
//		while(*end!='\0')
//		{
//			end++;
//		}
//		return end-start;
//}
//
//int main()
//{
//	char arr[100]={0};
//	int len=0;
//	gets(arr);
//	len=my_strlen(arr);
//	printf("%d\n",len);
//	return 0;
//}
//计数器实现My_strlen()
//int my_strlen(char arr[])
//{
//	int count=0;
//	int i=0;
//	while(arr[i]!='\0')
//	{
//		count++;
//		i++;
//	}
//	return count;
//}
//递归实现
//int my_strlen(char* arr)
//{
//	if(*arr!='\0')
//	{
//		return 1+my_strlen(arr+1);
//	}
//	else
//	{
//		return 0;
//	}
//}
//int main()
//{
//	char arr[100]={0};
//	int len=0;
//	gets(arr);
//    len=my_strlen(arr);
//	printf("%d\n",len);
//	return 0;
//}
int main()
{
	int line=0;
	int i=0;
	int j=0;
	scanf("%d",&line);
	for(i=0;i<line;i++)
	{
		for(j=0;j<line-1-i;j++)
		{
			printf(" ");
		}
		for(j=0;j<2*i+1;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=0;i<line;i++)
	{
		for(j=0;j<i+1;j++)
		{
			printf(" ");
		}
		for(j=0;j<2*(line-1-i)-1;j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;

}