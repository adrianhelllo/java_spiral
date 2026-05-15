public class Matrix {
    private int width;
    private int height;
    private int[][] mat_arr = new int[height][width];

    public Matrix(int w, int h) {
        width = w;
        height = h;
    }

    public void printMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.println(mat_arr[i][j]);
            }
        }
    }   
}    