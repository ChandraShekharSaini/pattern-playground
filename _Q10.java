public class _Q10 {
    public static void main(String[] args) {

        Pattern(7);
    }

    public static void Pattern(int n) {

        int row = 1;
        int space = 0;
        int star = (2 * n) - 1;

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
            space += 1;
            star -= 2;
         
        }
    }
}
