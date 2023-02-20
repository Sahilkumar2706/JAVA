class pen{
String color;
String type;
void print()
{
System.out.println(this.color);
System.out.println(this.type);
}
pen()
{
System.out.println("constructor called");
}

}
class practice1{
public static void main(String args[])
{
pen p1= new pen();
p1.color="blue";
p1.type = "gel";
p1.print();

}
}