
class operator{

int calculate(int a, int b)
{
int add = a+b;
return add;
}

int calculate()
}

class Mainoperator
{
public static void main(String args[])
{

operator op = new operator();

System.out.print(op.calculate(1,2));
}
}