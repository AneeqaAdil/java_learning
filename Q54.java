//From 1 to N, print numbers where (largest digit × smallest digit) = digit sum.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i, sum = 0, max = 0, min = 9;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;

                if (digit > max) max = digit;
                if (digit < min) min = digit;

                temp /= 10;
            }

            if (max * min == sum)
                System.out.println(i);
        }
    }
}