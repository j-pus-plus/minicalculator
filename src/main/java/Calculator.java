import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;

        do {
            System.out.println("Mini calculator, Choose to perform operation");
            System.out.print("Press 1 to Square root\nPress 2 to Factorial\nPress 3 to Natural logarithm\nPress 4 to Power function\n" +
                    "press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }

            switch (choice) {
                case 1:
                    // do addition
                    double ans;
                    try {
                        System.out.print("Enter positive number : ");
                        number1 = scanner.nextDouble();


                        if(number1<0 | number1==Double.POSITIVE_INFINITY){
                            System.out.println("Only Positive Numbers and Valid Number Please!");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            break;
                        }

                    } catch (InputMismatchException error) {
                        return;
                    }
                    System.out.println("Square of " +number1+ " is : " + Math.sqrt(number1));
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    // do subtraction
                    //System.out.println("Subtraction result is : " + calculator.subtract(number1, number2));
                    break;
                case 3:
                    // do multiplication
                    //System.out.println("Multiplication result is : " + calculator.multiply(number1, number2));
                    break;
                case 4:
                    // do division
                    //System.out.println("Division result is : " + calculator.divide(number1, number2));
                    break;
                default:
                    //System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

}
