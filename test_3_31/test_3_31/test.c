#include<stdio.h>
//int Test()
//{
//	int a=10;
//	int b=20;
//	return a,b;//被识别为逗号表达式
//}
//int main()
//{
//	int ret=Test();//嵌套调用
//	printf("%d\n",ret);
//	return 0;
//}
//实现一个函数打印乘法口诀表
#define _CRT_SECURE_NO_WARNINGS
//void print_table(int n)
//{
//	int i=0;
//	for(i=1;i<=n;i++)
//	{
//		int j=0;
//		for(j=1;j<=i;j++)
//		{
//			printf("%d*%d=%-2d",j,i,i*j);
//		}
//     printf("\n");
//	}
//}
//int main()
//{
//	int line =0;
//	scanf("%d",&line);
//	print_table(line);
//	return 0;
//}
//非递归实现字符串逆序
#include <string.h>
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
//void reverse_string(char* str )
//{
//	int left=0;
//	int right=my_strlen(str)-1;
//	while(left<right)
//	{
//		char tmp=str[left];
//		str[left]=str[right];
//		str[right]=tmp;
//		left++;
//		right--;
//	}
//}
//int main()
//{
//	char arr[]="hello bit";
//	
//	//"tib olleh"
//	reverse_string(arr);
//	printf("%s\n",arr);
//	return 0;
//}
//递归实现字符串逆序
//void reverse_string(char* str )
//{
//	char tmp=*str;//第一个字符1.
//	int len=strlen(str);
//	str[0]=str[len-1];//2.
//	str[len-1]='\0';//3.
//	if(strlen(str+1)>=2)
//	{
//		reverse_string(str+1);//4.
//	}
//	str[len-1]=tmp;//5.
//
//
//}
//int main()
//{
//	char arr[]="hello bit";
//	
//	//"tib olleh"
//	reverse_string(arr);
//	printf("%s\n",arr);
//	return 0;
//}
//计算一个数的每位之和
//int	digitsum(unsigned int n)
//{
//	if(n>9)
//	{
//		return digitsum(n/10)+n%10;
//	}
//	else
//	{
//		return n;
//	}
//}
//int main()
//{
//	unsigned int n=0;
//	int ret=0;
//	scanf("%d",&n);
//	ret=digitsum(n);
//	printf("%d\n",ret);
//	return 0;
//}
//求n的K次方
//double Pow(int n,int k)
//{
//	if(k>0)
//	{
//		return n*Pow(n,k-1);
//	}
//	else if(k==0)
//	{
//		return 1;
//	}
//	else
//	{
//		return 1.0/Pow(n,-k);
//	}
//}
//int main()
//{
//	int n=0;
//	int k=0;
//	double d=0;
//	scanf("%d%d",&n,&k);
//	 d=Pow(n,k);
//	printf("%f\n",d);
//}
//数组作业题：
//void Init(int arr[],int sz)
//{
//	int i=0;
//	for(i=0;i<sz;i++)
//	{
//		arr[i]=0;
//	}
//}
//void Print(int arr[],int sz)
//{
//	int i=0;
//	for(i=0;i<sz;i++)
//	{
//		printf("%d ",arr[i]);
//	}
//	printf("\n");
//}
//void Reverse(int arr[],int sz)
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
//
//int main()
//{
//	int arr[10]={0};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	Init(arr,sz);
//	Print(arr,sz);
//	Reverse(arr,sz);
//	return 0;
//}
//int main()
//{
//	int arr1[]={1,3,5,7,9};
//	int arr2[]={2,4,6,8,10};
//	int tmp=0;
//	int i=0;
//	int sz=sizeof(arr1)/sizeof(arr1[0]);
//	for(i=0;i<sz;i++)
//	{
//		tmp=arr1[i];
//		arr1[i]=arr2[i];
//		arr2[i]=tmp;
//	}
//	Print(arr1,sz);
//	Print(arr2,sz);
//	return 0;
//}
//int fun()
//{     
//	static int count = 1;  
//	  return ++count;
//}
//int main() 
//{    
//	int answer=0;  
//	 answer = fun() - fun() * fun(); 
//	 printf( "%d\n", answer);//输出多少？   
//     return 0;
//}

//#include <stdio.h>
//int main()
//{
//    int i = 1;
//    int ret = (++i)+(++i)+(++i);
//    printf("ret = %d\n", ret);
//	return 0;
//}
#include <stdio.h>
int i;//全局变量没有初始化，默认为0；局部变量没有初始化，默认是随机值
int main()
{
    i--;
    if (i > sizeof(i))
    {
        printf(">\n");
    }
    else
    {
        printf("<\n");
    }
    return 0; 
}