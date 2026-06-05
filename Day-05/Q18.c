#include<stdio.h>
int sum_fact(int n);
int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    int sum=0;
    int temp =n;

    while (temp!=0)
    {
        int r= temp %10;
        sum+=sum_fact(r);
        temp/=10;
    }

    if(sum == n)
    {
        printf("%d is a strong number");
    }
    else
    {
        printf("%d is not a strong number");
    }
    
}
int sum_fact(int n)
{
    int fact=1;
    for(int i=1;i<=n;i++)
    {
        fact*=i;
    }

    return fact;

}