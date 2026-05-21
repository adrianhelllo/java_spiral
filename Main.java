public class Main {
    public static void main(String[] args) {
        Matrix mat = new Matrix(5, 10);
        mat.fillMatrix(0, 100);
        mat.printMatrix();

        mat.snakeHorizontal(0, 3, 4);
        mat.snakeVertical(4, 0, 10);
    }
}