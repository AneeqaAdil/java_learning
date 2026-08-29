// From 1 to N, count numbers whose first digit is greater than their last digit.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int last = temp % 10;

            while (temp >= 10)
                temp /= 10;

            if (temp > last)
                count++;
        }

        System.out.println(count);
    }
}
