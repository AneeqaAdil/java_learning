//Count numbers between 1 and N that are even and divisible by 3.//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt();

        for (int i=1; i<=N; i++) {
            if (i%2==0 && i%3==0) {
                count=count+1;
            }
        }
        System.out.println(count);
    }
}
