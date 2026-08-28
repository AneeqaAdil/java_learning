// Check whether a number's digit sum is divisible by 3

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        while (n != 0) {

            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }

        if (sum % 3 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}