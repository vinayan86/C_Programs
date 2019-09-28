#include<stdio.h>
int main()
{
int size;
    scanf("%d", &size);
    
    // Get the array elements
    int a[size], i,j,k;
    for(i=0; i<size; i++)
    {
        scanf("%d", &a[i]);
    }
    for(i=0; i<size-1; i++)
    {
         for(j=i+1; j<size; j++)
    {
               for(k=j+1; k<size; k++)
    {
        printf("(%d, %d, %d) ",a[i],a[j],a[k]);
               }
           
         }
      printf("\n");
    }
  return 0;
}