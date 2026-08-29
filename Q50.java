//Find the largest odd digit in a number

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largestOdd = -1;

        while (n != 0) {

            int digit = n%10;
            if (digit %2 != 0 && digit > largestOdd) {
                largestOdd = digit;
            }

            n = n/10;
        }

        System.out.println(largestOdd);
    }
}
