/*
 * Copyright 2023 Kevin Wang
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
 * Dec 28, 2023
 * The program does the following:
 * - ask user for dimensions of a 2d array
 * - create the array and fill each element with '*'
 * - print the array as a table to the file "star.txt"
 * */
package hw.e36;

import java.io.*;
import java.util.*;

public class StarTable {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        final String fileName = "star.txt";

        try {
            // try to create a buffered writer object
            BufferedWriter br = new BufferedWriter(new FileWriter(fileName, false));

            // ask user for dimensions of the array
            System.out.print("Enter the number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter the number of columns: ");
            int cols = sc.nextInt();

            // create the array and fill each element with '*'
            char[][] arr = new char[rows][cols];
            for (int i = 0; i < rows; i++) {
                Arrays.fill(arr[i], '*');
            }

            // print the array as a table to the file "star.txt"
            for (int i = 0; i < rows; i++) {
                br.write(Arrays.toString(arr[i]) + "\n");
            }

            // dont forget to close the file
            br.close();
        } catch (IOException e) {
            // catch any errors
            System.out.println("Error: " + e);
        }
    }
}
