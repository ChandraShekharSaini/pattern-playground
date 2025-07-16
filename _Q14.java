public class _Q14 {

    public static void main(String[] args) {

        Pattern(5);
    }

    public static void Pattern(int n) {

        int row = 1;
        int space = n - 1;
        int star = 1;
        int mid = n;

        while (row <= 2 * n - 1) {

            // space
            int i = 1;
            while (i <= space) {
                System.err.print("  ");
                i++;
            }

            // star
            int j = 1;
            while (j <= star) {
                System.err.print("* ");
                j++;
            }

            if (row < mid) {
                space -= 1;
                star += 1;
            } else {
                space += 1;
                star -= 1;
            }

            System.out.println();
            row++;
        }
    }
}
