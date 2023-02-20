class info
{
String name;
int age;
void print()
{
System.out.println(this.name);
System.out.print(this.age);
}
info(String name, int age)
{
this .name= name;
this.age = age;
}
}

class practice2
{
public static void main(String args[])
{
info f1 = new info("Sahil", 22);
f1.print();
}

}