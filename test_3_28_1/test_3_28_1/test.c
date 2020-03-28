//#include <stdio.h>
//int main()
//{
//    int arr[] = {1,2,(3,4),5};
//    printf("%d\n", sizeof(arr));
//    return 0;
//}
//#include <stdio.h>
//#include<string.h>
//int main()
//{
//    char str[] = "hello bit";//h e l l o   b i t \0
//    printf("%d %d\n", sizeof(str), strlen(str));
//	return 0;
//}
//实现一个对整形数组的冒泡排序
//#include<stdio.h>
//void BubbleSort(int arr[],int sz)
//{
//	int i=0;//i表示趟数
//	int flag=0;
//	for(i=0;i<sz-1;i++)
//	{
//		int j=0;//每趟比的次数
//		for(j=0;j<sz-1-i;j++)
//		{
//			if(arr[j]<arr[j+1])
//			{
//				//交换
//				int tmp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=tmp;
//				flag=1;
//			}
//		}
//		if(flag==0)
//		{
//			break;
//		}
//	}
//}
//void PrintArray(int arr[],int sz)
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
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};//逆序排序
//	int sz=sizeof(arr)/sizeof(arr[0]);// 数组长度
//	BubbleSort(arr,sz);
//	PrintArray(arr,sz);
//	return 0;
//}
//创建一个整形数组，完成对数组的操作
//实现函数init() 初始化数组为全0
//实现print()  打印数组的每个元素
//实现reverse()  函数完成数组元素的逆置。
//要求：自己设计以上函数的参数，返回值。
//#include <stdio.h>
//
//void print(int arr[],int sz)
//{
//    int i=0;
//	for(i=0;i<sz;i++)
//	{
//		printf("%d ",arr[i]);
//	}
//	printf("\n");
//}
//void reverse(int arr[],int sz)
//{
//	int left = 0;
//	int right =sz-1;
//    while(left<right)
//	{
//		int tmp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = tmp;
//        left++;
//		right--;
//	}
//	print(arr,sz);
//}
//void init(int arr[],int sz,int set)
//{
//	int i=0;
//	for(i=0;i<sz;i++)
//	{
//		arr[i]=set;
//	}
//	print(arr,sz);
//}
//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	print(arr,sz);
//	reverse(arr,sz);
//	init(arr,sz,0);
//	return 0;
//}
//将数组A中的内容和数组B中的内容进行交换。（数组一样大）
#include<stdio.h>
void Swap(int arr1[],int arr2[],int sz)
{
	int i=0;
	while(i<sz)
	{
		int tmp=arr1[i];
		arr1[i]=arr2[i];
		arr2[i]=tmp;
		i++;
	}
}
void print(int arr[],int sz)
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
	int arr1[10]={6,5,4,1,2,3,7,8,9,2};
	int arr2[10]={10,9,4,7,6,5,8,3,2,1};
	int sz=sizeof(arr1)/sizeof(arr1[0]);
	Swap(arr1,arr2,sz);
	print(arr1,sz);
	print(arr2,sz);
	return 0;
}