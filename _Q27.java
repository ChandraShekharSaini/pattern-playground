public class _Q27 {
    public static void main(String[] args) {

        Pattern(9);
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
            int mid = (star / 2) + 1;
            int  val = 1;

            while (j <= star) {

                if (j < mid) {
                    System.out.print(val + " ");
                    val++;

                }

                else {
                    System.out.print(val + " ");
                    val--;
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
