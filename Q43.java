// Print all prime numbers in a given range

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {

            boolean prime = true;

            if (n < 2) {
                prime = false;
            }

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    prime = false;
                }
            }

            if (prime) {
                System.out.println(n);
            }
        }
    }
}