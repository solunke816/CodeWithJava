package Programs;

public class Reverse_number {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0; // 1. Must initialize rev outside the loop

        while (num != 0) { // 2. num != 0 handles negative numbers better
            int digit = num % 10; // Get last digit
            rev = rev * 10 + digit; // Build reverse number
            num /= 10; // 3. Must reassign num to update it
        }
        System.out.println(rev);
    }
}
