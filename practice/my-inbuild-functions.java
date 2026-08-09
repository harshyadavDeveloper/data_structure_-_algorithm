class Main {
    public static void main(String[] args) {
        boolean isPattern = contains("cat", "at");
        System.out.println(isPattern);

    }

    public static boolean contains(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (m == 0)
            return true;

        if (m > n)
            return false;
        int max = n = m;

        for (int i = 0; i <= max; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                return true;
            }
        }
        return false;

    }
}