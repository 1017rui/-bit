//�ݹ鷽ʽʵ�ִ�ӡһ��������ÿһλ
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//void Print(int n)
//{
//	if(n>9)
//	{
//		Print(n/10);
//	}
//	printf("%d ",n%10);
//}
//int main()
//{
//	int n=0;
//	scanf("%d",&n);
//	Print(n);
//	return 0;
//}
//�ݹ�ͷǵݹ�ֱ�ʵ����n�Ľ׳ˣ���������������⣩
//�ݹ�ʵ��
//#define _crt_secure_no_warnings
//#include<stdio.h>
//int fac(int n)
//{
//	if(n<=1)
//		return 1;
//	else
//	return n*fac(n-1);
//}
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	ret=fac(num);
//	printf("%d",ret);
//	return 0;
//}
//�ǵݹ�ʵ��
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int Fac(int n)
//{
//	int i=0;
//	int ret=1;
//	for(i=1;i<=n;i++)
//	{
//		ret=ret*i;
//	}
//	return ret;
//}
//int main()
//{
//	int n=0;
//	int ret=0;
//	scanf("%d",&n);
//	ret=Fac(n);
//	printf("%d",ret);
//	return 0;
//}
//�ݹ�ͷǵݹ�ֱ�ʵ��strlen
//�ݹ�ʵ��
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
//int my_strlen(char* str)
//{
//	if(*str=='\0')
//	{
//		return 0;
//	}
//	return 1+my_strlen(str+1);
//
//}
//int main()
//{
//	char ch[]="abc";
//	int len=0;
//	len=my_strlen(ch);
//	printf("%d\n",len);
//	return 0;
//}
////�ǵݹ�ʵ��
//#define _CRT_SECURE_NO_WARNINGS
//#include<stdio.h>
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
//int main()
//{
//	char ch[]="abc";
//	int len=0;
//	len=my_strlen(ch);
//	printf("%d\n",len);
//	return 0;
//}
//��дһ������ reverse_string(char * string)���ݹ�ʵ�֣�
//ʵ�֣��������ַ����е��ַ��������С�
//Ҫ�󣺲���ʹ��C�������е��ַ�������������
//#include<stdio.h>
//void reverse_string(char * string)
//{
//	if(*string=='\0')
//	{
//		return ;
//	}
//	reverse_string(string+1);
//	printf("%c",*string);
//}
//int main()
//{
//	char ch[]="abc";
//    reverse_string(ch);
//	//reverse_string(abc)
//	//a+reverse_string(bc)
//	//a+b+reverse_string(c)
//	//a+b+c+reverse_string(\0)
//	//a+b+c+
//	return 0;
//} 
//дһ���ݹ麯��DigitSum(n)������һ���Ǹ����������������������֮��
//���磬����DigitSum(1729)����Ӧ�÷���1+7+2+9�����ĺ���19
//���룺1729�������19
//#define _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//int DigitSum(int n)
//{
//	int s=0;
//    if(n>0)
//	{
//		s= DigitSum(n/10)+n%10;
//	}
//	return s;
//}
//int main()
//{
//	int num=0;
//	int sum=0;
//	printf("������һ���Ǹ�������\n");
//	scanf("%d",&num);//1729
//	sum=DigitSum(num);
//	//DigitSum(1729)
//	//DigitSum(1729/10)+1729%10=DigitSum(172)+9
//	//DigitSum(172/10)+172%10=DigitSum(17)+2+9
//	//DigitSum(1)+7+2+9
//	//1+7+2+9
//	printf("%d\n",sum);
//
//	return 0;
//
//}
//��дһ������ʵ��n��k�η���ʹ�õݹ�ʵ�֡�
//#define _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//int power(int n,int k)
//{
//	if(k==0)
//	{
//		return 1;
//	}
//	else
//	{
//		return n*power(n,k-1);
//	}
//}
//int main()
//{
//	int num=0;
//	int k=0;
//	int ret=0;
//	scanf("%d%d",&num,&k);
//	ret=power(num,k);
//	printf("%d\n",ret);
//	return 0;
//}
//�ݹ�ͷǵݹ�ֱ�ʵ�����n��쳲�������
//���磺
//���룺5  �����5
//���룺10�� �����55
//���룺2�� �����1
//�ݹ�ʵ��
//#define _CRT_SECURE_NO_WARNINGS 
//#include<stdio.h>
//int Fib(int n)
//{
//	int ret=0;
//	if(n<=2)
//	{
//		return 1;
//	}
//	else
//	{
//		return Fib(n-1)+Fib(n-2);
//	}
//}
//int main()
//{
//	int num=0;
//	int ret=0;
//	printf("������һ����: ");
//	scanf("%d",&num);
//	ret=Fib(num);
//	printf("쳲�������Ϊ: %d\n",ret);
//	return 0;
//}
//�ǵݹ�ʵ��
#define _CRT_SECURE_NO_WARNINGS 
#include<stdio.h>
int Fib(int n)
{   int a=1;
	int b=1;
	int c=1;
	while(n>2)
	{
		c=a+b;
		a=b;
		b=c;
		n--;
	}
	return c;
}
int main()
{
	int num=0;
	int ret=0;
	printf("������һ����: ");
	scanf("%d",&num);
	ret=Fib(num);
	printf("쳲�������Ϊ: %d\n",ret);
	return 0;
}