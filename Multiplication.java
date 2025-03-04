import java.util.Scanner; // Import Scanner class for user input

class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        
        int multiplicationResult[] = new int[4]; // Define an array to store multiplication results
        
        // Loop from 6 to 9 to compute and store the multiplication table
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i; // Store result in array
        }
        
        // Display the multiplication results
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
    }
}
