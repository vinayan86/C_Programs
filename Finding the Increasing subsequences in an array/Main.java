
#include<stdio.h>
int main()
{
    int arr_size;
    scanf("%d", &arr_size);
    int arr[arr_size];
    for(int index = 0; index < arr_size; index++)
    {
       scanf("%d", &arr[index]);
    }
   
    for(int index1 = 0; index1 <= (arr_size - 1); index1++)
    {
        for(int index2 = index1+1; index2 <= (arr_size - 1); index2++)
        {
if(arr[index1]<arr[index2])
  
                  printf("%d,%d\n",arr[index1],arr[index2] );
       
            
        }
    }
    return 0;
}