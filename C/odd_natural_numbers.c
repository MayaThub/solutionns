
#include <stdio.h>

int main(){
	int n,i;
	scanf("%d",&n);
	printf("1 ");
	for (i = 2;i <= n;i++){
    	if (i%2 != 0)
    		printf("%d ",i);
	}
}
