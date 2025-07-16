public class _Q13 {
    public static void main(String[] args) {
        Pattern(7);
    }

    public static void Pattern(int n) {
        int row = 1;
        int star = 1;

        int mid = n;

        while (row <= 2 * n - 1) {

          
            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();

            if (row < mid) {
                star++;
            } else {
                star--;
            }

            row++;
        }
    }
}
