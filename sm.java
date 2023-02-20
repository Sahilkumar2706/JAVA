import java.util.Scanner;
class sm
{
  public static void main(String args[])
{
 int sum=0;
   Scanner sc = new Scanner(System.in);
System.out.println("Enter the value");
    int n = sc.nextInt();
for(int i =1;i<=n;i++)
{
   if(i%2==0)
{
    sum = sum+i;
   
continue;

}

}
System.out.print(sum);

}

}