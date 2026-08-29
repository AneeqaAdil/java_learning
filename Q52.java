// From 1 to N, count numbers whose first digit and last digit are equal

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {

            int temp = i;

            int last = temp % 10;

            while (temp >= 10) {
                temp = temp / 10;
            }

            int first = temp;

            if (first == last) {
                count++;
            }
        }

        System.out.println(count);
    }
}