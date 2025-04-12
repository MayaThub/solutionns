#include<stdio.h>
int main(){
    int u;
    scanf("%d",&u);
    if ( u == 1)
        printf("Monday");
    else if ( u == 2)
        printf("Tuesday");
    else if ( u == 3)
        printf("Wednesday");
    else if ( u == 4)
        printf("Thursday");
    else if ( u == 5)
        printf("Friday");
    else if ( u == 6)
        printf("Saturday");
    else if ( u == 7)
        printf("Sunday");
    else
        printf("Invalid input");
    
}
