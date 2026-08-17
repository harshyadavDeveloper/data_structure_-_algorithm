class Main {
    public static void main(String[] args) {
        factorial(7);
        // System.out.print(fact + " ");

    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        int result = n * factorial(n - 1);
        System.out.println(result);

        return result;

    }
}