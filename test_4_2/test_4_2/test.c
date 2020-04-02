//#include <stdio.h>
//int main()
//{
//  int arr[] = {1,2,3,4,5};//4个字节
//  short *p = (short*)arr;//2个字节
//  int i = 0;
//  for(i=0; i<4; i++)
//  {
//    *(p+i) = 0;
//  }
//   
//  for(i=0; i<5; i++)
//  {
//    printf("%d ", arr[i]);
//  }
//  return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int a = 0x11223344;
//    char *pc = (char*)&a;
//    *pc = 0;
//    printf("%x\n", a);
//    return 0;
//}
//写一个函数打印arr数组的内容，不使用数组下标，使用指针。
//arr是一个整形一维数组。
//#include<stdio.h>
//void PrintArr(int* arr,int sz)
//{
//	int i=0;
//	for(i=0;i<sz;i++)
//	{
//		printf("%d ",*(arr+i));
//	}
//}
//
//int main()
//{
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	PrintArr(arr,sz);
//	return 0;
//}
//写一个函数，可以逆序一个字符串的内容。
#include<string.h>
#include<stdio.h>
//void ReverseString(char* arr,int sz)
//{
//	int left=0;
//	int right=sz-1;
//	
//	while(left<right)
//	{
//		char tmp=arr[left];
//		arr[left]=arr[right];
//		arr[right]=tmp;
//		left++;
//		right--;
//	}
//}
void ReverseString(char* arr,int sz)
{
	char* left=arr;
	char* right=arr+sz-1;
	while(left<right)
	{
		char tmp=*left;
		*left=*right;
		*right=tmp;
		left++;
		right--;
	}
}
void PrintString(char* arr,int sz)
{
	int i=0;
	for(i=0;i<sz;i++)
	{
		printf("%c",*(arr+i));
	}
	printf("\n");
}

//int main()
//{
//	
//	 char arr[]="i am a student";
//     int sz=strlen(arr);
//	 PrintString(arr,sz);
//	 ReverseString(arr,sz);
//	 PrintString(arr,sz);
//	return 0;
//}
//求Sn=a+aa+aaa+aaaa+aaaaa的前5项之和，其中a是一个数字，例如：2+22+222+2222+22222
//#include<stdio.h>;
//#include<math.h>
//int main()
//{
//	int a=0;
//	int i=0;
//	int ret=0;
//	int sum=0;
//	printf("请输入：");
//	scanf("%d",&a);
//	for(i=0;i<5;i++)
//	{
//		ret=ret+a*pow(10,i);
//        sum=sum+ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//int main()
//{
//	int a=0;
//	int i=0;
//	int ret=0;
//	int sum=0;
//	printf("请输入：");
//	scanf("%d",&a);
//	for(i=0;i<5;i++)
//	{
//		ret=ret*10+a;
//        sum=sum+ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//求出0～100000之间的所有“水仙花数”并输出。
//“水仙花数”是指一个n位数，其各位数字的n次方之和确好等于该数本身，如:153＝1^3＋5^3＋3^3，则153是一个“水仙花数”。
//#include<stdio.h>
//#include<math.h>
//int main()
//{
//	int i=0;
//	int count=0;
//	int sum=0;
//	int tmp=0;
//	for(i=1;i<=100000;i++)
//	{
//		//求位数
//	    tmp=i;
//		while(tmp)
//		{
//			count++;
//			 tmp=tmp/10;
//		}
//		//求立方和
//		tmp=i;
//		sum=0;
//		while(tmp)
//		{
//			sum=sum+pow((tmp%10),3);
//			tmp=tmp/10;
//		}
//		//判断
//		tmp=i;
//		if(i==sum)
//		{
//			printf("%d ",i);
//		}
//	
//	}
//	return 0;
//}
//用C语言在屏幕上输出以下图案：
#include<stdio.h>
int main()
{
	int i = 0;
	//打印上半部分7行
	for(i=1; i<=7; i++)
	{
		int j = 1;
		for(j=1; j<=7-i; j++)
		{
			printf(" ");
		}
		for(j=1; j<=2*(i-1)+1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	
   //打印下半部分6行
	for(i=1; i<=6; i++)
	{
		int j = 1;
		for(j=1; j<=i; j++)
		{
			printf(" ");
		}
		for(j=1;j<=2*(6-i)+1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}