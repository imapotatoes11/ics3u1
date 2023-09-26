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
 * Sept 21, 2023
 * The following program uses printf to print float values and their squares
 */
package hw.e06;

public class OutputPrintf2 {
    public static void main(String[] args) {
        System.out.printf("%s     %s", "Number", "Square");
        float[] f = {1.1f, 1.11f, 1.12f, 1.13f, 1.14f, 1.15f};
        for (float i : f) {
            System.out.printf("%n%-10.2f %-10.2f", i, Math.pow(i, 2));
        }
    }
}
