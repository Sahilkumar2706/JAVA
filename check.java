Aimport java.util.Scanner;
class check
{
public static void main(String args[])
{
  char characterr; 
  System.out.println("Enter the character");
  Scanner sc = new Scanner(System.in);
  characterr= sc.next().charAt(0);
  
 switch(characterr)
{
   case 'a':
    System.out.print("Vowel");
    break;
    
   case 'e':
    System.out.print("Vowel");
   break;

    case 'i':
     System.out.print("Vowel");
    break;

     case 'o':
      System.out.print("Vowel");
      break;

      case'u':
      System.out.print("Vowel");
     break;

      default:
      System.out.print("consonant");

}
}
}
