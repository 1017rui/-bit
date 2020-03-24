//strcpy--string copy字符串拷贝
//char * strcpy ( char * destination, const char * source );
//字符串操作函数
#include<stdio.h>
#include<string.h>
//int main()
//{
//	char arr1[20]="##########";
//	char arr2[]="bit";
//	strcpy(arr1,arr2);
//	printf("%s\n",arr1);//bit
//	return 0;
//}
//memset
//mem是memory（内存）的缩写，set设置--设置内存
//void * memset ( void * ptr, int value, size_t num );
//int main()
//
//{
//	char arr[]="hello bit";
//	memset(arr,'*',5);
//	printf("%s\n",arr);//***** bit
//	return 0;
//}
//写一个函数可以找出两个整数中的较大数
int get_max(int x,int y)
{
	return(x>y?x:y);
}
int main()
{
	int a=10;
	int b=20;
	int max=0;

	max=get_max(a,b);
	max=get_max(a,b);

	printf("max=%d\n",max);//20

	return 0;
}
//写一个函数可以交换两个整形变量的内容
// void Swap1(int x,int y)//void表示不需要返回
//{
//	int tmp=0;
//	tmp=x;
//	x=y;
//	y=tmp;
//}
//  void Swap2(int *pa,int *pb)//void表示不需要返回
//{
//	int tmp=0;
//	tmp=*pa;
//	*pa=*pb;
//	*pb=tmp;
//
//}
//int main()
//{
//	
//	int a=10;
//	int b=20;
//	//int tmp=0;
//	printf("a=%d,b=%d\n",a,b);
//	//Swap1(a,b);
//	Swap2(&a,&b);
//	/*tmp=a;
//	a=b;
//	b=tmp;*/
//	printf("a=%d,b=%d\n",a,b);
//	return 0;
//
//}
////int main()
//{
//
//	int a=10;
//	int* pa=&a;//拿到了a的地址
//	*pa=20;
//	printf("%d\n",a);
//	return 0;
//
//}
//1. 写一个函数可以判断一个数是不是素数
//#include<math.h>
//int is_Prime(int n)
//{
//    //判断n是否为素数
//	//2 - n-1数字试除
//	int i=0;  
//		for(i=2;i<=sqrt(n);i++)
//		{
//			if(n%i==0)
//				return 0;
//		}
//		//是素数
//		return 1;
//}
//int main()
//{
//	int i=0;
//	for(i=100;i<=200;i++)
//	{
//	if(is_Prime(i)==1)
//	{
//		printf("%d ",i);
//	}
//	}
//	return 0;
//
//}
//2. 写一个函数判断一年是不是闰年
//int is_leap_year(int year)
//{
//	return(((year%4==0)&&(year%100!=0 ))||(year%400==0));
//	
//}
//int main()
//{
//	int year=0;
//	for(year=1000;year<=2000;year++)
//	{
//		if(is_leap_year(year)==1)
//		{
//           printf("%d ",year);
//		}
//	}
//}
//3. 写一个函数，实现一个整形有序数组的二分查找

//#define _CRT_SECURE_NO_WARNINGS
//                  //int* arr
//int binary_search(int arr[],int k,int sz)
//{
//	int left=0;
//	int right=sz-1;
//	while(left<=right)
//	{
//		int mid=(left+right)/2;
//		 if(arr[mid]<k)
//		 { 
//			 left=mid+1;
//		  }
//		 else if(arr[mid]>k)
//		 {
//			 right=mid-1;
//		 }
//		 else
//		 {
//			 return mid;
//		 }
//	 }
//	//找不到
//		return -1;
//}
//
//int main()
//{
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	int k=0;
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	int ret=0;
//	scanf("%d",&k);
//	//数组传参的时候，传过去一个数组名，本质上传过去的是数组的首元素的地址
//	ret = binary_search(arr,k,sz);//如果找到了，返回下标，如果找不到，返回-1
//	//数组传参会发生降级--变成首元素的地址
//	if(ret == -1)
//	{
//		printf("找不到\n");
//	}
//	else
//	{
//		printf("找到了，下标是：%d\n",ret);
//	}
//	return 0;
//}
//4. 写一个函数，每调用一次这个函数，就会将num的值增加1。
//void Add(int * p)
//{
//	(*p)++;
//}
//int main()
//{
//	int num=0;
//	Add(&num);
//	printf("%d\n",num);
//	Add(&num);
//	printf("%d\n",num);
//	return 0;
//}
//把一个函数的返回值作为另外一个函数的参数。

//int main()
//{
//	//1
//	int len=strlen("bit");
//	printf("len=%d\n",len);
//	//2
//	printf("len=%d\n",strlen("bit"));
//	return 0;
//}


//int main()
//{
//	printf("%d",printf("%d",printf("%d",43)));//4321
//	return 0;
//}

//#include "add.h"
//#include "sub.h"
//int main()
//{
//	int a=10;
//	int b=20;
//	//函数的调用
//	int c=Sub(a,b);
//	int sum=Add(a,b);
//	printf("sum=%d\n",sum);
//	printf("c=%d\n",c);
//
//	return 0;
//}
