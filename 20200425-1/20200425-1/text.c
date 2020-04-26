#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<string.h>

void reverse1 (char* left,char* right){//实现逆置
	while(left<right){
		char tmp=*left;
		*left=*right;
		*right=tmp;
		left++;
		right--;
	}
}
void reverse(char* arr){//将单词倒置，标点不倒置
	int len=strlen(arr);//获取字符串的长度
	reverse1(arr,arr+len-1);//先把整个字符串逆置
	//!gnijeiB ekil I
	//Beijing! like I
	while(*arr!='\0'){//逆置每个单词
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
	gets(arr);//读取一个字符串I like Biejing!
	reverse(arr);
	printf("%s\n",arr);
	return 0;
}