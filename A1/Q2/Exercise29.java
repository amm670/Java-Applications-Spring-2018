public class Exercise29 {  // same name as the file name
     public static void main(String[ ] args) {
          int p1 = 2;  // defining p1 as 2
          for (int p = 2; p <= 1000; p++) {  // repeat up to 1000
               if (isPrime(p)) {  // testing for p
                    if (p - p1 == 2) {
                         System.out.println("(" + p1 + ", " + p + ")"); // Print statement with formatting
                    }
                    p1 = p;  // defining p1
                    }
               }
          }
public static boolean isPrime(int num) {  
     if (num == 2) {
          return true;
     }

     for (int i = 2; i <= num / 2; i++) {  // finding the second number that is 2 over
          if (num % i == 0) {  // making sure not 0
               return false;
          }
     }

     return true;
}
}