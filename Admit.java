/*
Student Name: Tyler McCardle
Assignment #2: Admission
Assignment Description: prompt the user for information about two applicants and
compute an overall score for each applicant 
Issue Date: 02/03/2025
Due Date: 02/16/2025
Course: COSC 1336-020
Instructor: Frank Yang
*/
import java.util.*;

public class Admit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program compares two applicants to determine which one seems like the stronger applicant.");
        System.out.println("For each candidate, I will need either SAT or ACT scores plus a weighted GPA.\n");
        
        System.out.println("Information for applicant #1:");
        double score1 = totalScore(scanner);
        
        System.out.println("Information for applicant #2:");
        double score2 = totalScore(scanner);
        
        System.out.println("First applicant overall score = " + round1(score1));
        System.out.println("Second applicant overall score = " + round1(score2));
        
        compareApplicants(score1, score2);
    }
    
    //combines exam and GPA scores for total score
    public static double totalScore(Scanner scanner) {
        double examScore = getExam(scanner);
        double gpaScore = getGpaScore(scanner);
        return examScore + gpaScore;
    }
  
  // Determines whether the applicant is using SAT or ACT scores
    public static double getExam(Scanner scanner) {
        System.out.print("Do you have 1) SAT scores or 2) ACT scores? ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            return SatScore(scanner);
        } else {
            return ActScore(scanner);
        }
    }
    
    // Computes the SAT-based exam score 
    public static double SatScore(Scanner scanner) {
        System.out.print("SAT math? ");
        int math = scanner.nextInt();
        System.out.print("SAT critical reading? ");
        int reading = scanner.nextInt();
        System.out.print("SAT writing? ");
        int writing = scanner.nextInt();
        double score = (2 * math + reading + writing) / 32.0;
        System.out.println("Exam score = " + round1(score));
        return score;
    }
    // Computes the ACT-based exam score 
    public static double ActScore(Scanner scanner) {
        System.out.print("ACT english? ");
        int english = scanner.nextInt();
        System.out.print("ACT math? ");
        int math = scanner.nextInt();
        System.out.print("ACT reading? ");
        int reading = scanner.nextInt();
        System.out.print("ACT science? ");
        int science = scanner.nextInt();
        double score = (english + 2 * math + reading + science) / 1.8;
        System.out.println("Exam score = " + round1(score));
        return score;
    }
    // Computes the GPA-based score 
    public static double getGpaScore(Scanner scanner) {
        System.out.print("Overall GPA? ");
        double gpa = scanner.nextDouble();
        System.out.print("Max GPA? ");
        double maxGpa = scanner.nextDouble();
        System.out.print("Transcript Multiplier? ");
        double multiplier = scanner.nextDouble();
        double score = (gpa / maxGpa) * 100 * multiplier;
        System.out.println("GPA score = " + round1(score));
        return score;
    }
    
    // Compares the two applicants and finds if one is stronger, or if they are equal
    public static void compareApplicants(double score1, double score2) {
        if (score1 > score2) {
            System.out.println("The first applicant seems to be better.");
        } else if (score2 > score1) {
            System.out.println("The second applicant seems to be better.");
        } else {
            System.out.println("The two applicants seem to be equal.");
        }
    }
    // rounds a double to one decimal place
    public static double round1(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}