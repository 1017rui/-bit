//��ϰ֮ǰ��ش���
//����n�Ľ׳�
#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
//int main()
//{
//	int n=0;
//	int i=0;
//	int ret=1;
//	printf("�����룺");
//	scanf("%d",&n);
//	for(i=1;i<=n;i++)
//	{
//		ret=ret*i;
//	}
//	printf("������Ľ׳�Ϊ��%d\n",ret);
//	return 0;
//}
//����1��+2��+3��+.........+n!
//int main()
//{
//	int n=0;
//	int i=0;
//	int j=0;
//	int ret=1;
//	int sum=0;
//	scanf("%d",&n);
//	for(i=1;i<=n;i++)
//	{
//		ret=1;//Ҫ��ret��1
//		for(j=1;j<=i;j++)
//		{
//			ret=ret*j;//i!
//		}
//		sum=sum+ret;
//	}
//	printf("%d\n",sum);
//	return 0;
//}
//���ֲ���������ĳ��Ԫ�ص��±�

//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int sz=sizeof(arr)/sizeof(arr[0]);
//	int k=7;//Ҫ���ҵ�����
//	int left=0;
//	int right=sz-1;
//	while(left<=right)
//	{
//	    int mid=(left+right)/2;
//		if(arr[mid]<k)
//		{
//		  left=mid+1;
//		}
//		 else if(arr[mid]>k)
//		{
//			right=mid-1;
//		}
//		else if(arr[mid]==k)
//		{
//			printf("�ҵ��ˣ��±�Ϊ��%d\n",mid);
//			break;
//		}
//	}
//	if(left>right)
//	{
//	  printf("�Բ����Ҳ���");
//	}
//	return 0;
//}
//��ʾ����ַ��������ƶ������м���
//#include<string.h>
//#include<windows.h>
//int main()
//{
//	char arr1[]="welcome to bit!!!";
//	char arr2[]="#################";
//	int len=strlen(arr1);
//	int left=0;
//	int right=len-1;
//	while(left<=right)
//	{
//		arr2[left]=arr1[left];
//		arr2[right]=arr1[right];
//		printf("%s\n",arr2);
//		Sleep(1000);//˯�ߺ�������λ�Ǻ���
//		system("cls");//ִ��ϵͳ���������Ļ��Ϣ
//		left++;
//		right--;
//	}
//	return 0;
//}
//ģ���û���¼�龰������ֻ�ܵ�½���Σ�ֻ���������������룬���������ȷ������ʾ��½�ɹ��������������������˳�����
//#include<string.h>
//int main()
//{
//	int i=0;
//	char password[20]={0};
//	for(i=0;i<3;i++)
//	{
//		printf("����������:>");
//		scanf("%s",password);
//		//�ַ����Ƚϴ�С����ֱ����==���бȽϣ���Ӧ��ʹ��strcmp(),���бȽ�
//		if(strcmp(password,"123456")==0)
//		{
//			printf("��½�ɹ�\n");
//			break;
//		}
//		else
//		{
//			printf("�������\n");
//		}
//	}
//	if(i==3)
//    {
//		printf("������������˳�����\n");
//    }
//return 0;
//}
//��������Ϸ
//#include <stdlib.h>
//#include<time.h>
//void game()
//{
//	//����Ҫ�õ����������һ����
//	int guess=0;
//	int ret=rand()%100+1;//����1-100֮����������
//	//����������ʼ������
//	
//	while(1)
//	{
//	printf("�������:>");
//	scanf("%d",&guess);
//	if(guess>ret)
//	{
//		printf("�´���\n");
//	}
//	else if(guess<ret)
//	{
//		printf("��С��\n");
//	}
//	else
//	{
//		printf("��ϲ�㣬��������\n");
//		break;
//	}
// }
//}
//void menu()
//{
//	printf("*******************\n");
//	printf("***1.play 0.exit***\n");
//	printf("*******************\n");
//
//}
//int main()
//{
//	int input=0;
//	srand((unsigned int)time(NULL));//�ڵ���rand֮ǰ��ʹ��srand��������α�����������������
//	do{
//	 menu();
//	 printf("��ѡ��:>");
//	 scanf("%d",&input);
//	 switch(input)
//	 {
//	 case 1:
//		 //printf("����Ϸ\n");
//		 game();
//		 break;
//	 case 0:
//		 printf("�˳���Ϸ\n");
//		 break;
//	 default:
//		 printf("ѡ�����\n");
//		 break;
//	 }
//	}while(input);
//	return 0;
//}
//#include<string.h>
//int main()
//{
//	char arr1[20]="#########";
//	char arr2[]="bit";
//	strcpy(arr1,arr2);//��arr2���ַ��������ݿ�����arr1��
//	printf("%s\n",arr1);
//}
//�ݹ����ַ����ĳ���
//int my_strlen(char* str)
//{
//  if(*str!='\0')
//  {
//	  return 1+my_strlen(str+1);
//  }
//  else
//  {
//	  return 0;
//  }
//}
//int main()
//{
//	char arr[]="jiaxing";
//	int len=my_strlen(arr);
//	//my_strlen("bit")
//	//1+my_strlen("it")
//	//1+1+my_strlen("t")
//	//1+1+1+my_strlen("\0");
//	//1+1+1+0=3
//	printf("%d\n",len);
//	return 0;
//}
//�ݹ���n!
//int Fac(int n)
//{
//	if(n==1)
//	{
//		return 1;
//	}
//	else
//	{
//		return n*Fac(n-1);
//	}
//}
//int main()
//{
//	int n=0;
//	int ret=0;
//	printf("�����룺\n");
//	scanf("%d",&n);
//	ret=Fac(n);
//	printf("%d\n",ret);
//	return 0;
//}
//ð������
 /*void BubbleSort(int arr[],int sz)
 {
	 int i=0;
	 int flag=0;
	 for(i=0;i<sz-1;i++)
	 {
		 int j=0;
		 for(j=0;j<sz-1-i;j++)
		 {
			 if(arr[j]<arr[j+1])
			 {
				 int tmp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=tmp;
				 flag=1;
			 }
			 if(flag==0)
			 {
			 break;
			 }
		 }
	 }
 }
 void  PrintArr(int* arr,int sz)
 {
	 int i=0;
	 for(i=0;i<sz;i++)
	 {
		 printf("%d ",arr[i]);
	 }
	 printf("\n");
 }

int main()
{
   int arr[10]={1,2,3,4,5,6,7,8,9,10};
   int sz=sizeof(arr)/sizeof(arr[0]);
   BubbleSort(arr,sz);
   PrintArr(arr,sz);
   return 0;
}
*/
//��ҵ��������
//дһ��������ʾһ����������(����)��1�ĸ���
//����һ
//int Numberof1(unsigned int n)
//{
//	int count=0;
//	while(n)
//	{
//	   if(n%2==1)
//	   {
//		   count++;
//	   }
//	   n=n/2;
//	}
//	return count;
//}
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	//-1
//	//10000000000000000000000000000001ԭ��
//	//11111111111111111111111111111110����
//	//11111111111111111111111111111111����
//	//13
//	//00000000000000000000000000001101
//	ret=Numberof1(num);
//	printf("%d\n",ret);
//	return 0;
//}
//��������Ч�ʵ�
//int Numberof1(int n)
//{
//	int i=0;
//	int count=0;
//	for(i=0;i<32;i++)
//	{
//		if((n>>i)&1==1)
//		{
//			count++;
//		}
//	}
//}
////13&1
////00000000000000000000000000001101
////00000000000000000000000000000001
////00000000000000000000000000000001
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	//-1
//	//10000000000000000000000000000001ԭ��
//	//11111111111111111111111111111110����
//	//11111111111111111111111111111111����
//	//13
//	//00000000000000000000000000001101
//	ret=Numberof1(num);
//	printf("%d\n",ret);
//	return 0;
//}
//������
//int Numberof1(int n)
//{
//	int count=0;
//	while(n)
//	{
//		n=n&(n-1);//ÿִ��һ�Σ�ȥ��һ��1
//		count++;
//	}
//	return count;
//}
//
//int main()
//{
//	int num=0;
//	int ret=0;
//	scanf("%d",&num);
//	//-1
//	//10000000000000000000000000000001ԭ��
//	//11111111111111111111111111111110����
//	//11111111111111111111111111111111����
//	//13
//	//00000000000000000000000000001101
//	ret=Numberof1(num);
//	printf("%d\n",ret);
//	return 0;
//}
//
//��������������λ�в�ͬ�ĸ���
//���
//int main()
//{
//	int m=0;
//	int n=0;
//	int tmp=0;
//	int count=0;
//	scanf("%d%d",&m,&n);
//	tmp=m^n;//�����ͬΪ0��ͬΪ1
//	while(tmp)
//	{
//		tmp=tmp&(tmp-1);
//		count++;
//	}
//	printf("%d\n",count);
//	return 0;
//}
//��ӡ������λ��ż��λ
//int main()
//{
//	int m=0;
//	int i=0;
//	scanf("%d",&m);
//	//10
//	//00000000000000000000000000001010
//	//��ӡ����λ
//	for(i=30;i>=0;i-=2)
//	{
//		printf("%d ",(m>>i)&1);
//	}
//	printf("\n");
//	//��ӡż��λ
//	for(i=31;i>=1;i-=2)
//	{
//		printf("%d ",(m>>i)&1);
//	}
//	printf("\n");
//	return 0;
//}
//ָ��
//int main()
//{
//	//int a=10;
//	//int* pa=&a;
//	char ch='w';
//	int a=10;
//	double d=10.0;
//	char* pc;
//	int* pa;
//	double* pd;
//	printf("%d\n",sizeof(pc));//4
//	printf("%d\n",sizeof(pa));//4
//    printf("%d\n",sizeof(pd));//4
//
//	return 0;
//}
//int main()
//{
//	int a=0x11223344;
//	int* pa=&a;
//	*pa=0;
//	return 0;
//}
//int main()
//{
//	int a=10;
//	int* pa=&a;
//	char* pc=&a;
//	printf("%p\n",pa);
//	printf("%p\n",pa+1);//pa������ָ�룬+1��������һ�����ͣ�4���ֽڣ�����˼��ʵ���ϼ���4
//	printf("%p\n",pc);
//	printf("%p\n",pc+1);//pc��char*��ָ�룬+1��������һ���ַ���1���ֽڣ�����˼��ʵ�����Ǽ���1
//
//
//	return 0;
//}

