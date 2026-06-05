#include<stdio.h>
int main()
{
    int  n;
    
    printf("Input the balue of n \n");
    scanf("%d",&n);

    int sum=0;

    for(int i=1;i<=n;i++)
    {
        sum+=i;
    }

    printf("Sum of first %d natural numbers is %d",n,sum);
}