public class FactorialCalculator {
   
    private long myInt;
    private long myRes;


    public void calFac(long myInt, long myRes) {
        this.myInt = myInt;
        this.myRes = myRes;
        if (myInt < 0) {
            System.out.println("Can not calculate factorial.");
        }
        else if (myInt == 0) {
            System.out.println("Factorial of 0 is 1");
        }
        else {
            for (int n = 1; n <= myInt; n++)
                myRes *= n;
        }
        System.out.println("The factorial of " + myInt + " is " + myRes);
    }
}

