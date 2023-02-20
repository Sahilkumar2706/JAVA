class Employee{
int e_id;
char rank;


void get_employee_details()
{
    Scanner sc= new Scanner(System.in); 
 e_id= sc.nextInt();
rank= sc.next().charAt(0);
}

void print_details()
{
System.out.println(e_id);
System.out.print(rank);
}
}

class Maindetails{
public static void main(String args[])
{

Employee obj= new Employee();
obj.get_employee_details();
obj.print_details();


}
}