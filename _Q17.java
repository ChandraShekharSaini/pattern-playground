public class _Q17 {

    public static void main(String[] args) {

        Pattern(14);
    }

    public static void Pattern(int n) {

        int mid = n / 2;
        int row = 1;
        int star1 = mid;
        int star2 = mid;
        int space = 1;

        while (row <= n) {

            // star
            int i = 1;

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

            if (row < mid + 1) {
                star1 -= 1;
                star2 -= 1;
                space += 2;
            } else {
                star1 += 1;
                star2 += 1;
                space -= 2;
            }

            System.out.println();
            row++;

        }
    }
}
