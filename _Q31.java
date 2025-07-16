public class _Q31 {
    public static void main(String[] args) {

        Pattern(5);
    }

    public static void Pattern(int n) {

        int i = 1;
        int m = n;
        while (i <= n) {

            int j = 1;
             m = n;
            while (j <= n) {
                if (i + j == n + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(m + " ");
                }
                j++;
                m--;
            }

            System.out.println();
            i++;
           
        }

    }
}