import java.util.Scanner;
class c
{
public static void main(String args[])
{
int d;
int count=0;
Scanner sc = new Scanner(System.in);
String ch = sc.nextLine();
System.out.print(ch.length());

for(int i=0;i<ch.length();i++)
{
if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch== 'u')
{
count ++;

}

}

if(ch.length()>5 && count>2)
{
System.out.print("Good string");

}
else
{
System.out.print("Bad string");

}

}
}