//ʵ��һ���������ж�һ�����ǲ�����������������ʵ�ֵĺ�����ӡ100��200֮���������
//#include<stdio.h>
//int isPrime(int n)
//{
//	int i=0;
//	for(i=2;i<n;i++)
//	{
//		if(n%i==0)
//			return 0;
//	}
//	return 1;
//}
//int main()
//{
//	int n=0;
//	for(n=100;n<=200;n++)
//	{
//		if(isPrime(n)==1)
//		{
//			printf("%d ",n);
//        }
//	}
//	return 0;
//}
//ʵ�ֺ����ж�year�ǲ������ꡣ
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int is_leap_year(int year)
//{
//	return(((year%4==0)&&(year%100!=0))||(year%400==0));
//}
//int main()
//{
//	int year=0;
//	printf("���������: ");
//	scanf("%d",&year);
//	if(is_leap_year(year)==1)
//	{
//		printf("������\n");
//	}
//	else
//	{
//		printf("��������\n");
//	}
//    return 0;
//}
//ʵ��һ�������������������������ݡ�
//#include<stdio.h>
//void Swap(int *pa,int *pb)
//{
//	int ret=*pa;
//	*pa=*pb;
//	*pb=ret;
//}
//int main()
//{
//	int a=10;
//	int b=20;
//	printf("a=%d,b=%d\n",a,b);
//	Swap(&a,&b);
//	printf("a=%d,b=%d\n",a,b);
//	return 0;
//}
//ʵ��һ����������ӡ�˷��ھ����ھ���������������Լ�ָ��.�磺����9�����9*9�ھ������12�����12*12�ĳ˷��ھ���
#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//void multiplication(int num)
//{
//	int i=0;
//	int j=0;
//	for(i=1;i<=num;i++)
//	{
//		for(j=1;j<=i;j++)
//		{
//			printf("%d*%d=%-2d ",j,i,i*j);
//	    }
//		printf("\n");
//    }
//}
//int main()
//{
//	int num=0;
//	printf("������˷��ھ�����У�\n");
//	scanf("%d",&num);
//	multiplication(num);
//	return 0;
//}
#include<stdio.h>
//int main()
//{
//	printf("hehe\n");
//	main();//�ݹ�
//	return 0;
//
//}
//����һ������ֵ���޷��ţ�������˳���ӡ����ÿһλ�� ���磺 ���룺1234����� 1 2 3 4
//void Print(unsigned int n)
//{
//	if(n>9)
//    {
//		Print(n/10);
//	}
//	printf("%d ",n%10);
//}
//int main()
//{
//	unsigned int num=0;
//	scanf("%d",&num);
//	Print(num);
//	//Print(123)
//	//Print(12)+3
//	//Print(1)+2+3
//	//1+2+3
//	return 0;
//}
//��д��������������ʱ���������ַ����ĳ��ȡ�
//int my_strlen(char* str)
//{
//	int count=0;
//	while(*str!='\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//
//#include<string.h>
//int main()
//{
//	char arr[]="bit";//����������Ԫ�ص�ַ-char�ĵ�ַchar*
//	int len=my_strlen(arr);
//	printf("%d\n",len);
//	return 0;
//}//ô��ʹ�õݹ�
//int my_strlen(char* str)
//{
//	if(*str!='\0')
//	{
//		return 1+my_strlen(str+1);
//	}
//	else
//	{
//		return 0;
//	}
//}
//
//#include<string.h>
//int main()
//{
//	char arr[]="bit";//����������Ԫ�ص�ַ-char�ĵ�ַchar*
//	int len=my_strlen(arr);
//	printf("%d\n",len);
//	//my_strlen("bit")
//	//1+my_strlen("it")
//	//1+1+my_strlen("t")
//	//1+1+1+my_strlen("")
//	//1+1+1+0
//	return 0;
//}//ô��ʹ�õݹ�
//��n�Ľ׳ˡ��������������
//int main()
//{
//	int n=0;
//	int i=0;
//	int ret=1;
//	scanf("%d",&n);
//	for(i=1;i<=n;i++)
//	{
//		 ret=ret*i;
//	}
//	printf("ret=%d\n",ret);
//	return 0;
//}
//int Fac(int n)
//{
//	if(n<=1)
//		return 1;
//	else
//		return n*Fac(n-1);
//}
//int main()
//{
//	int n=0;
//	int ret=1;
//	scanf("%d",n);
//	ret=Fac(n);
//	printf("ret=%d\n",ret);
//	return 0;
//}
//���n��쳲���������
//1 1 2 3 5 8 13 21 34 55...
//int Fib(int n)
//{
//	if(n<=2)
//		return 1;
//	else
//		return Fib(n-1)+Fib(n-2);
//}
//int Fib(int n)
//{
//	int a=1;
//	int b=1;
//	int c=1;
//	while(n>2)
//	{
//		c=a+b;
//		a=b;
//		b=c;
//		n--;
//	}
//	return c;
//}
//int main()
//{
//	int n=0;
//	int ret=0;
//	scanf("%d",&n);
//	ret=Fib(n);
//	printf("ret=%d\n",ret);
//	return 0;
//}
//int main()
//{
//	//������һ����ͬ����Ԫ�صļ���
//	//����Ĵ���
//	//Ԫ�ص����� ������ [����Ĵ�С-����]
//	int arr[100];
//	char arr1[5];
//	return 0;
//}
//int main()
//{
//	int arr1[10]={1,2,3};//����Ĳ���ȫ��ʼ����ֻ��ʼ��������Ԫ�أ�ʣ��Ĭ�ϳ�ʼ��Ϊ0
//	int arr2[10]={1,2,3,4,5,6,7,8,9,10};
//	int arr3[]={1,2,3};
//	
//	return 0;
//}
//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int i=0;
//	for(i=0;i<sizeof(arr)/sizeof(arr[0]);i++)
//	{
//		printf("&arr[%d]=%p\n ",i,&arr[i]);
//	}
//	
//	return 0;
//}
//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int i=0;
//	int* p=arr;
//	for(i=0;i<sizeof(arr)/sizeof(arr[0]);i++)
//	{
//		printf("%d\n",*p);
//		p++;
//	}
//	
//	return 0;
//}
int main()
{
	int arr[3][4]={{1,2},{3,4},5};//�������еĶ�ά����
	char ch[3][5];//�������еĶ�ά����
}