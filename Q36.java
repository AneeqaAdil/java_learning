//Check whether the digits of a number are sorted or not.//

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int prev = 10;
        boolean sorted = true;

        while (n!=0) {

            int digit = n%10;
            
            if (digit > prev) {
                sorted = false;
            }

            prev = digit;
            n = n/10;
        }
        
        if (sorted) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
