import java.util.Scanner; // Import Scanner class for user input

class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int numbers[] = new int[5]; // Define an array of 5 integers to store numbers

        System.out.println("Enter all 5 numbers: ");
        
        // Loop to take user input for each number
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt(); // Read user input and store in the array
        }
        
        // Loop through the array to check if numbers are positive, negative, or zero
        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i]; // Store the current number
            
            if (n > 0) { // Check if the number is positive
                if (n % 2 == 0) { // Check if positive number is even
                    System.out.println(n + " is an even number.");
                } else { // If not even, it's odd
                    System.out.println(n + " is an odd number.");
                }
            } else if (n < 0) { // Check if the number is negative
                System.out.println(n + " is a negative number.");
            } else { // If the number is zero
                System.out.println(n + " is zero.");
            }
        }
        
        // Compare the first and last elements of the array
        int firstElement = numbers[0]; // Get the first element
        int lastElement = numbers[numbers.length - 1]; // Get the last element
        
        if (firstElement == lastElement) { // Check if first and last elements are equal
            System.out.println("The first and last elements of the array are equal.");
        } else if (firstElement > lastElement) { // Check if first element is greater
            System.out.println("The first element of the array is greater than the last element.");
        } else { // If not equal or greater, then it's smaller
            System.out.println("The first element of the array is less than the last element.");
        }
    }
}
