//�ַ�������
#include<stdio.h>
#include<string.h>
//void reverse(char* str)
//{
//	int len=strlen(str);
//	char* left=str;
//	char*  right=str+len-1;
//	char tmp=0;
//
//	while(left<right)
//	{
//	    tmp=*left;
//		*left=*right;
//		*right=tmp;
//		left++;
//		right--;
//
//	}
//}
//int main()
//{
//	char arr[100]={0};
//	gets(arr);//����һ���ַ���
//	reverse(arr);
//	printf("%s\n",arr);
//	return 0;
//}
//����2+22+222+2222+22222
#define _crt_secure_no_warnings
//int main()
//{
//	int a=0;
//	int n=0;
//	int i=0;
//	int sum=0;
//	int ret=0;//�洢����õ�ÿһ��
//	scanf("%d%d",&a,&n);
//	for(i=0;i<n;i++)
//	{
//		ret=ret*10+a;
//		sum+=ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//������
#include<math.h>
//int main()
//{
//	int i=0;
//	for(i=0;i<=100000;i++)
//	{
//		int count=1;
//		int sum=0;
//		//�ж�i�Ƿ�Ϊˮ�ɻ���
//		//1.����i��λ��
//		int tmp=i;
//		while(i/=10)
//		{
//			count++;
//		}
//		
//		//2.�õ�i��ÿ��ÿһλ������ÿһλ��λ���η���
//		i=tmp;
//		while(tmp)
//		{
//			sum+=pow(tmp%10,count);
//			tmp/=10;
//		}
//		//3.�ж�
//		tmp=i;
//		if(i==sum)
//		{
//			printf("%d ",i);
//		}
//	}
//	return 0;
//}
//��ӡ����
//       *
//      ***
//     *****
//    *******
//   *********
//  ***********
// *************
//  ***********
//   *********
//    *******
//     *****
//      ***
//       *
//int main()
//{
//	int line=0;
//	int i=0;
//	int j=0;
//	scanf("%d",&line);//7
//	//��ӡ�ϰ벿��
//
//	for(i=0;i<line;i++)
//	{
//		//��ӡһ��
//		//�ȴ�ӡ�ո�
//		for(j=0;j<=line-1-i;j++)
//		{
//			printf(" ");
//		}
//		//�ڴ�ӡ*
//		for(j=0;j<2*i+1;j++)
//		{
//			printf("*");
//		}
//     printf("\n");
//	}
//	//��ӡ�°벿��
//for(i=0;i<=line;i++)
//{
//		//��ӡһ��
//		//�ȴ�ӡ�ո�
//		
//		for(j=0;j<=i+1;j++)
//		{
//			printf(" ");
//		}
//		//�ڴ�ӡ*
//		for(j=0;j<2*(line-1-i)-1;j++)
//		{
//			printf("*");
//		}
//  printf("\n");
//}
//
//	return 0;
//}
//����ָ��
//int main()
//{
//	int a=10;
//	int* pa=&a;
//	int** ppa=&pa;
//	**ppa=200;
//	printf("%d\n",a);
//	printf("%d\n",**ppa);
//}
//ָ������
//int main()
//{
//	//int arr[10]={0};//��������--�����������
//	//char ch[5]={0};//�ַ�����--����ַ�����
//	//ָ������--���ָ�������
//	int a=10;
//	int b=20;
//	int c=30;
//	int d=40;
//	int* arr2[4]={&a,&b,&c,&d};
//	int i=0;
//	for(i=0;i<4;i++)
//	{
//		printf("%d ",*(arr2[i]));
//	}
//
//	return 0;
//}
//�ṹ��
//�ṹ���������
//int double short �������ͣ�
//ѧ����������ѧ�ţ��Ա�����
//�飺--���Ӷ���--��������
//c�����ṩ��һ��struct--�ṹ��ؼ���
//ѧ������
//struct Stu
//{
//	//����ѧ�����������
//	char name[20];
//	char id[18];
//	short age;
//	char sex[5];
//}s2,s3,s4;//���Ǵ����Ľṹ�����-ȫ�ֱ���
//int main()
//{
//	struct Stu s1;//��������
//	struct Stu s2;
//
//	return 0;
//
//}
//struct S
//{
//	int a;
//	char c;
//	char arr[10];
//	double d;
//};
//typedef struct T
//{
//	char buf[20];
//	struct S s;
//	int *p;
//};
////typedef--���Ͷ���--�����ض���
//int main()
//{
//	int a=10;
//	//struct	S s ={100,'w',"bit",3.14};
//     struct T st={"hello bit",{1000,'b',"abcdef",4.4},&a};
//     struct T* pt=&st;
//printf("%s\n",pt->buf);
////printf("%s\n",st.buf);
////printf("%d\n",st.s.a);
////printf("%c\n",st.s.c);
////printf("%s\n",st.s.arr);
////printf("%lf\n",st.s.d);
////printf("%d\n",*(st.p));
//
//
//	return 0;
//}
int Add(int x,int y)
{
	int z=x+y;
	return z;
}
int main()
{
	int a=10;
	int b=20;
	int c=Add(a,b);
	printf("%d\n",c);
	return 0;
}