import java.util.Scanner;
   public class Fact {
      public static void main(String args[]){
         int i, factorial=1;
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();
         for(i = 1; i<=number; i++) {
            factorial *= i;
         }
         System.out.println("Factorial of the given number is:: "+factorial);
      }
   }
