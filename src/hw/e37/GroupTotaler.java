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
 * Jan 02, 2024
 * The program reads from a file named input.txt which contains a list of numbers
 * that are arranged into groups of various sizes.  The program outputs the sum of
 * the numbers in each group.  Each group starts with a one-line descriptive phrase.
 * The phrase can be anything that is not a number.  Some groups may have zero number
 * in them.
 *
 * example input.txt content:
 * Group A
 * 23
 * -12
 * 29
 * -84
 * Group B
 * Last Group
 * 12
 * -34
 *
 * example output:
 * Group A: 56
 * Group B: 0
 * Last Group: -22
 * */
package hw.e37;

import java.io.*;
import java.util.*;

public class GroupTotaler {
    public static void main(String[] args) {
        // initialize objects
        final String fileName = "input.txt";

        try {
            // try to create a buffered reader object
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line = br.readLine();

            // read the file line by line
            while ((line) != null) {
                // if the line is not a number, it is a group name
                if (!line.matches("-?\\d+")) {
                    System.out.print(line + ": ");
                    int sum = 0;

                    // loop and add all the numbers in the group
                    while ((line = br.readLine()) != null && line.matches("-?\\d+")) {
                        System.out.println(line);
                        sum += Integer.parseInt(line);
                    }

                    System.out.println(sum);
                }
            }

            // don't forget to close the file
            br.close();
        } catch (IOException e) {
            // catch any errors
            System.out.println("Error: " + e);
        }
    }
}
