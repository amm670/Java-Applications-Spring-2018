// Alexandra Montgomery
// Chapter 6 Exercise 27

public class Exercise06_27 {

	 public static void main(String[ ] args) {
         int count = 1;   // create a count of 1 

         for (int i = 2; true; i++) {   // Display each number in five positions
         if (isPrime(i) && !isPalindrome(i) && isPrime(reversal(i))) {
              System.out.print(i + " ");    // prints

         if (count % 10 == 0) {   //  
              System.out.println();
         }

         if (count == 100) { // shows 100 
              break;
         }

         count++; // increase count
         }
       }
	}

    public static boolean isPrime(int num) {
    for (int i = 2; i <= num / 2; i++) {  // loop to find based on the previous number ex 16/2 works keep going 
         if (num % i == 0) {
              return false;
         }
    }

    return true;
}

/** Return the reversal of number */
static int reversal(int number) {  // reversing the number
    int result = 0; // declaring result

    while (number != 0 ) { // if the number isnt 0
         int lastDigit = number % 10;  // get the unit remainder after dividing by 10
         result = result * 10 + lastDigit;
         number = number / 10;
    }

    return result;  // returns
}

/** Return true if number is palindromuc */
static boolean isPalindrome(int number) {  
    return number == reversal(number);
}
}