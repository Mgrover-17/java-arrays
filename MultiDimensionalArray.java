import java.util.Scanner; // Import Scanner class for user input

class MultiDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        // Create a 2D array
        int matrix[][] = new int[rows][columns];

        // Input values into the 2D array
        System.out.println("Enter elements of the 2D matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array with size equal to rows * columns
        int arr[] = new int[rows * columns];

        // Copy elements from 2D array to 1D array row-wise
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[index++] = matrix[i][j]; // Store matrix elements in 1D array
            }
        }

        // Display the 1D array
        System.out.println("\nThe 1D array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
