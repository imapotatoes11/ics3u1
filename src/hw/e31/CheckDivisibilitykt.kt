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
 * Dec 06, 2023
 * The method evenlyDivisible returns true if the first parameter can be evenly
 * divided by the second, or vice versa, and false if it can't be.
 * */
package hw.e31

class CheckDivisibilitykt {
    fun evenlyDivisible(a: Int, b: Int): Boolean {
        // split method into two cases:
        // case 1: a is divisible by b
        // case 2: b is divisible by a
        // case 3: a is not divisible by b, and b
        //     is also not divisible by a

        // case 1: a is divisible by b
        if (a % b == 0) {
            return true
        }
        // case 2: b is divisible by a
        else if (b % a == 0) {
            return true
        }

        // case 3: neither are divisible
        return false
    }
}