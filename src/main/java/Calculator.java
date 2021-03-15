import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public  int factorial(int n){
        logger.info("[FACTORIAL] - " + n);
        int ans=1;
        for(int i=1;i<=n;i++)
            ans*=i;


        logger.info("[RESULT - FACTORIAL] - " + ans);

        return ans;
    }

   public  double square_root(double n)
   {    logger.info("[SQUARE_ROOT] - " + n);
        double ans= Math.sqrt(n);
       logger.info("[RESULT - SQUARE_ROOT] - " + ans);

       return ans;

    }

    public double Natural_logarithm(double n){
        logger.info("[NATURAL_LOGARITHM] - " + n);
        double ans= Math.log(n);
        logger.info("[RESULT - NATURAL_LOGARITHM] - " + ans);

        return ans;

    }
    public double power(double a, double b){

        logger.info("[POWER] - " + a + ", " + b);
        double ans= Math.pow(a,b);
        logger.info("[RESULT - POWER] - " + ans);

        return ans;
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
                        logger.error("Invalid input, Entered input is not a number");
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
                        logger.error("Invalid input, Entered input is not a number");
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
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("Natural logarithm of " +number1+ " is : " + cal.Natural_logarithm(number1));
                    System.out.println();
                    System.out.println();
                    System.out.println();

                    break;
                case 4:
                    //power
                    try {
                        System.out.print("Enter number1 : ");
                        number1 = scanner.nextDouble();

                        System.out.print("Enter number2 : ");
                        number2 = scanner.nextDouble();



                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println(number1 +" power "+ number2 + " is : " + cal.power(number1,number2));
                    System.out.println();
                    System.out.println();
                    System.out.println();


                    break;
                default:
                    System.out.println("Exiting....");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    return;
            }
        } while (true);
    }

}
