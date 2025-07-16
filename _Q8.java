public class _Q8 {

    public static void main(String[] args) {

        Pattern(7);
    }

    public static void Pattern(int n) {

        int i = 1;

        while (i <= n) {

            int j = 1;
            while (j <= n) {

             
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                j++;
            }
            System.out.println();
            i++;
        }
    }
}
