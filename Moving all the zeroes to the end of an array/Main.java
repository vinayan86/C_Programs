#include<stdio.h>
int main()
{
 int s;
  scanf("%d",&s);
  int a[s],b[10],c[10],k=0,g=0,l=0;
  for(int i=0;i<s;i++)
  {
    scanf("%d",&a[i]);
 
  }

   for(int i=0;i<s;i++)
  {
  if(a[i]==0)
  {

    b[k]=a[i];
        k=k+1;
  }
     else
     {
         c[g]=a[i];
        g=g+1;
     }
   }
  
   for(int i=0;i<s;i++)
  { 
     a[i]=c[i];
     l=l+1;
   }
  
   for(int i=l+1;i<s;i++)
  { 
     a[i]=b[i];
   }
    
   for(int i=0;i<s;i++)
  { 
      printf("%d ",a[i]);
   }
   
  return 0;
}