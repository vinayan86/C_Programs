#include<stdio.h>
int main()
{
    int arr_size;
    scanf("%d", &arr_size);
    int arr[arr_size],c=0,l=0;
    for(int index = 0; index < arr_size; index++)
    {
        scanf("%d", &arr[index]);
    }
   for(int index = 0; index < arr_size; index++)
    {
     if(arr[index]==1)
     {
       c++;
     }
  else
  {
    c=0;
  }
     if(l<c)
       l=c;
   }
     printf("%d ",l);
   return 0;
}
