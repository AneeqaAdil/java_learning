// Check whether a given number is prime or not.

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean prime = true;

        if (n<2) {
            prime = false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
            prime = false;
            }
        }

        if (prime) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
}
