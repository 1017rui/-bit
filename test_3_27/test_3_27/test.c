#include<stdio.h>
//��ά�����ʹ��
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
////ð�������������ڵ�Ԫ�رȽ� 
//BubbleSort()
//{
//
//}
//int main()
//{
//	int arr[10]={10,9,8,7,6,5,4,3,2,1};
//	//ð����������ʵ������
//	BubbleSort(arr);
//}
int main()
{
	int arr[10]={1,2,3,4,5};
//��������������Ԫ�صĵ�ַ
//ע�⣺���������⣺
	//1.sizeof(arr)����������ʾ�������飬sizeof(������)���������������Ĵ�С����λ���ֽ�
	//&arr,��������ʾ�������飬&��������ȥ��������������ĵ�ַ
	printf("%p",arr);
	printf("%p",&arr[0]);
	printf("%p",&arr);
return 0;
}