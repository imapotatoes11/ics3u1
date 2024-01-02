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
 * The program reads each line in "line.txt" and prints to stdout
 * */
package hw.e35;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintLines {
    public static void main(String[] args){
        // initialize objects
        final String fileName = "line.txt";
        String lineIn;
        try {
            // try and open a new bufferedreader object
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            // read the first line
            lineIn = br.readLine();

            // continue reading and printing lines
            // until lineIn is null (EOF)
            while (lineIn != null) {
                System.out.println(lineIn);
                lineIn = br.readLine();
            }

            // close the file
            br.close();

        } catch (IOException e) {
            // catch any possible IOExceptions
            System.out.println("Error: " + e);
        }
    }
}
