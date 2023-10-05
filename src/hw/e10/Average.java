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
 * Read five integer test scores and output the average
 * */
package hw.e10;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input
        // Read five integer test scores
        int score1 = sc.nextInt();
        int score2 = sc.nextInt();
        int score3 = sc.nextInt();
        int score4 = sc.nextInt();
        int score5 = sc.nextInt();

        // Calculate average
        double average = (float) (score1 + score2 + score3 + score4 + score5) / 5; // casting + division

        // Output average to user
        System.out.println(average);
    }
}
