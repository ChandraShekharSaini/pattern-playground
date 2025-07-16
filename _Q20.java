public class _Q20 {
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
                System.out.print("  ");
                i++;
            }

            // star
            int j = 1;
            while (j <= star) {

                if (j == 1 || j == star) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

                j++;
            }

            if (row < mid) {
                space -= 1;
                star += 2;
            } else {
                space += 1;
                star -= 2;
            }

            System.out.println();
            row++;

        }
    }
}
