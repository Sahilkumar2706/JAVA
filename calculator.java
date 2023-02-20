
import java.util.Scanner;
class calculator
{
   public static void main(String args[])
{

   Scanner sc= new Scanner (System.in);
System.out.println(" Enter the value");
int a,b;
a = sc.nextInt();
b= sc.nextInt();
   
   System.out.println(" Enter the operation");
Scanner obj= new Scanner (System.in);
String s;
s = obj.nextLine();
switch(s)
{
  case "add":
{
   int add = a +b;
System.out.print("add: "+add);
break;
}

case "sub" :
{
int sub = a-b;
System.out.print("sub: "+sub);
break;
}
 case "mul" :
{
  int mul = a*b;
System.out.print("mul: "+mul);
break;
}
 case "mod" :
{
  int mod = a%b;
System.out.print("mod: "+mod);
break;
}
case "div":
{
 int div= a/b;
System.out.print("div: "+div);
break;
}

default:
{
 System.out.print("Enter the valid operation");
}
};

}
}