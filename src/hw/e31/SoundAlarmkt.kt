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
package hw.e31

class SoundAlarmkt {
    fun alarm(i: Int) {
        if (i < 1) {
            throw IllegalArgumentException("Invalid number")
        } else {
            for (j in 1..i) {
                println("Alarm!")
            }
        }
    }
    fun main(args: Array<String>) {
        alarm(10)
    }
}