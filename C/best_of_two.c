#include <stdio.h>
#include <math.h>

int two_max_sum(int a,int b,int c){
	if(a<b && a<c){
		return b+c;
	}
	else if(b<c){
		return a+c;
	}
	else{
		return a+b;
	}
}

int main(){
    int a1,a2,a3,b1,b2,b3;
    scanf("%d%d%d%d%d%d",&a1,&a2,&a3,&b1,&b2,&b3);
    int asum = two_max_sum(a1,a2,a3);
	int bsum = two_max_sum(b1,b2,b3);
	
	if(asum > bsum)
		printf("Alice");
    else if (asum < bsum)
		printf("Bob");
    else
		printf("Tie");

    
}
