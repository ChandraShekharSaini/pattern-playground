public class _Q22 {
    public static void main(String[] args) {

        Pattern(6);
    }

    public static void Pattern(int n) {

        int row = 1;
        int star1 = n;
        int star2 = n;
        int space = -1;

        while (row <= n) {

            // star
            int i = 1;
            if (row == 1) {
                i += 1;
            }
            while (i <= star1) {
                System.out.print("* ");
                i++;
            }

            // space
            int j = 1;
            while (j <= space) {
                System.out.print("  ");
                j++;
            }

            // star
            int k = 1;

            while (k <= star2) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
            row++;
            star1 -= 1;
            star2 -= 1;
            space += 2;

        }
    }
}
