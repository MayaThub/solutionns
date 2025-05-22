#include <stdio.h>

int main(){
	int n,x;
	scanf("%d%d",&n,&x);
	
    int tcost = n*x;
	if(tcost >= 10000 && tcost <= 99999)
		printf("YES");
	else
		printf("NO");
}
