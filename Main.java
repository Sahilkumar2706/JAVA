import java.util.Scanner;
class Main
{
public static void main(String args[])
{
  Scanner obj = new Scanner (System .in);
  String name;
System.out.println("Enter the name");
name=obj.nextLine();

System.out.println("Enter the age");

int age=obj.nextInt();

System.out.println("Enter the Salary");
 float salary= obj.nextFloat();

System.out.println("Enter the grade");
char grade=obj.next().charAt(0);

System.out.println("Enter the name"+name);
System.out.println("Enter the age"+age);
System.out.println("Enter the grade"+grade);
System.out.println("Enter the salary"+salary);
}
}
 

