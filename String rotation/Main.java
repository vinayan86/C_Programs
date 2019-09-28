
#include<stdio.h>
#include<string.h>
void main()
{  
  int i;
  char str[20],str1[20];
  scanf("%s",str);
   scanf("%s",str1);
  char temp[20];
  int str_len = strlen(str);
  int no_of_rotations=1,c=0;
 while(no_of_rotations!=str_len)
 {
 
  for(int index = 0; index < str_len; index++)
  {
    i = (index + no_of_rotations) % str_len;
    temp[i] = str[index];
  }
  if(strcmp(temp,str1)==0)
  {
      c=1;
      break;
  }
  
  no_of_rotations++;
   // printf("%d",c);
 }
 if(c==1)
  printf("Yes");
  else
   printf("No");
}