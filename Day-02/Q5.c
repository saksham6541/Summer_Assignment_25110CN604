#include<stdio.h>
int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    int sum=0;

    int temp =n;

    while(temp!=0)
    {
        int r=temp%10;
        sum+=r;
        temp/=10;
    }

    printf("Sum of digits of %d is %d",n,sum);

}