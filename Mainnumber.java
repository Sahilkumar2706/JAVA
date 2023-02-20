import java.util.Scanner;
class number{
int sum=0;
int arr[] = new int[50];

int average(int num)
{

   sum= sum+num;
return sum;
}

}

class Mainnumber{
public static void main(String args[])
{
int d;
number n1 = new number();
Scanner sc = new Scanner(System.in);
for(int i=0;i<5;i++)
{
 n1.arr[i]= sc.nextInt();
 d = n1.average(n1.arr[i]);
System.out.println(d);
}


}
}