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
//ʵ��һ�������������ð������
//#include<stdio.h>
//void BubbleSort(int arr[],int sz)
//{
//	int i=0;//i��ʾ����
//	int flag=0;
//	for(i=0;i<sz-1;i++)
//	{
//		int j=0;//ÿ�˱ȵĴ���
//		for(j=0;j<sz-1-i;j++)
//		{
//			if(arr[j]<arr[j+1])
//			{
//				//����
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
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};//��������
//	int sz=sizeof(arr)/sizeof(arr[0]);// ���鳤��
//	BubbleSort(arr,sz);
//	PrintArray(arr,sz);
//	return 0;
//}
//����һ���������飬��ɶ�����Ĳ���
//ʵ�ֺ���init() ��ʼ������Ϊȫ0
//ʵ��print()  ��ӡ�����ÿ��Ԫ��
//ʵ��reverse()  �����������Ԫ�ص����á�
//Ҫ���Լ�������Ϻ����Ĳ���������ֵ��
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
//������A�е����ݺ�����B�е����ݽ��н�����������һ����
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