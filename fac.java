import java.util.Scanner;
class fac
{
  public static void main(String args[])
{


System.out.print("Enter the number whose factorial you want");
Scanner sc= new Scanner (System.in);
int n= sc.nextInt();
int factorial=1;

int i=1;
while(i<=n)
{
  factorial=factorial*i;
  i++;
}
System.out.print("Factorial of number= "+factorial);
}
}