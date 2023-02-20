import java.util.Scanner;
class infer
{
int num1;
int num2;
infer()
{

}

int calculator()
{
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int multiple= num1*num2;
return multiple;
}



}
 class Maininfer
{
public static void main(String args[])
{
   infer v1= new infer();
int c= calculator();
System.out.print(c);



}
}