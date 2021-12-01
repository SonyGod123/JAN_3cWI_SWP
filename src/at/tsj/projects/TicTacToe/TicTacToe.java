package at.tsj.projects.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] Playground = new int [3][3];

        Scanner scanner = new Scanner(System.in);

        for (int row = 0; row < Playground.length ; row++) {
            for (int col = 0; col < Playground.length; col++) {
                System.out.print(Playground[row][col] + " ");
            }
            System.out.println();
        }


       while (true) {
           boolean Valid = true;

           while (Valid) {
               System.out.println("Enter your choice");
               String input = scanner.next();
               String[] values = input.split(",");
           }


       }
        
    }

}
