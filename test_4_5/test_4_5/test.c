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
//		arr[i]=i;//�ϵ�
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
//	assert(dest!=NULL);//����
//	assert(src!=NULL);//����
//	//��srcָ����ַ���������destָ����ַ�����
//	while(*dest++=*src++)
//	{
//		;
//	}
//	return ret;//����Ŀ�ĵص���ʼ��ַ
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
//const����ָ��
	//1.const����*����ߣ����ε���ָ��ָ������ݣ�*p��,ʹ��ָ��ָ������ݣ�����ͨ��p���ı�
    //����ָ�������P���ǿ��Ըı��
	//2.const ����*���ұߣ����ε���ָ���������ʹ��ָ����������ܱ��޸�
	//����ָ��ָ������ݿ��Ըı�
//int main()
//{
//	const int num=10;//num�������޸�
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
//{//��ָ֤�����Ч��
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
//{//��ָ֤�����Ч��
//	char* ret=dest;
//	assert(dest!=NULL);//����
//	assert(src!=NULL);//����
//	//��srcָ����ַ���������destָ��Ŀռ��У�����'\0'
//		while(*dest++=*src++)
//		{
//			;
//		}
//		return ret ;//����Ŀ�ĵص���ʼ��ַ
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
//    const int num=10;//num�������޸�
//	int n=100;
//	 int*  const  p=&num;
//	*p=0;
//	printf("num=%d\n",num);
//	printf("%d\n",*p);
//	return 0;
//}
//#include<assert.h>
//int my_strlen(const char* str)
//{//����˴���Ľ�׳�ԡ�
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
//ģ��ʵ�ֿ⺯��strlen
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
//ģ��ʵ�ֿ⺯��strcpy
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
////����һ���������飬ʵ��һ��������
//�����������������ֵ�˳��ʹ�����������е�����λ�������ǰ�벿�֣�
//����ż��λ������ĺ�벿�֡�
void  Adjust_num(const int* str1,int* str2,int sz)
{
	int* start=str2;
	int* end=str2+sz-1;
	int i=0;
	for(i=0;i<sz;i++)
	{
		if(str1[i]%2==0)//ż��
		{
			*end=str1[i];
			end--;
		}
		else if(str1[i]%2!=0)//����
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
	int arr2[10]={0};//��ŵ���λ�ú������
	int sz=sizeof(arr1)/sizeof(arr1[0]);
	Adjust_num(arr1,arr2,sz);
	Print(arr2,sz);
	return 0;
}