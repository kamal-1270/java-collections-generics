package exception_handling.throws_throw;

public class InterestCalculator {
    // Method to calculate interest with exception handling
    static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
       if (amount < 0 || rate < 0) {
           throw new IllegalArgumentException("Invalid input: Amount and rate must be positive");
       }
       return (amount * rate * years) / 100;
   }

   public static void main(String[] args) {
       try {
           double interest = calculateInterest(1000, -5, 2); // Invalid input
           System.out.println("Interest: " + interest);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
   }
}