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
 * Oct 24, 2023
 * The following program counts the numbers 50..100 by 1
 * */
package hw.e14;

public class Count2 {
    public static void main(String[] args) {
        // instantiate objects
        int num = 50;

        // the loop
        while (num <= 100) {
            System.out.println(num);
            num++;
        }
    }
}
