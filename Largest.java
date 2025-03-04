import java.util.Scanner;

class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int maxDigit = 10;

        int digits[] = new int[maxDigit];
        
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        int index = 0;
        while(number>0){
            int rem = number%10;
            digits[index++] = rem;
            number/=10;
        }

        
        for(int i=0;i<index;i++){
            if(firstMax<digits[i]){
                firstMax = digits[i];
            }
        }
        for(int i=0;i<index;i++){
            if(secondMax< digits[i] && firstMax!=digits[i]){
                secondMax = digits[i];
            }
        }
        System.out.println("First Max: " + firstMax);
        System.out.println("Second Max: " + secondMax);
    }
}