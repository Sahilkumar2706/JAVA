import java.util.Scanner;
class volume
{
  int l,w,h;
void getdata()
{
Scanner sc = new Scanner(System.in);
int l = sc.nextInt();
int w = sc.nextInt();
int h= sc.nextInt();
}

void printdata()
{
System.out.println(l);
System.out.println(w);
System.out.println(h);

}
}

class MainVolume1
{
public static void main(String args[])
{
 Scanner sc = new Scanner (System.in);
volume v= new volume();
volume v1 = new volume();
v.getdata();
v.printdata();
v1.getdata();
v1.printdata();
}

}