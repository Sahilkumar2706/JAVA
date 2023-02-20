import java.util.Scanner;
class print
{
public static void main(String args[])
{
  Scanner sc = new Scanner (System.in);
  System.out.print( "Enter the element");

int b[]= new int[5];
for(int i=0;i<5;i++)
{
b[i]= sc.nextInt();
}
for(int i=0;i<5;i++)
{
 System.out.print(b[i]+" " );

}
}
}