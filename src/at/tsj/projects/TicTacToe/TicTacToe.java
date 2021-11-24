package at.tsj.projects.TicTacToe;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] Playground = new int [3][3];

        for (int row = 0; row < Playground.length ; row++) {
            for (int col = 0; col < Playground.length; col++) {
                System.out.print(Playground[row][col] + " ");
            }
            System.out.println();
        }
        
        
        
    }

}
