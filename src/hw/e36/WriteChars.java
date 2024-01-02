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
 * - continually ask user to enter a string, until "stop" is entered
 * - write to the file "writeChars.txt" putting each character of the strings on
 *   a separate line
 *   - in the file, there should be a blank line separating each string from the
 *     next one
 * - the stop string should not be included in the output file
 * */
package hw.e36;

import java.io.*;
import java.util.*;

public class WriteChars {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        final String fileName = "writeChars.txt";

        try {
            // try to create a buffered writer object
            BufferedWriter br = new BufferedWriter(new FileWriter(fileName, false));

            // loop and write 10 user-inputted strings to the file
            while (true) {
                System.out.print("Enter a string: ");
                String input = sc.nextLine();

                if (input.equals("stop")) {
                    break;
                }

                for (int i = 0; i < input.length(); i++) {
                    br.write(input.charAt(i) + "\n");
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
