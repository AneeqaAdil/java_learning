//Find the sum of digits of a number..//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = sc.nextInt();

        while (n!=0) {
            int digit = n%10;
            sum = sum+digit;
            n = n/10;
        }
        System.out.println(sum);
    }
}
