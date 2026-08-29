// From 1 to N, count numbers whose digit sum is greater than 10

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {

            int temp = i;
            int sum = 0;

            while (temp != 0) {

                int digit = temp % 10;
                sum += digit;
                temp = temp / 10;
            }

            if (sum > 10) {
                count++;
            }
        }

        System.out.println(count);
    }
}