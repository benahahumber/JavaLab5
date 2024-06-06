import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator myFact = new FactorialCalculator();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            long numInput = sc.nextInt();
            myFact.calFac(numInput, numInput);
        } catch (Exception e) {
            System.out.println("Please enter a valid number");
        }
    }
}