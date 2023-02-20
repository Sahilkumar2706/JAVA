import java.util.Scanner;
class Main2
{
  public static void main(String args[])
{
  Scanner ob = new Scanner(System.in);
  String name;
   char grade;
   int  age;
System.out.println("Enter the name: ");
name= ob.nextLine();
System.out.println("Enter the grade: ");
 grade=ob.next().charAt(0);
System.out.println("Enter the age: ");
age= ob.nextInt();

System.out.println("Enter the name: "+name);
System.out.println("Enter the grade: "+grade);
System.out.println("Enter the name: "+age);


}
}