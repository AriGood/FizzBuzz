public class Multiples {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i*5 < 1000; i++) {
            n++;
        }
        for (int i = 1; i*3 < 1000; i++) {
            n++;
        }
        System.out.println(n);
    }
}
