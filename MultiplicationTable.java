import java.util.Scanner; // Import Scanner class for user input

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        
        int table[] = new int[10]; // Define an array of size 10 to store multiplication results
        
        // Loop to store multiplication table values in the array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i; // Store result in the array at index i-1
        }
        
        // Loop to print multiplication table using values from the array
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
