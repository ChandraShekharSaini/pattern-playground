public class _Q1 {
    public static void main(String[] args) {

        Square(5);
    }

    public static void Square(int n) {

        int i = 0;

        while (i < n) {
            int j = 0;
            while (j < n) {
                System.out.print("* ");
                j++;
            }
            System.out.println();

            i++;
        }
    }
}