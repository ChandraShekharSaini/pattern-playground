public class _Q16 {
    public static void main(String[] args) {

        Pattern(5);
    }

    public static void Pattern(int n) {

        int row = 1;
        int star = n;
        int space = n-1;
        int mid = n;

        while (row <= 2 * n - 1) {

            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // star
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            if (row < mid) {
                star -= 1;
                space -= 1;
            } else {
                star += 1;
                space += 1;
            }

            System.out.println();
            row++;

        }

    }
}
