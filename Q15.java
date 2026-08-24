//Check whether a number lies between 10 and 50.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n>=10 && n<=50) {
            System.out.println("Lies between 10 and 50");
        }
        else {
            System.out.println("Not lies between 10 and 50");
        }
    }
}
