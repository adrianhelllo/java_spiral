public class Matrix {
    private String snake_base = "\u001b[0;32m"; // green color
    private String clear = "\u001b[0m";
    private int width;
    private int height;
    private int min_rand, max_rand;
    private int[][] mat_arr;
    private int[][] states;
    private int max_digits;

    // define constructor
    public Matrix(int w, int h, int min, int max) {
        this.width = w;
        this.height = h;
        this.min_rand = min; max_rand = max;
        this.mat_arr = new int[height][width];
        this.states = new int[height][width];
        this.max_digits = Integer.toString(max_rand).length();
    }

    public void printState() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (this.states[i][j] == 1) {
                    System.out.print(snake_base);
                } else {
                    System.out.print(clear);
                }

                int cell = this.mat_arr[i][j];
                int cell_digits = Integer.toString(cell).length();
                
                System.out.print(cell);
                for (int k = 0; k <= this.max_digits - cell_digits; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(clear + "\n\n");
    }

    // fills matrix with random integer values between the min and max parameters, inclusive
    public void fillMatrix(int min, int max) {
        int rand;

        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                // define random number between min and max
                rand = (int) (Math.random() * (max - min + 1) + min); // max - min: the possible random of numbers, +1: we round downwards, +min: shift up by the minimum value
                mat_arr[i][j] = rand;
            }
        }
    }

    // Object methods for traversing matrix values
    public void snakeHorizontal(int row, int bound_from, int bound_to) { // bounds: inclusive
        int dir_step = (bound_to > bound_from ) ? 1 : -1;

        System.out.println("Horizontal: " + bound_from + " -> " + bound_to + ", Row: " + row + ", Step: " + dir_step);

        for (int i = bound_from; i != bound_to; i += dir_step) {
            this.states[row][i] = 1;
            // System.out.println("Snaking horizontally" + i + ", " + row);
            // this.printState();
        }
        this.printState();
    }

    public void snakeVertical(int col, int bound_from, int bound_to) { // bounds: inclusive
        int dir_step = (bound_to > bound_from) ? 1 : -1;

        System.out.println("Vertical: " + bound_from + " -> " + bound_to + ", Col: " + col + ", Step: " + dir_step);

        for (int i = bound_from; i != bound_to; i += dir_step) {
            this.states[i][col] = 1;
            // System.out.println("Snaking vertically " + col + ", " + i); 
            // this.printState();
        }
        this.printState();
    }
}