#include <stdio.h>
#include <string.h>
#include <stdbool.h>

bool checkRecord(char* s){
	int cntA = 0;
	int cntL = 0;
	int idx = 0;
	while(idx <= strlen(s)-1){

		while( s[idx] == 'L'){
			cntL++;
			idx++;
			if(cntL == 3) return false;;
		}

		cntL = 0;

		if(s[idx] == 'A'){
			cntA++;
			if(cntA == 2) return false;;
		}
		idx++;	
	}
	return true;
}

void main(){
	char str[] = "PPLALL";
	int ret = checkRecord(str);
	printf("Status : %d\n",ret);
}
