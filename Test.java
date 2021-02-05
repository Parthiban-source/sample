import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int i;
        int j;
        boolean continueLoop=true;
        Scanner input = new Scanner(System.in);
        do {
            try{
                System.out.println("Enter numerator");
                i = input.nextInt();
                System.out.println("Enter denominator");
                j = input.nextInt();
                int result = divisor(i, j);
                System.out.printf("%d / %d = %d", i, j, result);
                continueLoop=false;
            } catch (ArithmeticException e) {
                System.err.println("Input must greater than zero");
                input.nextLine();
                System.out.println("Try again please");
            }
            catch (InputMismatchException e){
                System.err.println("Input must be an integer");
                input.nextLine();
                System.out.println("Try again please");
            }
        }while (continueLoop);
    }
    static int divisor(int i,int j) throws ArithmeticException
    {
        return i/j;
    }
}
