#include<stdio.h>
int is_prime(int n);
int main()
{
    int  a,b;
    printf("Input the range:\n");
    scanf("%d%d",&a,&b);

    printf("Prime numbers in the given range are; \n");

    for(int i =a;i<=b;i++)
    {
        if(!(is_prime(i)))
        {
            printf("%d",i);
        }
    }


}
int is_prime(int n)
{
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
        return 0;
    }
    else{
        return 1;
    }
}