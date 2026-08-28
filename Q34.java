//Find the difference between the largest and smallest digit of a number.//

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 9;
        int n = sc.nextInt();

        while (n != 0) {

            int digit = n % 10;

            if (digit > max) {
                max = digit;
            }

            if (digit < min) {
                min = digit;
            }

            n = n / 10;
        }

        System.out.println(max-min);
    }
}