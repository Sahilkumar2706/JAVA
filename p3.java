import java.util.Scanner;
class p3
{
    public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);
String s= "java as adds";
int total = s.length();
int after_remove = s.replace(ch,"").length();
int total_count= total-after_remove;
System.out.print(total_count);
}
}