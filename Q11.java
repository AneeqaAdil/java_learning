//Find the largest of three numbers using only if-else//

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();

        if (n>=m && n>=o) {
            System.out.println(n);
        }
        else if (m>=n && m>=o) {
            System.out.println(m);
        }
        else {
            System.out.println(o);
        }
    }
}
