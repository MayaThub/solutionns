#include <stdio.h>
#include <math.h>

int FactsSum(int n){
	int i,sum = 1;
	for ( i = 2; i <= ceil(n/2);i++){
		if(n%i == 0)
			sum += i;
	}
	return sum;
}

int main(){
    int a,b;
    scanf("%d%d",&a,&b);
    if (FactsSum(a) == b){
        printf("Amicable");
    }
    else{
        printf("Not Amicable");
    }
    
}
