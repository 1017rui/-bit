//二维数组的使用
//#include<stdio.h>
//int main()
//{
//	int arr[3][4]={{1,2},{3,4},{5}};
//	int i=0;
//	for(i=0;i<3;i++)
//	{
//		int j=0;
//		for(j=0;j<4;j++)
//		{
//			printf("%d ",arr[i][j]);
//		}
//		printf("\n");
//	}	
//return 0;
//}
//二维数组在内存中的存储
//#include<stdio.h>
//int main()
//{
//	int arr[3][4]={{1,2},{3,4},{5}};
//	int i=0;
//	for(i=0;i<3;i++)
//	{
//		int j=0;
//		for(j=0;j<4;j++)
//		{
//			printf("&arr[%d][%d]=%p\n ",i,j,&arr[i][j]);
//		}
//		printf("\n");
//	}	
//return 0;
//}//二维数组在内存中也是连续存储的。
//行可以省略但是列不能省略
//数组作为函数参数
//冒泡排序
//#include<stdio.h>
//void BubbleSort(int arr[],int sz)
//{
//
//	int i=0;
//	//确定冒泡排序的趟数
//	for(i=0;i<sz-1;i++)
//	{
//		int j=0;
//		for(j=0;j<sz-1-i;j++)
//		{
//			if(arr[j]>arr[j+1])
//			{
//				int tmp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=tmp;
//			}
//		}
//	}
//}
//void PrintArr(int* arr,int sz)
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
//	int arr[10]={10,9,8,7,6,5,4,3,2,1};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	//写一个冒泡排序函数，将数组arr排成升序
//	BubbleSort(arr,sz);
//	PrintArr(arr,sz);
//	return 0;
//}
//如果给的数组已经有序，代码还会进行比较，只是没有发生任何交换。
//优化后效率必然提高。
//#include<stdio.h>
//void BubbleSort(int arr[],int sz)
//{
//	int i=0;
//	int flag=1;
//	//确定冒泡排序的趟数
//	for(i=0;i<sz-1;i++)
//	{
//		int flag=1;
//		int j=0;
//		for(j=0;j<sz-1-i;j++)
//		{
//			if(arr[j]>arr[j+1])
//			{
//				int tmp=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=tmp;
//				flag=0;
//			}
//		}
//		if(flag==1)//没有交换过说明元素已经有序
//		{
//			break;
//		}
//	}
//}
//
//void PrintArr(int* arr,int sz)
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
//	int arr[10]={10,9,8,7,6,5,4,3,2,1};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	//写一个冒泡排序函数，将数组arr排成升序
//	BubbleSort(arr,sz);//数组传参
//	PrintArr(arr,sz);
//	return 0;
//}
//数组名是首元素的地址
int main()
{
int arr[10]={1,2,3,4,5};
//数组名是什么：
//数组名是数组首元素的地址
//注意:有两个意外：
//1.sizeof(arr)-sizeof(数组名)-数组名表示整个数组，计算的是整个数组的大小，单位是字节
//2.&arr--&数组名，&数组名，取出的是整个数组的地址 
	printf("%p\n",arr);//00FBFE44
	printf("%p\n",arr+1);//00FBFE48
	printf("%p\n",&arr[0]);//00FBFE44
	printf("%p\n",&arr[0]+1);//00FBFE48
	printf("%p\n",&arr);//00FBFE44,注意这个不是首元素地址，是数组的地址。数组的地址和数组首元素的地址从值的角度来看，是一样的，但是意义不同。。
	printf("%p\n",&arr+1);//00FBFE6C,+1跳过了整个数组。
return 0;
}