package scientificCalculator.mathematicalOperations;


import java.util.ArrayList;
import java.util.Scanner;

public class arithmeticOperations {
    public arithmeticOperations() {
        Scanner sc = new Scanner(System.in);
        takeChoice(sc);
    }

    private void takeChoice(Scanner sc) {
        int choice;

        while (true) {
            System.out.println("1] Addition");
            System.out.println("2] Subtraction");
            System.out.println("3] Multiplication");
            System.out.println("4] Division");
            System.out.println("5] Modulus");
            System.out.println("6] Exponentiation");
            System.out.println("7] Absolute Value");
            System.out.println("8] Square");
            System.out.println("9] Square Root");
            System.out.println("10] Cube");
            System.out.println("11] Cube Root");

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

        performOperations(choice);
    }

    private void performOperations(int choice) {
        double result = switch (choice) {
            case 1, 2, 3 -> performBasicOperations(choice);
            case 4 -> {
                double[] inputs = takeTwoInput();
                yield (inputs[0] / inputs[1]);
            }
            case 5 -> {
                double[] inputs = takeTwoInput();
                yield (inputs[0] % inputs[1]);
            }
            case 6 -> {
                double[] inputs = takeTwoInput();
                double output = 1;
                for (int i = 0; i < inputs[1]; i++) {
                    output *= inputs[0];
                }
                yield (output);
            }
            case 7 -> {
                double input = takeInput();
                yield ((input < 0) ? (-input) : input);
            }
            case 8 -> {
                double input = takeInput();
                yield (input * input);
            }
            case 9 -> {
                double input = takeInput();
                yield (input);
            }
            case 10 -> {
                double input = takeInput();
                yield (input * input * input);
            }
            case 11 -> {
                takeInput();
            }
            default -> takeInput();
        };
    }

    private double performBasicOperations(int choice) {
        ArrayList<Double> numbers = takeMultipleInput();

        @SuppressWarnings("all")
        double result = switch (choice) {
            case 1 -> {
                double sum = 0;
                for (double num : numbers) {
                    sum += num;
                    yield sum;
                }
            }
            case 2 -> {
                double sub = 0;
                for (double num : numbers) {
                    sub -= num;
                    yield sub;
                }
            }
            case 3 -> {
                double mul = 1;
                for (double num : numbers) {
                    mul *= num;
                    yield mul;
                }
            }
            default -> numbers.get(0);
        };

        return result;
    }

    private double takeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double num = sc.nextDouble();

        sc.close();
        return num;
    }

    private double[] takeTwoInput() {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        double[] inputArray = new double[2];

        System.out.println("Enter the first number: ");
        num1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the second number: ");
        num2 = sc.nextDouble();
        sc.nextLine();

        inputArray[0] = num1;
        inputArray[1] = num2;

        sc.close();
        return inputArray;
    }

    private ArrayList<Double> takeMultipleInput() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> inputs = new ArrayList<>();
        String input;
        String[] inputArray;

        while (true) {
            try {
                System.out.println("Give space seperated numbers: ");
                input = sc.nextLine();

                inputArray = input.split(" ");
                while (true) {
                    try {
                        for (String str : inputArray) {
                            double num = Double.parseDouble(str);
                            inputs.add(num);
                        }
                        break;
                    } catch (Exception e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                sc.nextLine();
            }
        }

        sc.close();
        return inputs;
    }
}
