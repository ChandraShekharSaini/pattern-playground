public class _Q30 {
    public static void main(String[] args) {

        Pattern(5);
    }

    public static void Pattern(int n) {

        int i = 1;
        int m = n;
        while (i <= n) {

            int j = 1;
            while (j <= n) {
                System.out.print(m + " ");
                j++;
                m--;
            }

            System.out.println();
            i++;
            m = n;
        }

    }
}