public class ExceptionHandling {
    //https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
    public class Solution {

        public static void main(String[] args) {
            try {
                Scanner input = new Scanner(System.in);
                int a, b;
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a/b);
            } catch (InputMismatchException ex) {
                System.out.println("java.util.InputMismatchException");
            } catch (ArithmeticException ex) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }
        }
    }

    //https://www.hackerrank.com/challenges/java-exception-handling/problem
    class MyCalculator {
        /*
         * Create the method long power(int, int) here.
         */
        long power(int n, int p) throws Exception {
            if(n == 0 && p == 0) {
                throw new Exception("n and p should not be zero.");
            } else if(n < 0 || p < 0) {
                throw new Exception("n or p should not be negative.");
            } else if (p == 0) {
                return 1;
            }

            int ret = n;
            for(int i = 1; i < p; i++) {
                ret*=n;
            }
            return ret;
        }

    }



}
