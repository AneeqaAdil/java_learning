// Check whether all digits of a number are even

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean allEven = true;

        while (n != 0) {

            int digit = n % 10;

            if (digit % 2 != 0) {
                allEven = false;
            }

            n = n / 10;
        }

        if (allEven) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}