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
* The following program calculates total slept hours and days alive,
* given a birthdate and today's date.
 */
package hw.e05;

import java.util.Scanner;

public class Alive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your birthdate:%n");
        System.out.printf("Year: ");
        int birthYear = sc.nextInt();
        System.out.printf("Month: ");
        int birthMonth = sc.nextInt();
        System.out.printf("Day: ");
        int birthDay = sc.nextInt();
        System.out.printf("Enter today's date:%n");
        System.out.printf("Year: ");
        int todayYear = sc.nextInt();
        System.out.printf("Month: ");
        int todayMonth = sc.nextInt();
        System.out.printf("Day: ");
        int todayDay = sc.nextInt();
        int daysAlive = (todayYear - birthYear) * 365 + (todayMonth - birthMonth) * 30 + (todayDay - birthDay);
        int hoursSlept = daysAlive * 8;
        System.out.printf("You have been alive for %d days.%n", daysAlive);
        System.out.printf("You have slept %d hours.%n", hoursSlept);
    }
}
