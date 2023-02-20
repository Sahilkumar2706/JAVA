class employee
{
String ename;
int e_id;
float salary;
void display()
{
System.out.println(ename);
System.out.println(e_id);
System.out.println(salary);
}

}
class Mainemployee{
public static void main(String args[])
{
 employee e1= new employee();
e1.ename="Sahil";
e1.e_id=101;
e1.salary= 15655.3f;
e1.display();
}
}