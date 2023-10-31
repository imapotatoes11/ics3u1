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
 * The following program utilizes a do-while loop to count
 * from 100 to 1 by 2s.
 * */
package hw.e15;

public class Count1 {
    public static void main(String[] args) {
        // initialize the number var
        int num = 100;

        // print num and constantly subtract 2 until
        // num > 1
        do {
            System.out.println(num);
            num -= 2;
        } while (num > 1);
    }
}
