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
 * Oct 13, 2023
 * The following program converts a number date into a full date.
 * */
package hw.e13;

import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        int month, day, year;
        String outMonth;

        // input date
        year = sc.nextInt();
        month = sc.nextInt();
        day = sc.nextInt();

        // output date

        // this is here in case you want to see the solution with a switch case
//        switch (month) {
//            case 1 -> outMonth = "January";
//            case 2 -> outMonth = "February";
//            case 3 -> outMonth = "March";
//            case 4 -> outMonth = "April";
//            case 5 -> outMonth = "May";
//            case 6 -> outMonth = "June";
//            case 7 -> outMonth = "July";
//            case 8 -> outMonth = "August";
//            case 9 -> outMonth = "September";
//            case 10 -> outMonth = "October";
//            case 11 -> outMonth = "November";
//            case 12 -> outMonth = "December";
//        }
        outMonth = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September",
                                "October", "November", "December"} [month - 1];

        System.out.printf("%s %d, %d", outMonth, day, year);
    }
}
