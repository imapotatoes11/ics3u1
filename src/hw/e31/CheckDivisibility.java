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
 * Dec. 06, 2023
 * The method evenlyDivisible returns true if the first parameter can be evenly
 * divided by the second, or vice versa, and false if it can't be.
 * */
package hw.e31;

public class CheckDivisibility {
    /**
     * check if b is divisible by a, or if a is divisible by b, or neither.
     * @param a first integer
     * @param b second integer
     * @return true if one is divisible by the other
     */
    public static boolean evenlyDivisible(int a, int b) {
        // three cases:
        // case 1: a is divisible by b
        // case 2: b is divisible by a
        // case 3: a is not divisible by b, and b
        //     is also not divisible by a

        // case 1: a is divisible by b
        if (a % b == 0) {
            return true;
        }

        // case 2: b is divisible by a (condition is true)
        // case 3: neither are divisible (condition is false)
        else return b % a == 0;
    }
    public static void main(String[] args) {
        System.out.println(evenlyDivisible(4,5));
    }
}
