//#include <stdio.h>
//int main()
//{
//  int arr[] = {1,2,3,4,5};//4���ֽ�
//  short *p = (short*)arr;//2���ֽ�
//  int i = 0;
//  for(i=0; i<4; i++)
//  {
//    *(p+i) = 0;
//  }
//   
//  for(i=0; i<5; i++)
//  {
//    printf("%d ", arr[i]);
//  }
//  return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int a = 0x11223344;
//    char *pc = (char*)&a;
//    *pc = 0;
//    printf("%x\n", a);
//    return 0;
//}
//дһ��������ӡarr��������ݣ���ʹ�������±꣬ʹ��ָ�롣
//arr��һ������һά���顣
//#include<stdio.h>
//void PrintArr(int* arr,int sz)
//{
//	int i=0;
//	for(i=0;i<sz;i++)
//	{
//		printf("%d ",*(arr+i));
//	}
//}
//
//int main()
//{
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	PrintArr(arr,sz);
//	return 0;
//}
//дһ����������������һ���ַ��������ݡ�
#include<string.h>
#include<stdio.h>
//void ReverseString(char* arr,int sz)
//{
//	int left=0;
//	int right=sz-1;
//	
//	while(left<right)
//	{
//		char tmp=arr[left];
//		arr[left]=arr[right];
//		arr[right]=tmp;
//		left++;
//		right--;
//	}
//}
void ReverseString(char* arr,int sz)
{
	char* left=arr;
	char* right=arr+sz-1;
	while(left<right)
	{
		char tmp=*left;
		*left=*right;
		*right=tmp;
		left++;
		right--;
	}
}
void PrintString(char* arr,int sz)
{
	int i=0;
	for(i=0;i<sz;i++)
	{
		printf("%c",*(arr+i));
	}
	printf("\n");
}

//int main()
//{
//	
//	 char arr[]="i am a student";
//     int sz=strlen(arr);
//	 PrintString(arr,sz);
//	 ReverseString(arr,sz);
//	 PrintString(arr,sz);
//	return 0;
//}
//��Sn=a+aa+aaa+aaaa+aaaaa��ǰ5��֮�ͣ�����a��һ�����֣����磺2+22+222+2222+22222
//#include<stdio.h>;
//#include<math.h>
//int main()
//{
//	int a=0;
//	int i=0;
//	int ret=0;
//	int sum=0;
//	printf("�����룺");
//	scanf("%d",&a);
//	for(i=0;i<5;i++)
//	{
//		ret=ret+a*pow(10,i);
//        sum=sum+ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//int main()
//{
//	int a=0;
//	int i=0;
//	int ret=0;
//	int sum=0;
//	printf("�����룺");
//	scanf("%d",&a);
//	for(i=0;i<5;i++)
//	{
//		ret=ret*10+a;
//        sum=sum+ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//���0��100000֮������С�ˮ�ɻ������������
//��ˮ�ɻ�������ָһ��nλ�������λ���ֵ�n�η�֮��ȷ�õ��ڸ���������:153��1^3��5^3��3^3����153��һ����ˮ�ɻ�������
//#include<stdio.h>
//#include<math.h>
//int main()
//{
//	int i=0;
//	int count=0;
//	int sum=0;
//	int tmp=0;
//	for(i=1;i<=100000;i++)
//	{
//		//��λ��
//	    tmp=i;
//		while(tmp)
//		{
//			count++;
//			 tmp=tmp/10;
//		}
//		//��������
//		tmp=i;
//		sum=0;
//		while(tmp)
//		{
//			sum=sum+pow((tmp%10),3);
//			tmp=tmp/10;
//		}
//		//�ж�
//		tmp=i;
//		if(i==sum)
//		{
//			printf("%d ",i);
//		}
//	
//	}
//	return 0;
//}
//��C��������Ļ���������ͼ����
#include<stdio.h>
int main()
{
	int i = 0;
	//��ӡ�ϰ벿��7��
	for(i=1; i<=7; i++)
	{
		int j = 1;
		for(j=1; j<=7-i; j++)
		{
			printf(" ");
		}
		for(j=1; j<=2*(i-1)+1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	
   //��ӡ�°벿��6��
	for(i=1; i<=6; i++)
	{
		int j = 1;
		for(j=1; j<=i; j++)
		{
			printf(" ");
		}
		for(j=1;j<=2*(6-i)+1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}