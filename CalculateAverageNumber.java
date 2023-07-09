package anas;

public class CalculateAverageNumber {public static void main(String[] args) {
	// Example array of numbers
    int[] numbers = {1,2,6,24,10,70,5}; 
    double average = calculateAverage(numbers);
    System.out.println("Average: " + average);
}

public static double calculateAverage(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
        sum += number;
    }
    return (double) sum / numbers.length;
}
}

