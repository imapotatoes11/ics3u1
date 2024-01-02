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
 * The following program prints a table of unicode characters 1-212
 * */
package hw.e15;

public class Unicode {
    public static void main(String[] args) {
        // initialize objects
        int current = 1;

        System.out.println("Unicode    Character");
        do {
            System.out.printf("%-11d%c\n", current, (char) current);
            current++;
        } while (current <= 212);
    }
}
