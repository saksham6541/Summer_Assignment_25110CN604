#include<stdio.h>
int is_prime(int n);
int main()
{
    int n;
    printf("Input the number \n");
    scanf("%d",&n);

    printf("Greatest prime Factor of %d is \n",n);

    for(int i=n/2;i>0;i--)
    {
        if(n%i ==0)
        {
            if(is_prime(i))
            {
            printf("%d \n",i);
            break;
            }
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