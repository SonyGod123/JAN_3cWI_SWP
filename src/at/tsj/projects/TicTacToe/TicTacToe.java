package at.tsj.projects.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        int[][] Playground = new int [3][3];
        int Player = 0;

        Scanner scanner = new Scanner(System.in);




       while (true) {

           for (int row = 0; row < Playground.length ; row++) {
               for (int col = 0; col < Playground.length; col++) {
                   if (Playground[row][col] == 0){
                       System.out.print("| | ");
                   }
                   if (Playground[row][col] == 1){
                       System.out.print("|x| ");
                   }
                   if (Playground[row][col] == 2){
                       System.out.print("|o| ");
                   }

               }
               System.out.println();
           }
           System.out.println("Es ist gerade " + (Player%2+1) + " an der Reihe");
           System.out.println("Geben sie die Spalte an");
          int Input1 = scanner.nextInt();

           System.out.println("Geben sie die Zeile an");
           int Input2 = scanner.nextInt();

            if (Playground[Input1][Input2] == 0) {
                Playground[Input1][Input2] = Player%2+1;
                Player++;
            }   else
                System.out.println("Feld schon belegt!");

           }


       }
        
    }


