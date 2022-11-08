package PrimeGenerator;
import java.util.*;

/**
 * Class for computing/generating prime numbers using Sieve OF Eratosthenes.
 * 11/07/2022
 */
public class SieveOfEratosthenesComputation
{
   /**
    * Generates a list of prime numbers
    * max = any number that check its prime
    */ 
   public static List<Integer> generatePrimes(int max) {  
       List<Integer> primes = new ArrayList<>();
       // Created a boolean array where we will check off all the composite numbers
       boolean[] isComposite = new boolean[max + 1];
       
       if(max >= 2){
           primes.add(2);
       }
       // Loop starting from 3, where it will keep on looping until it reaches the max digit
       // Skipped 2 because initially prime number cant be even number as it will be automatically composite number
       for (int i = 3; i <= max; i+=2) {
            // Checking if it is not yet composite or hasn't been marked yet, if true proceed, otherwise proceed to next digit
            if (!isComposite[i]) {
                // We are going to add the number as prime since it was not marked as composite
                primes.add(i);
                // Checking its multiples and mark it true, when it is product is greater than max
                // NOTE: It is possible that the same number can be marked true multiple times. Eg. 12 = can be marked both for 2 and 3.
                for (int j = i; i * j <= max; j++) {
                    if(!(i * j >= isComposite.length || i * j < 0)){
                     isComposite [i*j] = true;
                    }else{
                        // Upon my testing, not sure why it goes negative, so as an approach to prevent it from going negative, 
                        // i decide to break it at first encounter of 
                        break;
                    }
                }
            }
        }   
        return primes;
    }
}
