//From 1 to N, print numbers whose digit sum equals their digit product.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int temp = i;
            int sum = 0;
            int product = 1;

            while (temp !=0) {

                int digit = temp % 10;

                sum += digit;
                product *= digit;

                temp = temp/10;
            }

            if (sum == product) {
                System.out.println(i);
            }
        }
    }
}