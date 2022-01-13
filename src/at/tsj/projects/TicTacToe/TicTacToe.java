package at.tsj.projects.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    static int [][] Playground = new int[3][3];
    public static void main(String[] args) {
        int Player = 0;
        boolean winner = false;
        Scanner scanner = new Scanner(System.in);


        while (!winner) {

            for (int row = 0; row < Playground.length; row++) {
                for (int col = 0; col < Playground.length; col++) {
                    if (Playground[row][col] == 0) {
                        System.out.print("| | ");
                    }
                    if (Playground[row][col] == 1) {
                        System.out.print("|x| ");
                    }
                    if (Playground[row][col] == 2) {
                        System.out.print("|o| ");
                    }

                }
                System.out.println();
            }
            System.out.println("Es ist gerade " + (Player % 2 + 1) + " an der Reihe");
            System.out.println("Geben sie die Zeile an");
            int Input1 = scanner.nextInt();

            System.out.println("Geben sie die Spalte an");
            int Input2 = scanner.nextInt();

            if (Playground[Input1][Input2] == 0) {
                Playground[Input1][Input2] = Player % 2 + 1;
                Player++;
            } else
                System.out.println("Feld schon belegt!");
        }
        winner = win();
        if (win())
            System.out.println("Spieler " + Player + " hat Gewonnen!");
    }

    public static boolean win() {
        if(Playground[0][0] == Playground[0][1] && Playground[0][0] == Playground[0][2] && Playground[0][0] != 0)
            return true;
        if(Playground[1][0] == Playground[1][1] && Playground[1][0] == Playground[1][2] && Playground[1][0] != 0)
            return true;
        if(Playground[2][0] == Playground[2][1] && Playground[2][0] == Playground[2][2] && Playground[2][0] != 0)
            return true;
        if(Playground[0][0] == Playground[1][0] && Playground[0][0] == Playground[2][0] && Playground[0][0] != 0)
            return true;
        if(Playground[0][1] == Playground[1][1] && Playground[0][1] == Playground[2][1] && Playground[0][1] != 0)
            return true;
        if(Playground[0][2] == Playground[1][2] && Playground[0][2] == Playground[2][2] && Playground[0][2] != 0)
            return true;
        if(Playground[0][0] == Playground[1][1] && Playground[0][0] == Playground[2][2] && Playground[0][0] != 0)
            return true;
        if(Playground[2][0] == Playground[1][1] && Playground[2][0] == Playground[0][2] && Playground[2][0] != 0)
            return true;
        return false;


            }
       }





