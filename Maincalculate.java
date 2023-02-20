import java.util.Scanner;
class  infer{
int num1;
int num2;

infer()

{
Scanner sc= new Scanner(System.in);
num1 = sc.nextInt();
num2 = sc.nextInt();
}

int calculate()
{
int multiple = num1*num2;
return multiple;
}
}

class Maincalculate{
public static void main(String args[])
{
infer f1 = new infer();
System.out.println(f1.calculate());

infer f2 = new infer();
System.out.print(f2.calculate());

}
}