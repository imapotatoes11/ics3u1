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
 * Oct 25, 2023
 * The following program prints out a chart of all squares
 * and cubes of natural numbers from 5 to 40 (inclusive).
 * */
package hw.e17;

public class Chart {
    public static void main(String[] args) {
        // print the header
        System.out.println("Number\tSquare\tCube");

        // print the chart
        for (int i = 5; i <= 40; i++) {
            System.out.println(i + "\t\t" + i * i + "\t\t" + i * i * i);
        }
    }
}
