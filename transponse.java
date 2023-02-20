import java.util.Scanner;
class transpose
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int arr[][]= new int[4][4];
System.out.print("Enter the value");
for(int i=0;i<arr.length;i++)
{
 for(int j=0;j<arr.length;j++)
{
 arr[i][j]= sc.nextInt();
}
} 
 
}
}