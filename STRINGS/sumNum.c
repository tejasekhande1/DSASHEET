#include <stdio.h>
#include <string.h>

int countSum(char *s){
	int sum = 0;
	int i = 0;
	while(*s != '\0'){
		int num = 0;
		while(*s >= '0' && *s <= '9'){
			num = num*10 + (*s-48);
			s++;
		}
		sum = sum + num;
		s++;
	}
	return sum;
}

void main(){
	char str[20];
	printf("Enter String : ");
	
	int i=0;
	char ch;
	while((ch = getchar()) != '\n'){
		str[i++] = ch;
	}
	printf("User String : %s\n",str);
	int res = countSum(str);
	printf("Sum : %d\n",res);
}
