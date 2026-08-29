//Find the second smallest digit in a number.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int smallest = 10;
        int secondSmallest = 10;

        while (n != 0) {

            int digit = n % 10;

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }

            n = n / 10;
        }

        System.out.println(secondSmallest);
    }
}
