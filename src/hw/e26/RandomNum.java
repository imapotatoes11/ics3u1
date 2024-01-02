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
* Nov 22, 2023
* The program uses the java.util.Random class to generate and print a random integer
* between 0 and 100.
* */
package hw.e26;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        // initialize objects
        Random random = new Random();

        // Use the java.util.Random.nextInt(int origin, int bound)
        // method to find a pseudorandom integer between
        // 0 and 100 (exclusive).
        System.out.println(random.nextInt(2, 100));

        // An alternative solution utilizing the java.lang.Math class
        // could also be implemented as follows:
        // System.out.println((int)(Math.floor(Math.random() * 100) + 1));
    }
}
