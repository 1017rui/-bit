//字符串逆序
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
//	gets(arr);//读入一个字符串
//	reverse(arr);
//	printf("%s\n",arr);
//	return 0;
//}
//计算2+22+222+2222+22222
#define _crt_secure_no_warnings
//int main()
//{
//	int a=0;
//	int n=0;
//	int i=0;
//	int sum=0;
//	int ret=0;//存储计算好的每一项
//	scanf("%d%d",&a,&n);
//	for(i=0;i<n;i++)
//	{
//		ret=ret*10+a;
//		sum+=ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//子幂数
#include<math.h>
//int main()
//{
//	int i=0;
//	for(i=0;i<=100000;i++)
//	{
//		int count=1;
//		int sum=0;
//		//判断i是否为水仙花数
//		//1.计算i的位数
//		int tmp=i;
//		while(i/=10)
//		{
//			count++;
//		}
//		
//		//2.得到i的每的每一位，计算每一位的位数次方和
//		i=tmp;
//		while(tmp)
//		{
//			sum+=pow(tmp%10,count);
//			tmp/=10;
//		}
//		//3.判断
//		tmp=i;
//		if(i==sum)
//		{
//			printf("%d ",i);
//		}
//	}
//	return 0;
//}
//打印菱形
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
//	//打印上半部分
//
//	for(i=0;i<line;i++)
//	{
//		//打印一行
//		//先打印空格
//		for(j=0;j<=line-1-i;j++)
//		{
//			printf(" ");
//		}
//		//在打印*
//		for(j=0;j<2*i+1;j++)
//		{
//			printf("*");
//		}
//     printf("\n");
//	}
//	//打印下半部分
//for(i=0;i<=line;i++)
//{
//		//打印一行
//		//先打印空格
//		
//		for(j=0;j<=i+1;j++)
//		{
//			printf(" ");
//		}
//		//在打印*
//		for(j=0;j<2*(line-1-i)-1;j++)
//		{
//			printf("*");
//		}
//  printf("\n");
//}
//
//	return 0;
//}
//二级指针
//int main()
//{
//	int a=10;
//	int* pa=&a;
//	int** ppa=&pa;
//	**ppa=200;
//	printf("%d\n",a);
//	printf("%d\n",**ppa);
//}
//指针数组
//int main()
//{
//	//int arr[10]={0};//整型数组--存放整形数据
//	//char ch[5]={0};//字符数组--存放字符数据
//	//指针数组--存放指针的数组
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
//结构体
//结构体的声明：
//int double short 内置类型：
//学生：姓名，学号，性别，年龄
//书：--复杂对象--复杂类型
//c语言提供了一个struct--结构体关键字
//学生类型
//struct Stu
//{
//	//描述学生的相关属性
//	char name[20];
//	char id[18];
//	short age;
//	char sex[5];
//}s2,s3,s4;//就是创建的结构体变量-全局变量
//int main()
//{
//	struct Stu s1;//创建对象
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
////typedef--类型定义--类型重定义
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