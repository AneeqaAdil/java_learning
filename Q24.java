//Count the number of odd digits in a number.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count=0;
        int n = sc.nextInt();

        while (n!=0) {
            int digit = n%10;
            if (digit%2!=0) {
                count+=1;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
