import java.util.Scanner;
   public class Fact {
      public static void main(String args[]){
         int i, factorial=1;
         System.out.println("Enter number:");
         Scanner sc = new Scanner(System.in);
         int number;
         if(sc.hasNextInt())
            number = sc.nextInt();
         else
            number = 0;
         for(i = 1; i<=number; i++) {
            factorial *= i;
         }
         System.out.println("Factorial of the given number is:: "+factorial);
      }
   }
