#include<stdio.h>
int main()
{
    int n ;
    printf("Input the number");
    scanf("%d",&n);

    int p=-1;

    if (n<=1)
    {
        p=1;
    }
    for(int i =2;i<=n/2;i++)
    {
        if (n%i == 0)
        {
            p=1;
            break;
        }
    }
    if(p==1)
    {
        printf("The number is not a prime number");
    }
    else{
        printf("The number is a prime number");
    }
}