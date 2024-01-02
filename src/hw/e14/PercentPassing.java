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
 * Oct 24, 2023
 * The following program determines the percentage of grades that are above 70.
 * */
package hw.e14;

import java.util.Scanner;

public class PercentPassing {
    public static void main(String[] args) {
        //instantiate objects
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int above70 = 0;
        int score;

        // ask user for score
        System.out.print("Enter score: ");
        score = sc.nextInt();

        // loop exits for invalid score
        while (score >= 0) {
            // if the score > 70, add 1 to above70
            if (score > 70) {
                above70++;
            }
            // increase total count
            total++;

            // calculate percentage of scores greater than 70 and return to user
            System.out.println(String.format("%,.2f", (double) above70 / total * 100) + "% of scores are greater than 70.");

            // ask user for score
            System.out.print("Enter score: ");
            score = sc.nextInt();
        }
    }
}
