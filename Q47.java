//Check whether all digits of a number are odd.

import java.util.Scanner;

class Main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean allOdd = true;

        while (n!=0) {

            int digit = n%10;
            if (digit % 2 == 0) {
                allOdd = false;
            }
            
            n = n/10;
        }

        if (allOdd) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
