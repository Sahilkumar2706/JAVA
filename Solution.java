import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        float present = sc.nextFloat();
        int n = sc.nextInt();


switch(n)
{
case 1:
float value= sc.nextFloat();
float total = present- value;
                System.out.printf("%.2f",total);

break;
case '2':
 float value2 = sc.nextFloat();
            float totall = present+value2 ;
           
            System.out.printf("%.2f",totall);
break;

case '3':
 System.out.print(present);
break;

default:
 System.out.print("Error");

}
       }
}