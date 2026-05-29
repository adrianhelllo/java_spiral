import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width: ");
        final int X = Integer.parseInt(scanner.nextLine());
        System.out.print("Height: ");
        final int Y = Integer.parseInt(scanner.nextLine());

        final int RAND_MIN = 0, RAND_MAX = 100;
        
        Matrix mat = new Matrix(X, Y, RAND_MIN, RAND_MAX);
        mat.fillMatrix(RAND_MIN, RAND_MAX);
        
        // initialise loop variables
        int bx_low = 0, bx_high = X;
        int by_low = 0, by_high = Y;

        while (bx_low != bx_high || by_low != by_high) {
            mat.snakeVertical(bx_low, by_low, by_high);
            mat.snakeHorizontal(by_high - 1, bx_low+1, bx_high);

            by_high--;
            bx_low++;

            mat.snakeVertical(bx_high-1, by_high-1, by_low-1);
            mat.snakeHorizontal(by_low, bx_high-2, bx_low-1);

            bx_high--;
            by_low++;
        }
    }
}