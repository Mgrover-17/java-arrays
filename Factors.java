import java.util.Scanner;

class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();
        
        int maxFactor = 10; // Initial size of the factors array
        int factorsArr[] = new int[maxFactor]; // Array to store factors
        int index = 0; // Index to keep track of stored factors
        
        // Loop to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxFactor) { // If array is full, resize it
                    maxFactor *= 2;
                    int temp[] = new int[maxFactor];
                    System.arraycopy(factorsArr, 0, temp, 0, factorsArr.length);
                    factorsArr = temp;
                }
                factorsArr[index++] = i;
            }
        }
        
        // Display the factors
        System.out.print("Factors of " + number + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factorsArr[i] + " ");
        }
    }
}
