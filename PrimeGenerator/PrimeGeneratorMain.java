package PrimeGenerator;
import PrimeGenerator.SieveOfEratosthenesComputation;
import java.io.*; 
import java.util.*; 
import java.util.concurrent.*;

public class PrimeGeneratorMain
{
    public static void main( String[] args ) throws InterruptedException
    {
 
        Scanner in = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter any number to find its prime: ");
    
        int max = in.nextInt();

        Thread soeComputation=new Thread(){  
            public void run(){  
                long startTime = System.nanoTime();
                System.out.println("Sieve Array: " + SieveOfEratosthenesComputation.generatePrimes(max));  
                long estimatedTime = System.nanoTime() - startTime;
                System.out.println("Sieve:" + (double) estimatedTime / 1_000_000_000 +  " seconds");
            }  
        };  
        Thread bfComputation=new Thread(){  
            public void run(){  
              long startTime = System.nanoTime();  
              System.out.println("Brute Force: " + BruteForceComputation.generatePrimes(max)); 
              long estimatedTime = System.nanoTime() - startTime;
              System.out.println("Brute Force:" + (double) estimatedTime / 1_000_000_000 +  " seconds");
            }  
        };  
        
        // I was about to use CompletableFuture but i think of i might not be able to use it so i did the normal procedure
        //CompletableFuture<Long> soeComputation = CompletableFuture.supplyAsync(()->SieveOfEratosthenesComputation.generatePrimes(max));
        //CompletableFuture<Long> bfComputation = CompletableFuture.supplyAsync(()->BruteForceComputation.generatePrimes(max));
    
        soeComputation.start();
        bfComputation.start();
        
        soeComputation.join();
        bfComputation.join();
    }
}
