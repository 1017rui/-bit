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
//#define ����ı�ʶ������
//#define MAX 1000 
//�Ա�
//����һ��ö������
//enum Sex
//{
//	MALE,
//	FEMALE,
//	SECRET//ö�ٳ���
//};
//int main()
//{
	//const int n=10;//˵����ʱ�˿�n��Ϊ����
	//int arr[n]={0};
//int a=MAX;
//MAX=2000;
//printf("%d\n",a);
	//ö�ٳ�����һһ�о�
	//�Ա��У�Ů������
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
	//ת���ַ���\tˮƽ�Ʊ����tab��
	//printf("c:\\test\\32\\test.c");//�����c:\test\32\test.c
	//printf("\a\a\a\a\a\a\a\a\a\a\a\a");//����������

	
	//printf("hehe\n");
	//printf("%c",'\'');//%c��ӡ�ַ�,��\ת��'
	//
	//printf("hello\nworld");
	//printf("%d\n",strlen("bit"));//3
	//printf("%d\n",strlen("c:\test\32\test.c"));//13
//	printf("%c\n",'\32');//32��Ϊʮ������Ϊ��2*8^0+3*8^1=26,
//	printf("%c\n",'\x41');//ʮ��������41��Ϊʮ����Ϊ65
//	return 0;
//}
//ѡ�����
//int main()
//{
//	int learn=0;
//	printf("�������\n");
//	printf("��Ҫ�ú�ѧϰ��(1/0)\n");
//	scanf("%d",&learn);
//	if(learn==1)
//		printf("�õ�offer\n");
//	else
//		printf("�ؼ�������\n");
//	
//	return 0;
//}
//ѭ�����	
//int main()
//{
//	int line=0;
//	printf("�������\n");
//	while(line<20)//ѭ������
//	{
//		printf("�ô���:%d\n",line);
//		line ++;
//	}
//	printf("�õ���offer\n");
//	return 0; 
//}
//����
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
//	sum=ADD(num1,num2);//���ú���ADD
//	printf("%d\n",sum);
//	return 0;
//}
//int main()
//{
//	int arr1[10]={1,2,3,4,5,6,7,8,9,10};//��������Է�һ����ͬ���͵�����
//	//int arr2[]={1,2,3,4,5,6,7,8,9,10};����Ԫ���±���㿪ʼ
//	//printf("%d\n",arr1[5]);//�����±�Ϊ5������Ԫ��
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

