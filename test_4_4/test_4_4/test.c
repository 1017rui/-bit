//����ˮ��1ƿ��ˮ1Ԫ��2����ƿ���Ի�һƿ��ˮ����20Ԫ�����Զ�����ˮ�����ʵ�֣���
//#include<stdio.h>
//#define money 20
//int main()
//{
//	int soda=money/1;//��ʼ����ˮ��
//	int bottle=soda;//��ʼ����ˮƿ
//	int num=soda;//��¼�ܵ���ˮ��
//	while(bottle>=2)
//	{
//		soda=bottle/2;//������ƿ�һ�һƿ��ˮ
//		num=num+soda;
//		bottle=bottle-soda*2;
//		bottle=bottle+soda;
//	}
//	printf("��ˮ������%d\n",num);
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//    int arr[] = {1,2,(3,4),5};
//    printf("%d\n", sizeof(arr));//4*4=16,����arrָ�����������飬sizeof(arr)�������������Ĵ�С��
//    return 0;
//}
//ʵ�ֶ�����Ԫ�ص�����
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
//��������������������
/*int main()
{
	int a=0;
	int b=0;
	printf("��������������");
	scanf("%d%d",&a,&b);
	a=a^b;
	b=a^b;
	a=a^b;
	printf("����֮��%d %d",a,b);
	return 0;
}*/
//�����ַ���
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
//	printf("%p\n",pa);//pa��int*ָ�룬+1��������һ�����͵���˼��ʵ�����Ǽ���4
//	printf("%p\n",pa+1);
//	printf("%p\n",pc);//pc��char*��ָ�룬+1��������һ���ַ�����˼��ʵ�����Ǽ���1
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
//	int* p;//û�г�ʼ����ָ��--Ұָ��
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
//		p++;//Խ��ᵼ��Ұָ��
//	}
//	return 0;
//
//}
//int* test()
//{
//	int a=10;//�ֲ��������������ڽ������������ʼ���뿪��������������ڽ�����a�����١�
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
//������ʵ��My_strlen()
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
//�ݹ�ʵ��
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