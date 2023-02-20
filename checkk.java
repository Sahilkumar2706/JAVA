import java.util.Scanner;
class checkk
{
  public static void main(String args[])
  {  
      char ch;
      System.out.print("Enter the character");
      Scanner obj= new Scanner(System.in);
       ch = obj.next().charAt(0);
      if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
      {
        System.out.print("character is vowel");
      }
    else
{
    System.out.print("character is Consonant");
    
}
       
   }  
}