public class Main {
    public static void main(String[] args) {
        Matrix mat = new Matrix(5, 10);
        mat.fillMatrix(0, 100);
        
        mat.snakeHorizontal(1, 3, 5);
    }
}