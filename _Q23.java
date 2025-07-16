public class _Q23 {
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

            // space
            int j = 1;
            while (j <= star) {
                System.out.print(1 + " ");
                j++;
            }

            System.out.println();
            row++;
            space -= 1;
            star += 2;
        }
    }
}
