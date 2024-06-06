import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator factCal = new FactorialCalculator();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            long numInput = sc.nextInt();
            factCal.calFac(numInput, numInput);
        } catch (Exception e) {
            System.out.println("Please enter an integer.");
        }
    }
}