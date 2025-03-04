import java.util.Scanner; // Import Scanner class for user input

class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        double arr[] = new double[10]; 
        double total = 0.0; // Initialize total sum variable to 0.0
        int index = 0; // Initialize index variable to track array position
        
        System.out.println("Enter numbers (maximum 10, stop with 0 or negative number):");
        
        // Infinite while loop to take user input
        while (true) {
            double num = sc.nextDouble(); 
            
            if (num <= 0 || index == 10) { // Stop taking input if 0, negative number, or array limit reached
                break;
            }
            
            arr[index] = num; // Store the number in the array
            index++; // Increment index to track next position
        }
        
        // Loop to calculate the total sum of stored numbers
        for (int i = 0; i < index; i++) {
            total += arr[i]; // Add each element to the total sum
        }
        
        // Display the total sum
        System.out.println("Total sum of numbers: " + total);
    }
}
