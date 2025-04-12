#include <stdio.h>
#include <string.h>
int main(){
	char str[100];
	scanf("%s",&str);
	int sum = str[strlen(str) - 1] - '0';
	sum += str[0] - '0';
	printf("%d",sum);
}
