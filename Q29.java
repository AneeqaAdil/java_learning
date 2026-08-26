//Alternating Digits: Check whether digits alternate between even and odd.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int prev = -1;
        boolean alternating = true;

        while (n != 0) {

            int digit = n % 10;

            if (prev != -1) {
                if ((digit % 2 == 0 && prev % 2 == 0) ||
                    (digit % 2 != 0 && prev % 2 != 0)) {

                    alternating = false;
                }
            }

            prev = digit;
            n = n / 10;
        }

        if (alternating) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
