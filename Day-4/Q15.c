#include<stdio.h>
#include<math.h>
int count_digit(int n );
int main()
{

    int sum = 0;

    int n;
    printf("Input the number: \n");
    scanf("%d",&n);

    int d = count_digit(n);

    int temp=n;
    while(temp!=0)
    {
        int r=temp%10;
        sum+=pow(r,d);
        temp/=10;
    }
    if(n==sum)
    {
        printf("Number is an armstromng number");
    }
    else
    {
        printf("Number is not an armstrong number");
    }
}
int count_digit(int n)
{
    int c=0;

    while(n!=0)
    {
        c++;
        n/=10;
    }
    return c;
}