import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
      int A=sc.nextInt();
      double t=sc.nextFloat();
       
      if (t==13.30f)
      {
        
          if(A>13)
          {
        System.out.println("$5.00");
          }
          else
          {
          System.out.println("$2.00");
           }
}
      else
      {
       
        if(A>13)
          {
        System.out.println("$8.00");
          }
     
      else
      {
        System.out.println("$4.00");
      }
      }
}
}