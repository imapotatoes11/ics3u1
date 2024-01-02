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
 * The program prints out "Alarm!" several times
 * */
package hw.e31;

public class SoundAlarm {
    /**
     * prints "Alarm!" i times to stdout
     * @param i number of times to print "Alarm!"
     * @throws IllegalArgumentException exception thrown if i is less than 1
     */
    public static void alarm(int i) throws IllegalArgumentException{
        // throw an illegal argument exception if the number
        // is less than 1
        if (i < 1) {
            throw new IllegalArgumentException("Invalid number");
        } else {
            // loop i times and print "Alarm!"
            for (int j = 0; j < i; j++) {
                // print "Alarm!"
                System.out.println("Alarm!");
            }
        }
    }
    public static void main(String[] args) {
        alarm((int) (Math.pow(2, 31) - 1));
    }
}
