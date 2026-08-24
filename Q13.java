//Check whether a number is divisible by both 3 and 5.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n%3==0 && n%5==0) {
            System.out.println("Divisible");
        }
        else {
            System.out.println("oops!");
        }
    }
}
