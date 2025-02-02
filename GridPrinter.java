public class GridPrinter {
    public static void printGrid(int rows, int cols) {
        for (int r = 1; r <= rows; r++) {
            for (int c = 0; c < cols - 1; c++) {
                System.out.print(r + c * rows + ", ");
            }
            for (int c = cols - 1; c < cols; c++) {
                System.out.print(r + c * rows);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        printGrid(3, 6);
        System.out.println();
        printGrid(5, 3);
        System.out.println();
        printGrid(4, 1);
        System.out.println();
        printGrid(1, 3);
    }
}
