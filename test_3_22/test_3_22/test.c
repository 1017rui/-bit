//#include <stdio.h>
//int main()
//{
//	int a = 0, b = 0;
//	for (a = 1, b = 1; a <= 100; a++)
//	{
//		if (b >= 20) break;
//		if (b % 3 == 1)
//		{
//			b = b + 3;
//			continue;
//		}
//		b = b-5;
//	}
//	printf("%d\n", a);
//	return 0;
////}��д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9
//#include<stdio.h>
//int main()
//{
//	int i=1;
//	int count=0;
//	while(i<=100)
//	{
//      if(i%10==9)
//	     count++;
//	  if(i/10==9)
//		  count++;
//      i++;
//	}
//	printf("%d ",count);
//	return 0;
//}//����1/1-1/2+1/3-1/4+1/5 ���� + 1/99 - 1/100 ��ֵ����ӡ�����
//#include <stdio.h>
//int main()
//{
//	int i=1;
//	int flag=1;
//	double num=0;
//	while(i<=100)
//	{
//		
//      num=num+((double)flag)/i;
//	  flag=-flag;
//	  i++;
//	}
//	printf("%f",num);
//	return 0;
//}//��10 �����������ֵ
////
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//int main()
//{
//	int arr[10];
//	int i=0;
//	int max=0;//ע�⣺һ��ʼ���ܸ�max��ֵ��arr[0],��Ϊ��ʱ��û������ֵ��û���κ����塣
//	printf("������ʮ��������\n");
//	//¼��ʮ������������������
//	for(i=0;i<10;i++)
//	{
//		scanf("%d",&arr[i]);
//	}
//	//�ҳ�ʮ�����е������
//     max=arr[0];
//    for(i=0;i<10;i++)
//	{
//		if(arr[i]>=max)
//		{
//			max=arr[i];
//		}
//	}
//	//������ֵ
//	printf("%d ",max);
//	return 0;
//}//����Ļ�����9*9�˷��ھ���
//#include<stdio.h>
//int main()
//{
//	int row=1;//��
//	int column=1;//��
//	for(column=1;column<=9;column++)
//	{
//		for(row=1;row<=9;row++)
//		{
//			if(row<=column)	
//			{	
//				printf("%d*%d=%d ",row,column,row*column);
//			}
//			if(row==column)
//			{
//				printf("\n");
//				break;
//			}
//		}
//	}
//	return 0;
//}
//�Ͽλعˣ�
//�������������Լ����
//#include<stdio.h>
//int main()
//{
//	int m=24;
//	int n=18;//24��18���Լ����������18
//	int min=m>n?n:m;
//	while(1)
//	{
//		if(m%min==0&&n%min==0)
//		{
//			printf("���Լ���ǣ�%d\n",min);
//			break;
//		}
//		min--;
//	}
//
//
//	return 0;
//}
//int main()
//{
//	int m=24;
//	int n=18;
//	//շת�����
//	while(m%n)
//	{//ѭ��Ϊ�ٽ���ѭ��
//		int r=m%n;
//		m=n;
//		n=r;
//	}
//	printf("���Լ����%d",n);//ѭ��Ϊ�ٵ������˵��m%n=0��nΪ���Լ����
//	return 0;
//}
//��100-200֮�������
//int main()
//{
//	int i=100;
//	while(i<=200)
//	{
//		int j=2;
//		while(j<i)
//		{
//			if(i%j==0)
//			{
//				break;
//				
//			}
//			j++;
//		}
//		if(j==i)
//		{
//			printf("%d ",i);
//		}
//		i++;
//	}
//	return 0;
//}//��i=a*b��ʱ����a��b��������һ��������<��ƽ��i
//#include<math.h>
//int main()
//{
//	int i=101;
//	int count=0;
//	while(i<=200)
//	{
//		int j=2;
//		while(j<=sqrt(i))
//		{
//			if(i%j==0)
//			{
//				break;
//				
//			}
//			j++;
//		}
//		if(j>sqrt(i))
//		{
//			printf("%d ",i);
//			count++;
//		}
//		i=i+2;//ֱ������������ż��һ����������
//	}
//	printf("%d\n ",count);
//	return 0;
//}
//int main()
//{
//	int ch=0;
//     /*ch=getchar();
//     putchar(ch);*/
//	while((ch=getchar())!=EOF)//EOF�ļ�������־�������ļ�ĩβ����ctrl��Z���ɡ�
//		putchar(ch);
//	return 0;
//}
//int main()
//{
//	char input[20]={0};
//	int ch=0;
//	printf("���������룺>");
//	scanf("%s",input);
//	printf("��ȷ�����루Y/N��:>");
//	//getchar();
//	//��ջ�����
//	while((ch=getchar())!='\n')
//	{
//		;
//	}
//	ch=getchar();
//	if(ch=='Y')
//	{
//		printf("ȷ�ϳɹ�\n");
//	}
//	else
//	{
//		printf("ȷ��ʧ��\n");
//	}
//	return 0;
//}�������
//int main()
//{
//	int ch=0;
//	while((ch=getchar())!=EOF)
//	{
//		if(ch<'0'||ch>'9')
//			continue;
//		putchar(ch);
//	}
//	return 0;
//}����n�Ľ׳�
//int main()
//{
//	int n=0;
//	int i=1;
//	int ret=1;
//	scanf("%d",&n);
//	for(i=1;i<=n;i++)
//	{
//	 ret=ret*i;
//	}
//	printf("%d",ret);
//	return 0;
//}����1!+2!+3!+.....+n!
//int main()
//{
//	int n=0;
//	int i=1;
//	int ret=1;
//	int sum=0;
//	for(n=1;n<=3;n++)
//	{
//		ret=1;
//		for(i=1;i<=n;i++)
//		{
//			ret=ret*i;
//			
//		}
//		sum=sum+ret;
//	}
//printf("%d",sum);
//	return 0;
//}����n�Ľ׳ˣ�
//#define _CRT_SECURE_NO_WARNINGS
//#include <stdio.h>
//int main()
//{
//int n=0;
//int i=1;
//int ret=1;
//printf("����һ������:");
//scanf("%d",&n);
//for(i=1;i<=n;i++)
//{
//ret=ret*i;
//}
//printf("���Ľ׳�Ϊ��%d",ret);
//	return 0;
//}����1��+2��+3!+4!+5!....+n!
//int main()
//{
//	int n=0;
//	int i=1;
//	int m=1;
//	int ret=1;
//	int sum=0;
//	printf("����һ������:");
//    scanf("%d",&n);
//    for(m=1;m<=n;m++)
//     {
//	 ret=1;
//	 for(i=1;i<=m;i++)
//	{
//
//	 ret=ret*i;
//	}
//	sum=sum+ret;
//}
//printf("���Ϊ��%d",sum);
//	return 0;
//}
//int main()
//{
//	int n=0;
//	int i=1;
//	int ret=1;
//	int sum=0;
//	for(n=1;n<=3;n++)
//	{
//		ret=ret*n;
//		sum=sum+ret;
//	}
//	printf("%d",sum);
//
//	return 0;
//}
//��һ�����������в��Ҿ����ĳ������n
#include<stdio.h>
//int main()
//{
//	//int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	//�±���㿪ʼ
//	int k=7;//Ҫ�ҵ�����
//	int sz=sizeof(arr)/sizeof(arr[0]);//����Ԫ�ظ���
//	int i=0;
//	for(i=0;i<sz-1;i++)
//	{
//		//0-9
//		if(arr[i]==k)
//		{
//			printf("�ҵ��ˣ��±��ǣ�%d\n",i);
//		break;
//		}
//	}
//	if(i==sz)
//	{
//		printf("�Ҳ���\n");
//	}
//	return 0;
//}
//int main()
//{
//	//int arr[10]={1,2,3,4,5,6,7,8,9,10};
//	int arr[]={1,2,3,4,5,6,7,8,9,10};
//	//�±���㿪ʼ
//	int k=7;//Ҫ�ҵ�����
//	int sz=sizeof(arr)/sizeof(arr[0]);//����Ԫ�ظ���
//	
//    int left=0;
//	int right=sz-1;
//	
//	while(left<=right)
//	{
//		//0-9
//		int mid=(left+right)/2;
//		if(arr[mid]<k)
//		{
//			left=mid+1;
//		}
//		else if(arr[mid]>k)
//		{
//			right=mid-1;
//		}
//		else
//		{
//			printf("�ҵ��ˣ��±��ǣ�%d\n",mid);
//		    break;
//		}
//		
//	}
//	if(left>right)
//	{
//		printf("�Ҳ���\n");
//	}
//	return 0;
//}
//. ��д���룬��ʾ����ַ��������ƶ������м���
#define _CRT_SECURE_NO_WARNINGS
#include<string.h>
#include<windows.h>
//int main()
//{
//	//welcome to bit!!!!!!!!
//	//######################
//	//w####################!
//	//we##################!!
//	//wel################!!!
//	//welcome to bit !!!!!!!
//	char arr1[]="welcome to bit!!!!!!!!";
//	char arr2[]="######################";
//	int len=strlen(arr1);
//	int left=0;
//	int right=len-1;
//	while(left<=right)
//	{
//		arr2[left]=arr1[left];
//		arr2[right]=arr1[right];
//		printf("%s\n",arr2);
//		Sleep(1000);//˯�ߺ���-��λ�Ǻ���
//		system("cls");//ִ��ϵͳ����,cls������Ļ��Ϣ
//		left++;
//		right--;
//	}
//	printf("%s\n",arr2);
//	return 0;
//}
//��д����ʵ�֣�ģ���û���¼�龰������ֻ�ܵ�¼���Ρ�
//��ֻ���������������룬���������ȷ�� ��ʾ��¼�ɣ�������ξ�����������˳�����
//int main()
//{
//	int i=0;
//	char password[20]={20};
//	for(i=0;i<3;i++)
//	{
//		printf("���������룺>");
//		scanf("%s",password);//������ȷ��������123456
//		//�ж�
//		//�����ַ����Ƚϴ�С����ֱ����==��Ӧ��ʹ��strcmp(),
//		if(strcmp(password,"123456")==0)
//		{
//			printf("��¼�ɹ�\n");
//			break;
//		}
//		else
//		{
//			printf("�������\n");
//		}
//	}
//	if(i==3)
//	{
//		printf("������������˳�����\n");
//	}
//	return 0;
//}
//��������Ϸ��
#include<stdlib.h>
#include<time.h>
//void menu()
//{
//	printf("***************************\n");
//	printf("*** 1.play       0.exit ***\n");
//	printf("***************************\n");
//}
////RAND_MAX-32767
////rand��������0-32767֮����������
////time �������Է���ʱ���
////ʱ���ָ������ڵ���time�������ʱ��ͼ��������ʼʱ�䣨1970.1.1  0:0:0����һ����ֵ����λ����
//void game()
//{
//	int guess=0;
//	//1.��������һ�������
//
//	//srandֻҪ����һ�Σ�����Ƶ���ĵ���
//	//srand((unsigned int)time(NULL));
// 	int ret =rand()%100+1;//1-100֮��
//	//printf("%d\n",ret);
//	//2.������
//	while(1)
//	{
//		printf("������֣�>");
//		scanf("%d",&guess);
//		if(guess>ret)
//		{
//			printf("�´���\n");
//		}
//		else if(guess<ret)
//		{
//			printf("��С��\n");
//		}
//		else
//		{
//			printf("��ϲ�� ���¶���\n");
//			break;
//		}
//	}
//}
//int main()
//{
//	int input=0;
//	
//	//srandֻҪ����һ�Σ�����Ƶ���ĵ���
//	srand((unsigned int)time(NULL));
//	do{
//		menu();
//		printf("��ѡ��:>");
//		scanf("%d",&input);
//		switch(input)
//		{
//		case 1:
//			//printf("������\n");
//			game();
//			break;
//		case 0:
//			printf("�˳���Ϸ\n");
//			break;
//		default:
//			printf("ѡ�����\n");
//			break;
//
//		}
//
//	  }while(input);
//	return 0;
//}
//�ػ�����
//
//��ҵ����д������һ�� 1�� 100 �����������г��ֶ��ٸ�����9��
//int main()
//
//{
//
//int i=1;
//
//int count=0;
//
//for(i=1;i<=100;i++)
//{
//	if(i%10==9)
//	{
//		count++;
//	}
//	if(i/10==9)
//	{
//		count++;
//	}
//}
//printf("%d ",count);
//
//return 0;
//
//}
//��ӡ�˷��ھ���
//int main()
//{
//	int i=0;
//	for(i=0;i<=9;i++)
//	{
//		//ÿ�δ�ӡһ��
//		int j=0;
//		for(j=1;j<=i;j++)
//		{
//			printf("%d*%d=%2d ",i,j,i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//}
//int main()
//{
//	int len=strlen("abc");
//	printf("%d\n",len);
//}