//int main()
//{
//	int arr[10]={0x11223344,0x11223344,0x11223344,0x11223344,0x11223344,
//		0x11223344,0x11223344,0x11223344,0x11223344,0x11223344};
//	/*int i=0;
//	char* p= arr;
//	for(i=0;i<10;i++)
//	{
//		*(p+i)=1;
//	}*/
//	int i=0;
//	int* p=arr;
//	for(i=0;i<10;i++)
//	{
//		*(p+i)=1;
//	}
//	return 0;
//}
//1.û�г�ʼ��
//int main()
//{
//	//int a=0;
//	//printf("%d\n",a);
//	int *p;//Ұָ��
//	*p=20;
//
//	return 0;
//}
//2.Խ�����
//int main()
//{
//	int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int i=0;
//	int *p=arr;
//	for(i=0;i<=12;i++)
//	{
//		*p=0;
//		p++;
//	}
//	return 0;
//}
//3.ָ��ָ��Ŀռ��ͷ���
//int* test()
//{
//	int a=10;
//	return &a;
//}
//int main()
//{
//	int *p=test();
//	*p=20;
//	return 0;
//}
//int main()
//{
//	int a=10;
//	int *p=&a;//��ʼ��
//	int *p2=NULL;
//	//ʹ��p����a
//	p=NULL;
//	if(p!=NULL)
//		*p=0;
//	return 0;
//}
//ָ������
//int main()
//{
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	int i=0;
//	int *p=arr;
//	for(i=0;i<10;i++)
//	{
//		printf("%d ",(*p+i));
//	}
//	return 0;
//}
//int main()
//{
//	//ָ��-ָ���ǰ�᣺
//	//����ָ��ָ��ͬһ��ռ�
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	printf("%d\n",&arr[9]-&arr[0]);
//	//ָ��-ָ��ľ���ֵ�Ǽ��� ָ���ָ��֮��Ԫ�صĸ���
//	return 0;
//}
//#include<string.h>
////���ַ���ʵ��strlen
////1.������
////	2.�ݹ�
////	3.ָ��
//int my_strlen(char* str)
//{
//char* start=str;
//char* end=str;
//while(*end!='\0')
//{
//	end++;
//}
//return end-start;//?
//}
//
//int main()
//{
//	int len=my_strlen("abc");
//	//[a][b][c][\0]
//	printf("%d\n",len);
//	return 0;
//}
//int main()
//{
//	int arr[10]={0};
//	printf("%p\n",arr);
//	printf("%p\n",arr+1);
//
//	printf("%p\n",&arr[0]);
//	printf("%p\n",&arr[0]+1);
//
//	printf("%p\n",&arr);//����ָ������
//	printf("%p\n",&arr+1);
//
//	//��������������Ԫ�صĵ�ַ
//	//��������������
//	//sizeof(������)�����������������Ĵ�С
//	//&����������ʾ��������
//
//	return 0;
//}

int main()
{
	int arr[10]={0};
	int i=0;
	int* p=arr;
	int sz=sizeof(arr)/sizeof(arr[0]);
	
	//�������ͨ��ָ��������
	//��ʼ��
	for(i=0;i<sz;i++)
	{
		//printf("%p---------%p",p+i,&arr[i]);
		*(p+i)=i+1;
	}
	//��ӡ
	for(i=0;i<sz;i++)
	{
		//printf("%d ",*(p+i));//*(arr+i) arr[i] p[i]
		//printf("%d ",p[i]);//*(i+p)==*(p+i)==p[i]
		printf("%d ",i[p]);


	}
	/*for(i=0;i<sz;i++)
	{
		printf("%d ",arr[i]);
	}*/
	return 0;
}