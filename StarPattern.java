import java.util.Scanner;

public class StarPattern {
    // Method to print n x n stars
    public static void printStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println(); // new line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); // number of times to run
        for (int i = 0; i < n1; i++) {
            int n2 = sc.nextInt(); // size of star pattern
            printStars(n2);
        }
        sc.close();
    }
}
