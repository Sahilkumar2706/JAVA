import java.util.Scanner;
class entrynum
{
   public static void main(String args[])
{
 int sum=0; 
int digit=0;
System.out.print("Enter the number");
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
while(num>0)
{
    



int add=num%10;
sum= sum+add;
digit++;
num=num/10;
 }
System.out.print(sum);

}
}