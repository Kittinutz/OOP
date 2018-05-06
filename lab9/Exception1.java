import java.util.Scanner;

public class Exception1 {

  public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = 0;

        do {
              System.out.println("Enter a number between 1 and 10");    
              num = scan.nextInt();

              if (num < 1 || num > 10)
              
              System.out.println("\nIllegal value, " + num + " entered.  Please try again.");
           }  while (num < 1 || num > 10);    

              System.out.println("\nValue correctly entered! Thank you.");

      }
 }
