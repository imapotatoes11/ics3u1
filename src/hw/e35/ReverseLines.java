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
 * Dec 27, 2023
 * The program prints all lines in a file in reverse order
 * */
package hw.e35;

import java.io.*;
import java.util.*;

    public class ReverseLines {
    public static void main(String[] args)  {
        try {
            // try and create a bufferedReader object
            BufferedReader br = new BufferedReader(new FileReader("src/hw/e35/allChar.txt"));

            // number of lines
            int numOfLines = Integer.parseInt(br.readLine());

            // arraylist to store lines
            ArrayList<String> lines = new ArrayList<>();

            // read all lines
            for (int i = 0; i < numOfLines; i++) {
                String line = br.readLine();
                lines.add(line);
            }

            // print all lines in reverse order
            for (int i = numOfLines - 1; i >= 0; i--) {
                System.out.println(lines.get(i));
            }
        } catch (IOException e) {
            System.out.println("An unexpected error occured");
        }
    }
}
