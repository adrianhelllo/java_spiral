public class Matrix {
    private int width;
    private int height;
    private int[][] mat_arr;

    // define constructor
    public Matrix(int w, int h) {
        width = w;
        height = h;
        mat_arr = new int[height][width];
    }

    // define class method for printing the matrix object
    public void printMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(mat_arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillMatrix(int min, int max) {
        int rand;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // define random number between min and max
                rand = (int) (Math.random() * (max - min + 1) + min); // max - min: the possible random of numbers, +1: we round downwards, +min: shift up by the minimum value
                mat_arr[i][j] = rand;
            }
        }
    }

    public void snakeHorizontal(int row, int bound_low, int bound_high) { // bounds: inclusive, exclusive
        for (int i = bound_low; i < bound_high; i++) {
            System.out.println(mat_arr[row][i]);
        }
    }

    public void snakeVertical(int col, int bound_low, int bound_high) {
        for (int i = bound_low; i < bound_high; i++) {
            System.out.println(mat_arr[i][col]);
        }
    }
}    