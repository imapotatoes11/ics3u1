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
 * Oct 27, 2023
 * The following program prints out a triangle of numbers.
 * */
package hw.e19;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%d", j + 1);
            }
            // skip printing a new line for the
            // first iteration, since i=0, so
            // no numbers will be printed.
            if (!(i == 0))
                System.out.println();
        }
    }
}
