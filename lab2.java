import java.util.Scanner;

public class lab2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your marks (0-100): ");
        int marks = input.nextInt();

        String grade;
       
            if (marks >= 90) {
                grade = "A+";
            } else if (marks >= 80) {
                grade = "A";
            } else if (marks >= 70) {
                grade = "B";
            } else if (marks >= 60) {
                grade = "C";
            } else if (marks >= 50) {
                grade = "D";
            } else {
                grade = "F ";
            }

            System.out.println("You obtained grade: " + grade);
            input.close ();
        }

        
    }

