#include<stdio.h>
//int test(int x,int y)
//{
//	int z=x+y;
//	return z;
//
//}
//int main()
//{
//	int arr[20]={0};
//	int i=0;
//	int sum=test(2,3);
//	for(i=0;i<10;i++)
//	{
//		arr[i]=i;
//	}
//
//	for(i=10;i<20;i++)
//	{
//		arr[i]=i;//断点
//	}
//	return 0;
//}
//void test2()
//{
//	printf("hehe\n");
//}
//void test1()
//{
//	test2();
//}
//void test()
//{
//	test1();
//}
//int main()
//{
//	test();
//	return 0;
//}
//int main()
//{
//	int n=0;
//	
//	int i=0;
//	int ret=1;
//	int j=0;
//	int sum=0;
//	scanf("%d",&n);
//	for(j=1;j<=n;j++)
//	{
//		ret*=j;
//		sum+=ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//int main()
//{
//	int i=0;
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	for(i=0;i<=12;i++)
//	{
//		arr[i]=0;
//		printf("hehe\n");
//	}
//	return 0;
//}
//#include<string.h>
//void my_strcpy(char* dest,char* src)
//{
//	while(*src!='\0')
//	{
//		/**dest=*src;
//	    dest++;
//	    src++;*/
//		*dest++=*src++;
//
//	}
//	*dest=*src;
//}
//#include<assert.h>
//char* my_strcpy(char* dest,const char* src)
//{
//	char* ret=dest;
//	assert(dest!=NULL);//断言
//	assert(src!=NULL);//断言
//	//把src指向的字符串拷贝到dest指向的字符串中
//	while(*dest++=*src++)
//	{
//		;
//	}
//	return ret;//返回目的地的起始地址
//}
//
//int main()
//{
//	char arr1[20]="##############";
//	char arr2[]="abcdef";
//	//my_strcpy(arr1,NULL);
//	printf("%s\n",my_strcpy(arr1,arr2));
//	return 0;
//}
//const修饰指针
	//1.const放在*的左边，修饰的是指针指向的内容（*p）,使得指针指向的内容，不能通过p来改变
    //但是指针变量（P）是可以改变的
	//2.const 放在*的右边，修饰的是指针变量本身，使得指针变量本身不能被修改
	//但是指针指向的内容可以改变
//int main()
//{
//	const int num=10;//num不允许被修改
//	int n=100;
//	const int* p=&num;
//	*p=0;
//	p=&n;
//	printf("num=%d\n",num);
//	printf("%d\n",*p);int my_strlen(char* str)
//{
//	int count=0;
//	assert(str!=NULL);
//	while(*str!='\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char arr[]="abcdef";
//	int len=my_strlen(arr);
//	printf("%d\n",len);
//	return 0;
//}
//	return 0;
//}
//
//void my_strcpy(char* dest,char* src)
//{
//	while(*src!='\0')
//	{
//		*dest++=*src++;
//		
//
//	}
//	*dest=*src;
//}
//void my_strcpy(char* dest,char* src)
//{
//	while(*dest++=*src++)
//	{
//		;
//	}
//
//}
//void my_strcpy(char* dest,char* src)
//{//保证指针的有效性
//	if((dest!=NULL)&&(src!=NULL))
//	{
//		while(*dest++=*src++)
//		{
//			;
//		}
//	}
//}
//#include<assert.h>
//char* my_strcpy(char* dest,const char* src)
//{//保证指针的有效性
//	char* ret=dest;
//	assert(dest!=NULL);//断言
//	assert(src!=NULL);//断言
//	//把src指向的字符串拷贝到dest指向的空间中，包含'\0'
//		while(*dest++=*src++)
//		{
//			;
//		}
//		return ret ;//返回目的地的起始地址
//	}
//
//int main()
//{
//	char arr1[20]="##############";
//	char arr2[]="abcdef";
//	printf("%s\n",my_strcpy(arr1,arr2));
//	return 0;
//}
//int main()
//{
//    const int num=10;//num不允许被修改
//	int n=100;
//	 int*  const  p=&num;
//	*p=0;
//	printf("num=%d\n",num);
//	printf("%d\n",*p);
//	return 0;
//}
//#include<assert.h>
//int my_strlen(const char* str)
//{//提高了代码的健壮性。
//	int count=0;
//	assert(str!=NULL);
//	while(*str!='\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char arr[]="abcdef";
//	int len=my_strlen(arr);
//	printf("%d\n",len);
//	return 0;
//}
//模拟实现库函数strlen
//#include<stdio.h>
//#include<assert.h>
//int my_strlen(const char* str)
//{
//	int count=0;
//	assert(str!=NULL);
//	while(*str!='\0')
//	{
//		count++;
//		str++;
//	}
//	return count;
//}
//int main()
//{
//	char arr[100]={0};
//	gets(arr);
//	printf("%d\n",my_strlen(arr));
//	return 0;
//}
//模拟实现库函数strcpy
//#include<stdio.h>
//#include<assert.h>
//char* my_strcpy(char* dest,const char* src)
//{
//	char* tmp=dest;
//	assert(dest!=NULL);
//	assert(src!=NULL);
//	while(*dest++=*src++)
//	{
//		;
//	}
//	return tmp;
//}
//int main()
//{
//	char arr1[20]="#################";
//	char arr2[]="hello bit";
//	printf("%s\n",my_strcpy(arr1,arr2));
//	return 0;
//}
////输入一个整数数组，实现一个函数，
//来调整该数组中数字的顺序使得数组中所有的奇数位于数组的前半部分，
//所有偶数位于数组的后半部分。
void  Adjust_num(const int* str1,int* str2,int sz)
{
	int* start=str2;
	int* end=str2+sz-1;
	int i=0;
	for(i=0;i<sz;i++)
	{
		if(str1[i]%2==0)//偶数
		{
			*end=str1[i];
			end--;
		}
		else if(str1[i]%2!=0)//奇数
		{
			*start=str1[i];
			start++;
		}
	}
}
void Print(int* str,int sz)
{
	int i=0;
	for(i=0;i<sz;i++)
	{
		printf("%d ",str[i]);
	}
}
int main()
{
	int arr1[10]={10,9,8,7,6,5,4,3,2,1};
	int arr2[10]={0};//存放调整位置后的数组
	int sz=sizeof(arr1)/sizeof(arr1[0]);
	Adjust_num(arr1,arr2,sz);
	Print(arr2,sz);
	return 0;
}