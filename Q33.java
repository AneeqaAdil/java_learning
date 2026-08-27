// Count occurrences of a given digit in a number

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        int n = sc.nextInt();
        int target = sc.nextInt();

        while (n != 0) {

            int digit = n % 10;

            if (digit == target) {
                count++;
            }

            n = n / 10;
        }

        System.out.println(count);
    }
}