class information {
String name;
int id;
float salary;

information()
{
System.out.print("non -pararmterised");
}
information(int st)
{
System.out.print("Parameterized");
}

information(String s_name,int a,float g)
{
name= s_name;
id = a;
 salary= g;
}

void display()
{
System.out.println(name);

System.out.println(id);
System.out.println(salary);
}

}

class Maininformation
{
public static void main(String args[])
{
information f1= new information("Sahil",22,56.5f);
f1.display();
}
}