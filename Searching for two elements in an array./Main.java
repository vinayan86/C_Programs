#include<stdio.h>
int main()
{
int s;
  scanf("%d",&s);
  int a[s],m,n,k=-1,l=-1;
  for(int i=0;i<s;i++)
  {
    scanf("%d",&a[i]);
 
  }
  scanf("%d",&m);
    scanf("%d",&n);
    for(int i=0;i<s;i++)
  {
if(a[i]==m)
{
  k=i;
  
}
 if(a[i]==n)
{
   l=i;

     
}     
    } 
   printf("%d\n",k);
   printf("%d\n",l);

   
  return 0;
}