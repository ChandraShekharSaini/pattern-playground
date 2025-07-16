public class _Q12 {
    public static void main(String[] args) {

        Pattern(5);
    }

    public static void Pattern(int n) {

        int row = 1;
        int space = n - 1;
        int star = 1;

        while (row <= n) {

            // space
            int i = 1;
            while (i <= space) {
                System.out.print("  ");
                i++;
            }

            // star
            int j = 1;
            while (j <= star) {

                if (j % 2 == 0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }

                j++;
            }

            System.out.println();
            row++;
            space -= 1;
            star += 2;
        }
    }
}
