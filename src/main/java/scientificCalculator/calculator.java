package scientificCalculator;

import java.util.Scanner;

import scientificCalculator.mathematicalOperations.*;
import scientificCalculator.unitConversions.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Scientific Calculator");

        while (true) {
            System.out.println("1] Mathematical Operations");
            System.out.println("2] Programming");
            System.out.println("3] Date Calculation");
            System.out.println("4] Unit Conversions");

            try {
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Choice, Please try a numerical value from available options.\n");
                sc.nextLine();
                continue;
            }
            break;
        }

        switch (choice) {
            case 1 -> chooseMathematicalOperation(sc);
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
                System.out.println("1] Currency");
                System.out.println("2] Volume");
                System.out.println("3] Length");
                System.out.println("4] Weight and Mass");
                System.out.println("5] Temperature");
                System.out.println("6] Energy");
                System.out.println("7] Area");
                System.out.println("8] Speed");
                System.out.println("9] Time");
                System.out.println("10] Power");
                System.out.println("11] Data");
                System.out.println("12] Pressure");
                System.out.println("13] Angle");
            }
            default -> System.out.println("Please enter a valid choice.");
        }
        //sc.close();
    }

    private static void chooseMathematicalOperation(Scanner sc) {
        int choice;

        while (true) {
            System.out.println("1] Arithmetic");
            System.out.println("2] Algebric");
            System.out.println("3] Trignometric");
            System.out.println("4] Stastical");
            System.out.println("5] Logical");
            System.out.println("6] Logarithmic");

            try {
                System.out.println("Enter your choice: ");
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Choice, Please try a numerical value from available options.");
                sc.nextLine();
                continue;
            }
            break;
        }

        switch (choice) {
            case 1 -> new arithmeticOperations();
            case 2 -> new algebricOperations();
            case 3 -> new trignometricOperations();
            case 4 -> new stasticalOperations();
            case 5 -> new logicalOperations();
            case 6 -> new logarithmicOperations();
            default -> System.out.println("Please enter a valid choice.");
        }
    }
}
