public class Hilfe {
    public static void main(String[] args) {

        System.out.print(" | ");

        for (int i = 1; i <= 100; i++) {
            System.out.print(i +" | ");
            if (i%10 == 0) System.out.print("\n | ");
        }

    }
}
