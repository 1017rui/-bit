//��ά�����ʹ��
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
//��ά�������ڴ��еĴ洢
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
//}//��ά�������ڴ���Ҳ�������洢�ġ�
//�п���ʡ�Ե����в���ʡ��
//������Ϊ��������
//ð������
//#include<stdio.h>
//void BubbleSort(int arr[],int sz)
//{
//
//	int i=0;
//	//ȷ��ð�����������
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
//	//дһ��ð����������������arr�ų�����
//	BubbleSort(arr,sz);
//	PrintArr(arr,sz);
//	return 0;
//}
//������������Ѿ����򣬴��뻹����бȽϣ�ֻ��û�з����κν�����
//�Ż���Ч�ʱ�Ȼ��ߡ�
//#include<stdio.h>
//void BubbleSort(int arr[],int sz)
//{
//	int i=0;
//	int flag=1;
//	//ȷ��ð�����������
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
//		if(flag==1)//û�н�����˵��Ԫ���Ѿ�����
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
//	//дһ��ð����������������arr�ų�����
//	BubbleSort(arr,sz);//���鴫��
//	PrintArr(arr,sz);
//	return 0;
//}
//����������Ԫ�صĵ�ַ
int main()
{
int arr[10]={1,2,3,4,5};
//��������ʲô��
//��������������Ԫ�صĵ�ַ
//ע��:���������⣺
//1.sizeof(arr)-sizeof(������)-��������ʾ�������飬���������������Ĵ�С����λ���ֽ�
//2.&arr--&��������&��������ȡ��������������ĵ�ַ 
	printf("%p\n",arr);//00FBFE44
	printf("%p\n",arr+1);//00FBFE48
	printf("%p\n",&arr[0]);//00FBFE44
	printf("%p\n",&arr[0]+1);//00FBFE48
	printf("%p\n",&arr);//00FBFE44,ע�����������Ԫ�ص�ַ��������ĵ�ַ������ĵ�ַ��������Ԫ�صĵ�ַ��ֵ�ĽǶ���������һ���ģ��������岻ͬ����
	printf("%p\n",&arr+1);//00FBFE6C,+1�������������顣
return 0;
}