//strcpy--string copy�ַ�������
//char * strcpy ( char * destination, const char * source );
//�ַ�����������
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
//mem��memory���ڴ棩����д��set����--�����ڴ�
//void * memset ( void * ptr, int value, size_t num );
//int main()
//
//{
//	char arr[]="hello bit";
//	memset(arr,'*',5);
//	printf("%s\n",arr);//***** bit
//	return 0;
//}
//дһ�����������ҳ����������еĽϴ���
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
//дһ���������Խ����������α���������
// void Swap1(int x,int y)//void��ʾ����Ҫ����
//{
//	int tmp=0;
//	tmp=x;
//	x=y;
//	y=tmp;
//}
//  void Swap2(int *pa,int *pb)//void��ʾ����Ҫ����
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
//	int* pa=&a;//�õ���a�ĵ�ַ
//	*pa=20;
//	printf("%d\n",a);
//	return 0;
//
//}
//1. дһ�����������ж�һ�����ǲ�������
//#include<math.h>
//int is_Prime(int n)
//{
//    //�ж�n�Ƿ�Ϊ����
//	//2 - n-1�����Գ�
//	int i=0;  
//		for(i=2;i<=sqrt(n);i++)
//		{
//			if(n%i==0)
//				return 0;
//		}
//		//������
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
//2. дһ�������ж�һ���ǲ�������
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
//3. дһ��������ʵ��һ��������������Ķ��ֲ���

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
//	//�Ҳ���
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
//	//���鴫�ε�ʱ�򣬴���ȥһ���������������ϴ���ȥ�����������Ԫ�صĵ�ַ
//	ret = binary_search(arr,k,sz);//����ҵ��ˣ������±꣬����Ҳ���������-1
//	//���鴫�λᷢ������--�����Ԫ�صĵ�ַ
//	if(ret == -1)
//	{
//		printf("�Ҳ���\n");
//	}
//	else
//	{
//		printf("�ҵ��ˣ��±��ǣ�%d\n",ret);
//	}
//	return 0;
//}
//4. дһ��������ÿ����һ������������ͻὫnum��ֵ����1��
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
//��һ�������ķ���ֵ��Ϊ����һ�������Ĳ�����

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
//	//�����ĵ���
//	int c=Sub(a,b);
//	int sum=Add(a,b);
//	printf("sum=%d\n",sum);
//	printf("c=%d\n",c);
//
//	return 0;
//}
