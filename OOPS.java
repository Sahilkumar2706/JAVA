import java.util.Scanner;
class Pen{
String color;
String type;

void print()
{
System.out.println("Writng something");
}
void printcolor()
{
System.out.println(this.color);
System.out.println(this.type);

}
}
class OOPS{
public static void main(String args[])
{
Pen p1 = new Pen ();
Pen p2 = new Pen();
p1.color = "blue";
p1.type = "gel";
p2.color = "red";
p2.type= "ball";

p2.printcolor();
p1.printcolor();


p1.print();

}
}