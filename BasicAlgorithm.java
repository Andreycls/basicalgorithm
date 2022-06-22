public class BasicAlgorithm {
    public static void main(String[] args) {
        printStaircase(7);
    }

    static void printStaircase(int n) {
        if (n <= 0) {
            return;
        }
        for (int iteration = 1; iteration <= n; ++iteration) {
            for (int whitespace = 1; whitespace <= n - iteration; ++whitespace) {
                System.out.print(" ");
            }
            for (int hashtag = n - iteration + 1; hashtag <= n; ++hashtag) {
                System.out.print('#');
            }
            System.out.println();
        }
    }
}
