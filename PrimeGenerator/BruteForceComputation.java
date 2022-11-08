package PrimeGenerator;
import java.util.*;


/**
 * Write a description of class BruteForceComputation here.
 * 11/07/2022
 */
public class BruteForceComputation
{
    /**
     * Public static class for testing purposes so we doesn't need to create class instance
     */
    public static List<Integer> generatePrimes(int max) {
        // ArrayList to collect the prime numbers
        List<Integer> primes = new ArrayList<>();
        
        // Skipping 2 as we dont need even number for finding prime numbers
        if(max >=2){
            primes.add(2);
        }
        
        // Using 3 for starting iterator as mentioned above, we are skipping even numbers
        for(int i = 3; i<= max; i+=2) {
            if(isPrime(i))
                primes.add(i);
        }
    
        return primes;
    }
    
    //Implementation to find prime number
    private static boolean isPrime(int number) {
       // Iterate over the number
       for (int j = 3; j < number; j+=2) {
            if (number % j == 0) {
                return false; //not prime
            }
        }
        return true; //prime number
    }    
}
