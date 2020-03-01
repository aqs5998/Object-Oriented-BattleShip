public class Grid{
    //private static final int[][] INTS = new int[9][9];
    //static int[][] Grid = INTS;
    static int x = 10;
    static int y = 10;
    static int[][] grid = new int[x][y];

    public void showGrid() {
        for (int[] x : Grid.grid) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public void markGrid(int x, int y){
        grid[x][y] = 1;
    }

    public boolean checkPointGrid(int x, int y){
        if(grid[x][y] == NullPointerException){
            return false;
        }
        else return true;
    }

    public Grid getGrid(){
        return this.Grid;
    }
}



