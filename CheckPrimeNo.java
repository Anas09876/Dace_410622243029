package anas;

public class CheckPrimeNo {
	public static void main(String[] args) {
        int number = 999; // Change this number to check for different values

        boolean isPrime = checkPrime(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible by a factor, hence not prime
            }
        }
        // Number is prime
        return true; 
}
}
