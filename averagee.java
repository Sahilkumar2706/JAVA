import java.util.Scanner;
class averagee
{
public static void main(String args[])
{
int sum=0;
 Scanner sc= new Scanner(System.in);
int arr[] = new int[5];
for(int i=0; i<arr.length;i++)
{
 arr[i]= sc.nextInt();
}
for(int i=0; i<arr.length;i++)
{
  sum+= arr[i];

}
int average = (sum/arr.length);
System.out.print(average);
}

}