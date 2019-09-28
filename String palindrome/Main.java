#include <stdio.h>
#include <string.h>

int main(){
    char st1[20];
    int i, l, c= 0;
    scanf("%s", st1);
    l = strlen(st1);
    
    for(i=0;i < l ;i++)
    {
        if(st1[i] != st1[l-i-1])
        {
            c = 1;
            break;
   }
}
    
    if (c==1)
    {
        printf("%s is not a palindrome", st1);
    }    
    else
    {
        printf("%s is a palindrome", st1);
    }
    return 0;
}
