// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Check if a number is prime — write it as a reusable check for int n, test it with n = 29 and n = 30.
class Main {
    public static void main(String[] args) {
        int check1 = 29;
        int check2 = 30;
        int check3 = 1;
        boolean isPrimeNumber1 = isPrime(check2);
        boolean isPrimeNumber2 = isPrime(check1);
        boolean isPrimeNumber3 = isPrime(check3);
        System.out.println(isPrimeNumber1 + " " + isPrimeNumber2 + " " + isPrimeNumber3);
    }

    // in these case where no divisible array is given for any hint then our loop
    // must go from 2 to n-1 because for a prime number valid factors are 1 and the
    // number itself n and checking for n+1,... does not make any case sense cause
    // their very first divible factor will be greater. like :
    // n+1 x 1 = n+1 so it is impossible to reach n.
    public static boolean isPrime(int n) {
        if (n == 1) {
            System.out.println("1 cannot be a prime number");
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                System.out.println("Not a prime number");
                return false;
            }

        }
        System.out.println("Prime Number");
        return true;
    }
}