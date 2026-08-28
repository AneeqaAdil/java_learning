//Find the average of the digits of a number.//

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (n!=0) {

            int digit = n%10;
            sum += digit;
            count++;
            n = n/10;
        }
        
        double average = (double) sum / count;
        System.out.println(average);
    }
}
