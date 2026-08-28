// Check whether even digit count is greater than odd digit count

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int even = 0;
        int odd = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

            n = n / 10;
        }

        if (even > odd) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}