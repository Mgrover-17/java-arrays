import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            int arrOdd[] = new int[number / 2 + 1]; // Array to store odd numbers
            int arrEven[] = new int[number / 2 + 1]; // Array to store even numbers
            int oddIndex = 0, evenIndex = 0;
            
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    arrEven[evenIndex++] = i; // Store even numbers
                } else {
                    arrOdd[oddIndex++] = i; // Store odd numbers
                }
            }
            
            // Print even numbers
            System.out.print("Even numbers: ");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(arrEven[i] + " ");
            }
            System.out.println();
            
            // Print odd numbers
            System.out.print("Odd numbers: ");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(arrOdd[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Please enter a positive number.");
			System.exit(1);
        }
    }
}
