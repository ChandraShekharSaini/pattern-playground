public class _Q3 {
    public static void main(String[] args) {

        Pattern(8);
    }

    public static void Pattern(int n) {

        int row = 1;
        int star = n;

        while (row <= n) {

            int j = 1;
            while (j <= star) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            star -= 1;
            row++;
        }
    }
}
