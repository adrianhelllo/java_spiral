public class Matrix {
    private int width;
    private int height;
    private int[][] mat_arr;

    // define constructor
    public Matrix(int w, int h) {
        width = w;
        height = h;
        mat_arr = new int[height][width];
        states = new int[height][width];
    }

    // define class method for printing the matrix object
    public void printMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(mat_arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n\n");
    }

    public void printState(int new_i, int new_j) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(mat_arr[i][j] + " ");
            }
            System.out.println()
        }
        
    }

    // fills matrix with random integer values between the min and max parameters, inclusive
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

    // Object methods for traversing matrix values
    public void snakeHorizontal(int row, int bound_from, int bound_to) { // bounds: inclusive, exclusive
        int dir_step = (bound_to > bound_from ) ? 1 : -1;
        for (int i = bound_from; i != bound_to; i += dir_step) {
            System.out.print(mat_arr[row][i] + " ");
        }
    }

    public void snakeVertical(int col, int bound_from, int bound_to) {
        int dir_step = (bound_to > bound_from) ? 1 : -1;
        for (int i = bound_from; i != bound_to; i += dir_step) {
            System.out.println(mat_arr[i][col]);
        }
    }
}    