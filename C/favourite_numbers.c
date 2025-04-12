 #include<stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    if ( n % 2 == 0 && n % 7 == 0)
        printf("Alice");
    else if ( n % 2 == 1 && n % 9 == 0)
        printf("Bob");
    else 
        printf("Charlie");
}
