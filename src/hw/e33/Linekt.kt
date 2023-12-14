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
 * The program has two methods for calaculating length and slope
 * */
package hw.e33

class Linekt {
    fun length(x1: Int, y1: Int, x2: Int, y2: Int): Double {
        // create a result variable for the result to be
        // stored in (double type for decimal precision)
        val result: Double

        // use the distance formula to calculate length:
        // dt = sqrt((x1-x2)^2 + (y1-y2)^2)
        result =  Math.sqrt(
            Math.pow((x1 - x2).toDouble(), 2.0) +
            Math.pow((y1 - y2).toDouble(), 2.0)
        )

        // return result
        return result
    }
    fun slope(x1: Int, y1: Int, x2: Int, y2: Int): Double {
        // create a result variable for the result to be
        // stored in (double for decimal precision)
        val result: Double

        // use the slope formula to calculate slope:
        // (y2-y1) / (x2-x1)
        result = (y2 - y1).toDouble() /
                (x2 - x1).toDouble()

        // return result
        return result
    }
}