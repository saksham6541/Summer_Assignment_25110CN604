import java.util.Scanner;

public class Q108 {
public static void main(String[] args) {    Scanner obj = new Scanner(System.in);

    System.out.println("===== MARKSHEET GENERATION SYSTEM =====");

    // Student details
    System.out.println("Enter Student Name");
    String name = obj.nextLine();

    System.out.println("Enter Roll Number");
    int roll = obj.nextInt();

    // Subject names
    String subjects[] = {
            "English",
            "Mathematics",
            "Physics",
            "Chemistry",
            "Computer Science"
    };

    // Array to store marks
    int marks[] = new int[5];

    int total = 0;
    boolean pass = true;

    // Input marks
    for (int i = 0; i < 5; i++) {

        System.out.println(
                "Enter Marks in " + subjects[i]);

        marks[i] = obj.nextInt();

        if (marks[i] < 0 || marks[i] > 100) {

            System.out.println(
                    "Invalid Marks Entered");

            obj.close();
            return;
        }

        total += marks[i];

        if (marks[i] < 33) {
            pass = false;
        }
    }

    // Percentage calculation
    double percentage = total / 5.0;

    // Grade calculation
    String grade;

    if (percentage >= 90) {
        grade = "A+";
    } else if (percentage >= 80) {
        grade = "A";
    } else if (percentage >= 70) {
        grade = "B";
    } else if (percentage >= 60) {
        grade = "C";
    } else if (percentage >= 40) {
        grade = "D";
    } else {
        grade = "F";
    }

    // Highest and lowest marks
    int highest = 0;
    int lowest = 0;

    for (int i = 1; i < 5; i++) {

        if (marks[i] > marks[highest]) {
            highest = i;
        }

        if (marks[i] < marks[lowest]) {
            lowest = i;
        }
    }

    // Marksheet
    System.out.println(
            "\n========== MARKSHEET ==========");

    System.out.println("Name : " + name);
    System.out.println("Roll Number : " + roll);

    System.out.println(
            "\nSubject Wise Marks");

    for (int i = 0; i < 5; i++) {

        System.out.println(
                subjects[i] + " : " + marks[i]);

        if (marks[i] >= 33) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }

    System.out.println(
            "\nTotal Marks : " + total + "/500");

    System.out.println(
            "Percentage : " + percentage + "%");

    System.out.println(
            "Grade : " + grade);

    if (pass) {
        System.out.println("Overall Result : PASS");
    } else {
        System.out.println("Overall Result : FAIL");
    }

    System.out.println(
            "\nHighest Scoring Subject : "
            + subjects[highest]
            + " (" + marks[highest] + ")");

    System.out.println(
            "Lowest Scoring Subject : "
            + subjects[lowest]
            + " (" + marks[lowest] + ")");

    // Remarks
    if (percentage >= 90) {
        System.out.println(
                "Remarks : Outstanding");
    } else if (percentage >= 75) {
        System.out.println(
                "Remarks : Very Good");
    } else if (percentage >= 60) {
        System.out.println(
                "Remarks : Good");
    } else if (percentage >= 40) {
        System.out.println(
                "Remarks : Average");
    } else {
        System.out.println(
                "Remarks : Needs Improvement");
    }

    obj.close();
}

}