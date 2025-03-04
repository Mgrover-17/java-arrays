import java.util.Scanner;

class LargestSecond{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int digits[] = new int[maxDigit];
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int index = 0; 
        
        while (number > 0) {
            int rem = number % 10;
            
            // Resize array if needed
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            
            digits[index++] = rem;
            number /= 10;
        }

        // Find the First largest digit
        for (int i = 0; i < index; i++) {
            if (firstMax < digits[i]) {
                firstMax = digits[i];
            }
        }
        
        // Find the second largest digit
        for (int i = 0; i < index; i++) {
            if (secondMax < digits[i] && firstMax != digits[i]) {
                secondMax = digits[i];
            }
        }
        
        System.out.println("First Max: " + firstMax);
        System.out.println("Second Max: " + (secondMax == Integer.MIN_VALUE ? "None" : secondMax));
    }
}