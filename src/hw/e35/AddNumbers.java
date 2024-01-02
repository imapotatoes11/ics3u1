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
 * The program calculates the sum of numbers in a file
 * */
package hw.e35;

import java.io.*;

public class AddNumbers {
    public static void main(String[] args) {
        // initialize objects
        final String fileName = "numbers.txt";
        String lineIn;
        int sum = 0;
        try {
            // try and create a new bufferedreader object
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            // read the first line
            lineIn = br.readLine();

            // loop through lines until EOF
            while (lineIn != null) {
                sum += Integer.parseInt(lineIn);
                lineIn = br.readLine();
            }

            // close the file
            br.close();
            System.out.println(sum);
        } catch (IOException e) {
            // catch any potential IOExceptions
            System.out.println("Error: " + e);
        } catch (NumberFormatException e) {
            // catch potential NumberFormatException
            // (from Integer.parseInt())
            System.out.println("Error: " + e);
        }
    }
}
