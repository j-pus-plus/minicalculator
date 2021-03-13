import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculator {

   public  int factorial(int n){
        if(n==1 | n==0)return 1;

        return n*factorial(n-1);
    }

   public  double square_root(double n){
        return Math.sqrt(n);
    }

    public double Natural_logarithm(double n){
       return Math.log(n);
    }
    public static void main(String[] args) {
       Calculator cal=new Calculator();
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

                    //sqrt
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
                    System.out.println("Square of " +number1+ " is : " + cal.square_root(number1));
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    // do factorial
                    int number;
                    try {
                        System.out.print("Enter number less than 20: ");
                        number = scanner.nextInt();


                        if(number<0 ){
                            System.out.println("Only Positive Numbers and Valid Number Please!");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            break;
                        }

                        if(number>20){
                            System.out.println("Numbers less-eq than 20 Please!");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            break;
                        }


                    } catch (InputMismatchException error) {
                        return;
                    }
                    System.out.println("Factorial of " +number+ " is : " + cal.factorial(number));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    break;
                case 3:
                    // Natural logarithm

                    try {
                        System.out.print("Enter positive number : ");
                        number1 = scanner.nextDouble();


                        if(number1<=0){
                            System.out.println("Only Numbers greater than 0 Allowed");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            break;
                        }
                        if(number1==Double.POSITIVE_INFINITY){
                            System.out.println("Enter Valid Positive number Please!");
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            break;
                        }

                    } catch (InputMismatchException error) {
                        return;
                    }
                    System.out.println("Natural logarithm of " +number1+ " is : " + cal.Natural_logarithm(number1));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    break;
                case 4:
                    //power
                    break;
                default:
                    //System.out.println("Exiting....");
                    return;
            }
        } while (true);
    }

}
