package PrimeGenerator;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

/**
 * The test class BruteForceComputationTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BruteForceComputationTest
{
    private BruteForceComputation bruteForceComputation;
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        bruteForceComputation = new BruteForceComputation();
    }

    @Test
    public void testComputationUsing20(){
        
        List<Integer> actualPrimeNumbers = bruteForceComputation.generatePrimes(20);
        List<Integer> expectedPrimeNumbers = new ArrayList<Integer>();
        expectedPrimeNumbers.add(2);
        expectedPrimeNumbers.add(3);
        expectedPrimeNumbers.add(5);
        expectedPrimeNumbers.add(7);
        expectedPrimeNumbers.add(11);
        expectedPrimeNumbers.add(13);
        expectedPrimeNumbers.add(17);
        expectedPrimeNumbers.add(19);
        
        assertEquals (expectedPrimeNumbers, actualPrimeNumbers);
    }
    
    @Test
    public void testComputationUsing10(){
        
        List<Integer> actualPrimeNumbers = bruteForceComputation.generatePrimes(10);
        List<Integer> expectedPrimeNumbers = new ArrayList<Integer>();
        expectedPrimeNumbers.add(2);
        expectedPrimeNumbers.add(3);
        expectedPrimeNumbers.add(5);
        expectedPrimeNumbers.add(7);
        
        assertEquals (expectedPrimeNumbers, actualPrimeNumbers);
    }
    
    @Test
    public void testComputationUsing10NotEquals(){
        
        List<Integer> actualPrimeNumbers = bruteForceComputation.generatePrimes(10);
        List<Integer> expectedPrimeNumbers = new ArrayList<Integer>();
        expectedPrimeNumbers.add(2);
        expectedPrimeNumbers.add(3);
        
        assertNotEquals (expectedPrimeNumbers, actualPrimeNumbers);
    }
}
