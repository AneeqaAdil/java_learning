//Find the last digit of a number.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int last_digit = n%10;
        System.out.println(last_digit);
    }
}

