import java.util.Scanner;
class factoriall
{
  public static void main(String args[])
{


   System.out.print("Enter the number");
Scanner sc= new Scanner (System.in);
int n= sc.nextInt();
int factorial=1;
int i=1;
while(i<=n)
{
 factorial=factorial*i;
}
System.out.print(factorial);
}
}