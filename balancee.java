import java.util.Scanner;
class balancee
{
  public static void main(String args[])
{

   float balance=3045.65f;
   System.out.println("Select the option");
  System.out.println("1= to withdraw money");
System.out.println("2= to deposit money");
System.out.println("3= check balance");
   Scanner sc= new Scanner(System.in);
 int option;
float amount;
option= sc.nextInt();
if(option==1)
{
System.out.println("Enter the withdrawl amount");

  amount= sc.nextFloat();
float total_balance = balance - amount;
System.out.println("Successfully done");
System.out.println("total_balance= "+total_balance);
}

if (option == 2)
{
  System.out.println("Enter the amount");
  amount = sc.nextFloat();
  float total_balance = balance +amount;
System.out.println("Sucessfully deposited");
System.out.println("total balance = "+ total_balance);

}

if(option==3)

{
  System.out.println("Total balance "+balance );
}


  
}
}