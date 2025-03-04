import java.util.Scanner;  // Import Scanner class for user input

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");  
        int number = sc.nextInt();  

        int maxDigit = 10;  

        int digits[] = new int[maxDigit];  // Array to store the digits of the number

        int index = 0;  // Index to track position in the array
        while(number > 0) {  // Loop until all digits are extracted
            int rem = number % 10;  // Get the last digit of the number
            digits[index++] = rem;  // Store the digit in the array and increment index
            number /= 10;  // Remove the last digit from the number
        }

        // Print the digits in reverse order
		System.out.print("Reversed number is: ");
        for(int i = 0; i < index; i++) {
            System.out.print(digits[i]);  // Print each digit
        }
    }
}
