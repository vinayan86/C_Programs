import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.BufferedReader;
class Main
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
      int s=1,f=1;
      if(n==0)
      System.out.println("Yes");
      else
      {
      for(int i=1;i<n;i++)
      {
        s=s*i;
        if(s==n)
        {
          System.out.println("Yes");
          f=0;
            break;
        }
      }}
      if(f==1)
      System.out.println("No");
      
    }
}