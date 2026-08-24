//Print all numbers divisible by 5 from 1 to 100.//

class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 100; i++) {
            if(i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}