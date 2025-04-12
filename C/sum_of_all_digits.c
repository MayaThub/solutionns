#include <stdio.h>
#include <string.h>
int main(){
	int n,sum=0;
	scanf("%d",&n);
    while (n > 0) {
        int l = n%10;
    	n /= 10;
        sum += l;
    }
	printf("%d",sum);
}
