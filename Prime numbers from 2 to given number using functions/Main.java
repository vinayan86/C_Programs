#include<stdio.h>
int prime(int n)
{
  for(int i=2;i<=n;i++)
    {
        int c=0;
        for(int j=1;j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
         
       if(c==2)
        {
            printf("%d\n",i);
        }
    }
}
int main(){
  int n;
  scanf("%d",&n);
    int k=prime(n);
    return 0;
}