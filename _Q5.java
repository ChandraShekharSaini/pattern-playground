public class _Q5 {

    public static void main(String[] args) {

        Pattern(5);
    }

    public static void Pattern(int n) {

        int row = 1;
        int star = n;
        int space = 0;

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
                System.out.print("* ");
                j++;
            }

            System.out.println();
            row++;
            star -= 1;
            space += 1;

        }

    }
}
