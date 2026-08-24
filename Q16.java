//Print numbers between 1 and 100 that are divisible by both 3 and 5//

class Main {
    public static void main(String[] args) {
        
        int i=1;
        for (i=1; i<=100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println(i);
            }
        }
    }
}
