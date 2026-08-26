//Check whether the sum of all digits is even or odd.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = sc.nextInt();
        
        while(n!=0) {
            int digit = n%10;
            sum +=digit;
            n = n/10;
        }
        
        if (sum%2==0) {
            System.out.println("Even Sum");
        }
        else if (sum%2!=0) {
            System.out.println("Odd Sum");
        }
    }
}

