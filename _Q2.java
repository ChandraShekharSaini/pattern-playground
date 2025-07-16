public class _Q2 {

    public static void main(String[] args) {
        Pattern(5);
    }

    public static void Pattern(int n) {

        int row = 1;
        int star = 1;

        while (row <= n) {

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.err.println();
            row++;
            star++;
        }
    }
}
