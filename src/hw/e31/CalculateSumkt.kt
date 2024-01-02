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
 * Dec 01, 2023
 * The program creates a sumRange method based on given instructions
 * */
package hw.e31

class CalculateSumkt {
    fun sum(i: IntRange): Int {
        // convert IntRange to a list, so it
        // can be iterated
        val lst = i.toList()
        // set sum to 0, and add to sum
        var sum = 0

        // iterate through the converted list
        // and add each element to sum
        for (j in lst) {
            sum += j
        }

        // return the sum
        return sum
    }
    fun sumRange(a: Int, b: Int): Int {
        // return 0 and print an error message to console
        // if the second number is less than the first number.
        if (b < a) {
            println("Error: 2nd number is less than 1st number")
            return 0
        } else {
            // call the sum() method with an IntRange
            // between a and b
            return sum(a..b)
        }
    }
}