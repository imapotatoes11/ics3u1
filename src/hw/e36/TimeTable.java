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
 * The program outputs a 12x12 times table to "timetable.txt"
 * with each row and column labeled with the corresponding number.
 * Each element is also separated by a tab.
 * */
package hw.e36;

import java.io.*;
import java.util.*;

public class TimeTable {
    public static void main(String[] args) {
        // initialize objects
        final String fileName = "timetable.txt";

        try {
            // try to create a buffered writer object
            BufferedWriter br = new BufferedWriter(new FileWriter(fileName, false));

            // print the times table to the file
            for (int i = 1; i <= 12; i++) {
                for (int j = 1; j <= 12; j++) {
                    br.write(i * j + "\t");
                }
                br.write("\n");
            }

            // dont forget to close the file
            br.close();
        } catch (IOException e) {
            // catch any errors
            System.out.println("Error: " + e);
        }
    }
}
