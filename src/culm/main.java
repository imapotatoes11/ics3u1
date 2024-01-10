/*
 * Copyright 2024 Kevin Wang
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy
 * of the license at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the license is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * license for the specific language governing permissions and limitations under
 * the license.
 * */
/*
 * Jan 08, 2024
 * The program
 * */
package culm;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Board board = new Board();
        board.gravity();

        while (board.checkMatches()) {
            board.gravity();
        }

        board.score = 0;

        while (true) {
            board.pb();
            System.out.println("Score: " + board.score);

            int x1, y1, x2, y2;
            System.out.printf("One: ");
            String r1 = sc.nextLine();
            x1 = Integer.parseInt(r1.split(" ")[0]);
            y1 = Integer.parseInt(r1.split(" ")[1]);

            System.out.printf("Two: ");
            String r2 = sc.nextLine();
            x2 = Integer.parseInt(r2.split(" ")[0]);
            y2 = Integer.parseInt(r2.split(" ")[1]);

            board.swap(x1, y1, x2, y2);
            while (board.checkMatches()) {
                board.gravity();
            }
        }
    }
}

class Board {
    public int score = 0;
    public int[][] board = new int[8][8];
    public Board() {

    }
    public static int randInt(int origin, int bound) {
        Random random = new Random();
        return random.nextInt(origin, bound);
    }
    public static Object randChoice(Object[] a) {
        Random random = new Random();
        return a[random.nextInt(a.length)];
    }

    private void fillTop() {
        for (int i = 0; i < 8; i++) {
            board[0][i] = randInt(1, 8);
        }
    }
    private void clear() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; i < 8; i++) {
                board[i][j] = Piece.EMPTY;
            }
        }
    }
    public boolean checkMatches() {
        // check vertical matches first
        for (int i = 0; i < this.board.length - 3; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                if (
                        (this.board[i][j] == this.board[i + 1][j]) &&
                        (this.board[i][j] == this.board[i + 2][j]) &&
                        this.board[i][j] != Piece.EMPTY
                ) {
                    System.out.println("found vmatch, voiding");
                    this.score += 3;
                    this.board[i][j] = Piece.EMPTY;
                    this.board[i + 1][j] = Piece.EMPTY;
                    this.board[i + 2][j] = Piece.EMPTY;
                    return true;
                }
            }
        }

        // then check horizontal matches
        for (int i = 0; i < this.board.length; i++) {
            for (int j=0; j < this.board.length - 3; j++) {
                if (
                        (this.board[i][j] == this.board[i][j + 1]) &&
                        (this.board[i][j] == this.board[i][j + 2]) &&
                        this.board[i][j] != Piece.EMPTY
                ) {
                    System.out.println("found hmatch, voiding");
                    this.score += 3;
                    this.board[i][j] = Piece.EMPTY;
                    this.board[i][j + 1] = Piece.EMPTY;
                    this.board[i][j + 2] = Piece.EMPTY;
                    return true;
                }
            }
        }

        // call gravity
        this.gravity();
        return false;
    }
    public void gravity() {
        // iterate each element
        // if element is empty:
        // - look for one above and move down
        while (this.lookForGravity()) {
            for (int i = this.board.length - 2; i >= 0; i--) {
                // skip the top row
//                if (i == this.board.length - 1) continue;
                // TODO: this part broke
                if (i == 8) continue; // ????
                for (int j = 0; j < this.board[i].length; i++) {
                    if (board[i - 1][j] != Piece.EMPTY && board[i][j] == Piece.EMPTY) {
                        int temp = board[i][j];
                        board[i][j] = board[i - 1][j];
                        board[i - 1][j] = temp;
                    }
                }
            }
        }

        // check empties and fill
        if (this.checkTop()) {
            this.fillTop();
            this.gravity();
        }

        // check if its valid
        if (!this.isValid()) {
            System.out.println("config was not valid, rerolling...");
            this.clear();
            this.gravity();
        }
    }
    private boolean lookForGravity() {
        for (int i = this.board.length - 2; i >= 0; i--) {
//            if (i == this.board.length - 1) continue;
            for (int j = 0; j < this.board[i].length; j++) {
                try {
                    if (this.board[i - 1][j] != Piece.EMPTY && this.board[i][j] == Piece.EMPTY) {
                        return true;
                    }
                } catch (Exception ignored) {return false;}
            }
        }
        return false;
    }
    private boolean checkTop() {
        for (int i = 0; i < this.board[0].length; i++) {
            if (this.board[0][i] == Piece.EMPTY) {
                return true;
            }
        }
        return false;
    }
    private boolean isValid() {
        // TODO: check if the next move is possible or not
        return true;
    }

    public void swap(int x1, int y1, int x2, int y2) {
        // check empty
        if (!(this.board[x1][y1] != Piece.EMPTY && this.board[x2][y2] != Piece.EMPTY)) {
            // pieces were empty, skip and just return nothing
            return;
        }

        int temp = this.board[x1][y1];
        this.board[x1][y1] = this.board[x2][y2];
        this.board[x2][y2] = temp;

        this.gravity();
    }


    public Piece newPiece() {
        return (Piece) randChoice(new Object[] {
                Piece.C1, Piece.C2, Piece.C3, Piece.C4, Piece.C5, Piece.C6, Piece.C7
        });
    }
    public void pb() {
        System.out.println("   _0 _1 _2 _3 _4 _5 _6 _7");
        for (int[] i : board) {
            System.out.print("_" + Arrays.asList(board).indexOf(i) + " ");
            for (int j : i) {
//                System.out.println("found " + j);
                if (j == Piece.C1) {
                    System.out.print(bcolors.C1 + "C1 " + bcolors.ENDC);
                } else if (j == Piece.C2) {
                    System.out.print(bcolors.C2 + "C2 " + bcolors.ENDC);
                } else if (j == Piece.C3) {
                    System.out.print(bcolors.C3 + "C3 " + bcolors.ENDC);
                } else if (j == Piece.C4) {
                    System.out.print(bcolors.C4 + "C4 " + bcolors.ENDC);
                } else if (j == Piece.C5) {
                    System.out.print(bcolors.C5 + "C5 " + bcolors.ENDC);
                } else if (j == Piece.C6) {
                    System.out.print(bcolors.C6 + "C6 " + bcolors.ENDC);
                } else {
                    System.out.print(bcolors.C7 + "C7 " + bcolors.ENDC);
                }
            }
            System.out.println();
        }
    }
}

class bcolors {
    public static String HEADER = "\033[95m";
    public static String OKBLUE = "\033[94m";
    public static String OKGREEN = "\033[92m";
    public static String WARNING = "\033[93m";
    public static String FAIL = "\033[91m";
    public static String ENDC = "\033[0m";
    public static String BOLD = "\033[1m";
    public static String UNDERLINE = "\033[4m";

    public static String C1 = "\033[31m";
    public static String C2 = "\033[32m";
    public static String C3 = "\033[33m";
    public static String C4 = "\033[34m";
    public static String C5 = "\033[35m";
    public static String C6 = "\033[36m";
    public static String C7 = "\033[37m";

}

class Piece {
    public static int EMPTY = 0;
    public static int C1 = 1;
    public static int C2 = 2;
    public static int C3 = 3;
    public static int C4 = 4;
    public static int C5 = 5;
    public static int C6 = 6;
    public static int C7 = 7;
}