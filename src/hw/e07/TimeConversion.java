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
* Oct 02, 2023
* The following program calculates hours and minutes given minutes
* */
package hw.e07;
import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user for minutes and set hours to 0
        System.out.printf("Enter time in minutes: ");
        int minutes = sc.nextInt();
        int hours = 0;

        // calculate hours and minutes
        while (minutes > 60) {
            hours++;
            minutes -= 60;
        }

        // return the result to user
        System.out.printf("The time in hours and minutes is %d:%s", hours, minutes<10 ? "0" + Integer.toString(minutes) : Integer.toString(minutes));
    }
}
