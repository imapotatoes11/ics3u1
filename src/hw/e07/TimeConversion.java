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
 * Sept 27, 2023
 * The following program converts minutes to hours and minutes
 */
package hw.e07;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time in minutes: ");
        int minutes = sc.nextInt();
        System.out.println("The time in hours and minutes is " + Math.floorDiv(minutes, 60) + ":" +
                (
                        (Integer.toString(minutes % 60).length() < 2) ?
                        "0" + Integer.toString(minutes % 60) :
                        Integer.toString(minutes % 60)
                )
        );
    }
}
