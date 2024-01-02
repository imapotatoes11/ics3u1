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
 * For context:
 * A class has 10 students, and each student has to write 5 tests
 * in a semester. A 2D array can be used to store the score of all tests
 * for each student like follows:
 * / 0 1 2 3 4
 * 0 90 80 70 60 50
 * 1 90 80 70 60 50
 * 2 90 80 70 60 50
 * ...
 *
 * The program will:
 * - declare and create a 2D array to store the score of 5 tests of each
 *   of 10 students
 * - read input from a text file "marks.txt" to fill the array
 * - calculate the average of the five tests for each student, and output the
 *   results to the file "result.txt"
 * - find out the student with the highest overall average, and output the
 *   student number to the file "result.txt"
 * - calculate the class average of each test and output the result to file "result.txt"
 * */
package hw.e36;

import java.io.*;
import java.util.*;

public class StudentMarks {
    public static void main(String[] args) {
        // initialize objects
        final String fileName = "marks.txt";
        final String resultFileName = "result.txt";

        try {
            // try to create a buffered writer object
            BufferedWriter br = new BufferedWriter(new FileWriter(resultFileName, false));

            // declare and create a 2D array to store the score of 5 tests of each
            // of 10 students
            int[][] arr = new int[10][5];

            // read input from a text file "marks.txt" to fill the array
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                String[] lineArr = line.split(" ");
                for (int j = 0; j < lineArr.length; j++) {
                    arr[i][j] = Integer.parseInt(lineArr[j]);
                }
                line = reader.readLine();
                i++;
            }
            reader.close();

            // calculate the average of the five tests for each student, and output the
            // results to the file "result.txt"
            for (i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
                br.write("Student " + i + " average: " + sum / arr[i].length + "\n");
            }

            // find out the student with the highest overall average, and output the
            // student number to the file "result.txt"
            int max = 0;
            int maxIndex = 0;
            for (i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
                if (sum / arr[i].length > max) {
                    max = sum / arr[i].length;
                    maxIndex = i;
                }
            }
            br.write("Student " + maxIndex + " has the highest average: " + max + "\n");

            // calculate the class average of each test and output the result to file "result.txt"
            for (i = 0; i < arr[0].length; i++) {
                int sum = 0;
                for (int j = 0; j < arr.length; j++) {
                    sum += arr[j][i];
                }
                br.write("Test " + i + " average: " + sum / arr.length + "\n");
            }

            // dont forget to close the file
            br.close();
        } catch (IOException e) {
            // catch any errors
            System.out.println("Error: " + e);
        }
    }
}
