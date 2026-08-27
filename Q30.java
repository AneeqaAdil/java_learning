//Increasing Digits: Check whether digits left-to-right are strictly increasing.//

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prev = 10;
        boolean increasing = true;

        while (n != 0) {

            int digit = n % 10;

            if (digit >= prev) {
                increasing = false;
            }

            prev = digit;
            n = n / 10;
        }

        if (increasing) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
