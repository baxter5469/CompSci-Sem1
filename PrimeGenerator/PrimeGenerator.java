/**
   This class generates all prime numbers.
*/
public class PrimeGenerator
{
    private int i;

   public PrimeGenerator()
   { 
       i = 1;
   }

   /**
      Calculates the next prime number.
      @return the next prime number
   */
   public int nextPrime()
   {
        do {
            increaseValue();
            if (isPrime(i)) {
                break;
            }
        } while (isPrime(i) == false);
        return i;
   }
   /**
	 Checks to see if number is prime.
	 @return true or false
   */
   public boolean isPrime(int n)
   {
        int remainder = 0;
        for (int i = 2; i < n; i++) {
            remainder = n % i;
            if (remainder == 0) {
                return false;
            }
        }
        return true;
   }
   public void increaseValue()
   {
       i++;
   }
}
