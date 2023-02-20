import java.util.Scanner;
class unaryy
{
   public static void main(String args[])
{
 Scanner sc =  new Scanner(System.in);
System.out.println("Enter the value");
int a= sc.nextInt();
int ans= (~a);


System.out.println("The output is" +ans);

}
}