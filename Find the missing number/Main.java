#include<stdio.h>

int main()
{
  int arr_size;
  scanf("%d", &arr_size);
  int a[arr_size];
  for(int index = 0; index < arr_size; index++)
  {
    scanf("%d", &a[index]);
  }

    for(int index = 0; index < arr_size-1; index++)
  {
    int sum = a[index]+1;
      if(sum!=a[index+1])
        printf("%d",sum);
        
  }
   
  
  return 0;
}