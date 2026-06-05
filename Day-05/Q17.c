#include<stdio.h>
int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    int sum=0;
    for(int i=1;i<=n/2;i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
    }

    if(n==sum)
    {
        printf("%d is perfect number",n);
    }
    else
    {
        printf("%d is not a perfect number",n);
    }
}