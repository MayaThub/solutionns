#include <stdio.h>
int main(){
	int n,i;
	scanf("%d",&n);
	int r=0,nc = n;
    while (nc > 0){
    	int l = nc%10;
    	nc /= 10;
    	r = ( 10 * r) + l;
	}
	if(n == r)
		printf("Palindrome");
	else
		printf("Not Palindrome");
}
