#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>

void reverse1 (char* left,char* right){//ʵ������
	while(left<right){
		char tmp=*left;
		*left=*right;
		*right=tmp;
		left++;
		right--;
	}
}
void reverse(char* arr){//�����ʵ��ã���㲻����
	int len=strlen(arr);//��ȡ�ַ����ĳ���
	reverse1(arr,arr+len-1);//�Ȱ������ַ�������
	//!gnijeiB ekil I
	//Beijing! like I
	while(*arr!='\0'){//����ÿ������
		char* begin=arr;
		while(*arr!='\0'&&*arr!=' '){
			arr++;
		}
		reverse1(begin,arr-1);
		if(*begin==' '){
			arr++;
		}
	}
}
int main(){
	char arr[100];
	gets(arr);//��ȡһ���ַ���I like Biejing!
	reverse(arr);
	printf("%s\n",arr);
	return 0;
}