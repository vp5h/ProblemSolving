class ArmstrongNumbers {

    boolean isArmstrongNumber(int n) {

        int original = n;
        n = Math.abs(n);

        int digits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits); 
            n /= 10;
        }

        return sum == original;
    }

    private static int countDigits(int n) {
        if (n == 0) return 1;

        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

}
