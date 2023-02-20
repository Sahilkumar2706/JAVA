import java.util.Scanner;
class C1
{
public static void main(String args[])
{

int count=0;
Scanner sc = new Scanner(System.in);
String ch = sc.nextLine();

for(int i=0;i<ch.length();i++)
{
if(ch.charAt(i) == 'a' || ch.charAt(i)=='e' || ch.charAt(i)=='i' || ch.charAt(i)=='o' || ch.charAt(i)== 'u')
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