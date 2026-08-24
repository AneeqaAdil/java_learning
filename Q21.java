//Find the largest digit in a number.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max=0;
        int n = sc.nextInt();

        while (n!=0) {
            int digit = n%10;
            if (digit>max) {
                max=digit;
            }
            n=n/10;
        }
        System.out.println(max);
    }
}
