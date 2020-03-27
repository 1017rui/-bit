#include<stdio.h>
//二维数组的使用
//int main()
//{
//	int arr[3][4]={{1,2},{3,4},{5}};
//	int i=0;
//    int j=0;
//		for(i=0;i<3;i++)
//		{
//			
//			for(j=0;j<4;j++)
//			{
//				printf("%d",arr[i][j]);
//			}
//			printf("\n");
//		}
//	return 0;
//}
//int main()
//{
//	int arr[3][4]={{1,2},{3,4},{5}};
//	int i=0;
//    int j=0;
//		for(i=0;i<3;i++)
//		{
//			
//			for(j=0;j<4;j++)
//			{
//				printf("&arr[%d][%d]=%p\n",i,j,&arr[i][j]);
//			}
//			
//		}
//	return 0;
//}
////冒泡排序：两两相邻的元素比较 
//BubbleSort()
//{
//
//}
//int main()
//{
//	int arr[10]={10,9,8,7,6,5,4,3,2,1};
//	//冒泡排序函数，实现升序
//	BubbleSort(arr);
//}
int main()
{
	int arr[10]={1,2,3,4,5};
//数组名是数组首元素的地址
//注意：有两个例外：
	//1.sizeof(arr)，数组名表示整个数组，sizeof(数组名)计算的是整个数组的大小，单位是字节
	//&arr,数组名表示整个数组，&数组名和去除的是整个数组的地址
	printf("%p",arr);
	printf("%p",&arr[0]);
	printf("%p",&arr);
return 0;
}