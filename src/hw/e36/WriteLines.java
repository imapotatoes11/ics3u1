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
 * Dec. 12, 2023
 * The program writes 10 user-inputted strings to a file.
 * */
package hw.e36;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteLines {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        final String fileName = "writeLines.txt";

        try {
            // try to create a buffered writer object
            BufferedWriter br = new BufferedWriter(new FileWriter(fileName, false));

            // loop and write 10 user-inputted strings to the file
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter a string: ");
                br.write(sc.nextLine());
            }

            // dont forget to close the file
            br.close();
        } catch (IOException e) {
            // catch any errors
            System.out.println("Error: " + e);
        }
    }
}
