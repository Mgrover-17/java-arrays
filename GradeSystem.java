import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();

        // Arrays to store subject marks, percentage, and grades
        double physics[] = new double[students];
        double chemistry[] = new double[students];
        double maths[] = new double[students];
        double percentage[] = new double[students];
        String grades[] = new String[students];

        // Loop to collect marks for each student
        for (int i = 0; i < students; i++) {
            System.out.print("Marks in Physics of student " + (i + 1) + ": ");
            int physicsMarks = sc.nextInt();
            
            // Validate physics marks
            if (physicsMarks < 0) {
                System.out.println("Marks cannot be negative, enter the marks again.");
                i = i - 1;
            } else {
                physics[i] = physicsMarks;

                System.out.print("Marks in Chemistry of student " + (i + 1) + ": ");
                int chemistryMarks = sc.nextInt();
                
                // Validate chemistry marks
                if (chemistryMarks < 0) {
                    System.out.println("Marks cannot be negative, enter the marks again.");
                    i = i - 1;
                } else {
                    chemistry[i] = chemistryMarks;

                    System.out.print("Marks in Maths of student " + (i + 1) + ": ");
                    int mathsMarks = sc.nextInt();
                    
                    // Validate maths marks
                    if (mathsMarks < 0) {
                        System.out.println("Marks cannot be negative, enter the marks again.");
                        i = i - 1;
                    } else {
                        maths[i] = mathsMarks;

                        // Calculate total percentage
                        double totalMarksScored = physicsMarks + chemistryMarks + mathsMarks;
                        double percent = (totalMarksScored * 100) / 300;
                        percentage[i] = percent;
                    }
                }
            }
        }

        // Determine grades based on percentage
        for (int i = 0; i < students; i++) {
            if (percentage[i] >= 80) {
                grades[i] = "Level 4, above agency-normalized standards";
            } else if (percentage[i] >= 70) {
                grades[i] = "Level 3, at agency-normalized standards";
            } else if (percentage[i] >= 60) {
                grades[i] = "Level 2, below, but approaching agency-normalized standards";
            } else if (percentage[i] >= 50) {
                grades[i] = "Level 1, well below agency-normalized standards";
            } else if (percentage[i] >= 40) {
                grades[i] = "Level 1, too below agency-normalized standards";
            } else {
                grades[i] = "Remedial standards";
            }
        }

        // Display the percentage and grade for each student
        for (int i = 0; i < students; i++) {
            System.out.println("Percentage of student " + (i + 1) + " is: " + percentage[i] + "% having grade: " + grades[i]);
        }
    }
}


