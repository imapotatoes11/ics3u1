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
 * Dec. 13, 2023
 * The program prints every character in allChar.txt
 * */
package hw.e35;

import java.io.*;
import java.util.*;

public class PrintAllChar {
    public static void main(String[] args) {
        try {
            // try to create a bufferedreader object
            BufferedReader br = new BufferedReader(new FileReader("allChar.txt"));

            // read the first line
            String line = br.readLine();

            // while the line is not null
            while (line != null) {
                // print each character one at a time (ignore \n or \r)
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) != '\n' && line.charAt(i) != '\r') {
                        System.out.print(line.charAt(i));
                    }
                }

                // read the next line
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("An unexpected error occured");
        }
    }
}
