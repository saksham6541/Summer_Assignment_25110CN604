#include<stdio.h>
#include<math.h>
int count_digit(int n );
int main()
{

    int sum = 0;

    int a,b;
    printf("Input the range: \n");
    scanf("%d%d",&a,&b);


    for(int i=a;i<=b;i++)
    {
    int d = count_digit(i);
    int temp=i;
    
    while(temp!=0)
    {
        int r=temp%10;
        sum+=pow(r,d);
        temp/=10;
    }
    if(i==sum)
    {
        printf("%d\n",i);
    }
    sum=0;
}
}
int count_digit(int n)
{
    if (n<10)
    {
        return 1;
    }
    int c=0;

    while(n!=0)
    {
        c++;
        n/=10;
    }
    return c;
}