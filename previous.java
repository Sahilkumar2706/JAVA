import java.util.Scanner;
class previous
{
 public static void main(String args[])
{
System.out.print("Enter the term");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
 int a=0;
int b=1;
for(int i=1;i<=n;i++)
{
  System.out.print(a+" ");
int c= a+b;
a=b;
b=c;
}
}
}
