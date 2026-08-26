//Find the first digit of a number.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n>=10) {
            n=n/10;
        }
        System.out.println(n);
    }
}

