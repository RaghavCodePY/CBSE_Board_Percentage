package CBSE_Board_Percentage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // This program calculates the percentage of marks in out of 5 subjects in CBSE boards
        // Making an instance of Scanner object
        Scanner scn = new Scanner(System.in); // reads from the keyboard
        // asking for subjects and storing them
        System.out.print("Your marks in Mathematics: ");
        float math = scn.nextFloat();

        System.out.print("Your marks in Science: ");
        float science = scn.nextFloat();

        System.out.print("Your marks in Physics: ");
        float physics = scn.nextFloat();

        System.out.print("Your marks in Chemistry: ");
        float chemistry = scn.nextFloat();

        System.out.print("Your marks in Computer Science: ");
        float computer_science = scn.nextFloat();

        float total_marks = math+physics+science+chemistry+computer_science;
        float percentage = total_marks/5;
        System.out.println("Your percentage: " + percentage + "%");
    }
}
