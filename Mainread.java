import java.util.Scanner;
class read
{
int a;
int b;
void multiple(int num1,int num2)
{
if(num1%num2 ==0)
{
System.out.print("Yes");
}
else
{
System.out.print("No");
}
}
}

class Mainread{
public static void main(String args[])
{

read r = new read();
Scanner sc= new Scanner(System.in);
r.a = sc.nextInt();
r.b= sc.nextInt();
r.multiple(r.a,r.b);


}
}