import java.util.Scanner;
class check_number
{
  public static void main(String args[])
{
  int n;
System.out.println("Enter the number ");
Scanner sc = new Scanner (System.in);
n= sc.nextInt();
if(n%2==0 && n>0)
{ 
  System.out.println("Even Positive number ");
}
else if(n%2==0 && n<0)
{
  System.out.println("Even negative");
}
else if(n%2==1 && n>0)
{ 
  System.out.println("odd positive");
}
else if(n%2!=0 && n<0)
{
 System.out.println("odd negative");
}
 else
{
System.out.println("Zero");
}
}


}