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
 * The following program tells the user how warm or cool given a temperature.
 * */
package hw.e11a;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        //initialize variables and objects
        Scanner sc = new Scanner(System.in);
        double temperature;

        // ask user for temperature
        System.out.printf("Enter the temperature: ");
        temperature = sc.nextDouble();

        if (temperature < -18) {
            System.out.println("very cold");
        } else if (temperature < 0) {
            System.out.println("cold");
        } else if (temperature == 0) {
            System.out.println("freezing point of water");
        } else if (temperature <= 10) {
            System.out.println("very cool");
        } else if (temperature <= 20) {
            System.out.println("moderate");
        } else if (temperature <= 30) {
            System.out.println("warm");
        } else if (temperature <= 40) {
            System.out.println("hot");
        } else if (temperature <= 100) {
            System.out.println("extremely hot");
        } else {
            System.out.println("boiling point of water");
        }
    }
}
