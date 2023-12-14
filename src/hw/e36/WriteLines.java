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
 * The program
 * */
package hw.e36;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String fileName = "writeLines.txt";

        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(fileName, false));
            for (int i = 0; i < 10; i++) {
                System.out.printf("Enter a string: ");
                br.write(sc.nextLine());
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
