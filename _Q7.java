
public class _Q7 {
    public static void main(String[] args) {

        Pattern(8);
    }

    public static void Pattern(int n) {

        int i = 1;
        // row
        while (i <= n) {
            int j = 1;
            // col
            while (j <= n) {

                if (j == 1 || i == 1 || j == n || i == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                j++;
            }

            System.out.println();
            i++;
        }

    }
}
