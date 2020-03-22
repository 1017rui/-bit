#include<stdio.h>
#include<string.h>
int MAX(int a,int b)
{
	if(a>=b)
		return a;
	else
		return b;
}
int main()
{
	int num1=0;
	int num2=0;
	int max=0;
	scanf("%d%d",&num1,&num2);
	max=MAX(num1,num2);
	printf("%d\n",max);
	return 0;
}
//
//#define 定义的标识符常量
//#define MAX 1000 
//性别
//创建一个枚举类型
//enum Sex
//{
//	MALE,
//	FEMALE,
//	SECRET//枚举常量
//};
//int main()
//{
	//const int n=10;//说明此时此刻n仍为变量
	//int arr[n]={0};
//int a=MAX;
//MAX=2000;
//printf("%d\n",a);
	//枚举常量，一一列举
	//性别：男，女，保密
//int num=10;
//enum Sex s=MALE;
//
//printf("%d\n",MALE);//0
//printf("%d\n",FEMALE);//1
//printf("%d\n",SECRET);//2
//return 0;
//
//}
//int main()
//{
	//转义字符，\t水平制表符，tab键
	//printf("c:\\test\\32\\test.c");//结果：c:\test\32\test.c
	//printf("\a\a\a\a\a\a\a\a\a\a\a\a");//触发蜂鸣器

	
	//printf("hehe\n");
	//printf("%c",'\'');//%c打印字符,用\转义'
	//
	//printf("hello\nworld");
	//printf("%d\n",strlen("bit"));//3
	//printf("%d\n",strlen("c:\test\32\test.c"));//13
//	printf("%c\n",'\32');//32化为十进制数为：2*8^0+3*8^1=26,
//	printf("%c\n",'\x41');//十六进制数41化为十进制为65
//	return 0;
//}
//选择语句
//int main()
//{
//	int learn=0;
//	printf("加入比特\n");
//	printf("你要好好学习吗？(1/0)\n");
//	scanf("%d",&learn);
//	if(learn==1)
//		printf("拿到offer\n");
//	else
//		printf("回家卖红薯\n");
//	
//	return 0;
//}
//循环语句	
//int main()
//{
//	int line=0;
//	printf("加入比特\n");
//	while(line<20)//循环条件
//	{
//		printf("敲代码:%d\n",line);
//		line ++;
//	}
//	printf("拿到好offer\n");
//	return 0; 
//}
//函数
//int ADD(int a,int b)
//{
//	int z=0;
//	z=a+b;
//	return z;
//}
//int main()
//{
//	int num1=0;
//	int num2=0;
//	int sum=0;
//	scanf("%d%d",&num1,&num2);
//	//sum=num1+num2;
//	sum=ADD(num1,num2);//调用函数ADD
//	printf("%d\n",sum);
//	return 0;
//}
//int main()
//{
//	int arr1[10]={1,2,3,4,5,6,7,8,9,10};//数组里可以放一组相同类型的数据
//	//int arr2[]={1,2,3,4,5,6,7,8,9,10};数组元素下标从零开始
//	//printf("%d\n",arr1[5]);//访问下标为5的数组元素
//	int i=0;
//	int sum=0;
//	while(i<10)
//	{
//		printf("%d\n",arr1[i]);
//		sum=sum+arr1[i];
//		i++;
//	}
//    printf("%d\n",sum);
//	return 0;
//}
//

