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
* The following program calculates how many 100w light bulbs a given mass
* in kg can power
* */
package hw.e07;
import java.util.Scanner;

public class Energy {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a mass in kilograms
        System.out.print("Enter a mass in kilograms: ");
        double mass = scanner.nextDouble();

        // Calculate the energy in Joules
        double energy = mass * (3.0 * 100000000) * (3.0 * 100000000);

        // Calculate the number of 100-watt light bulbs that could be powered for an hour
        double numLightBulbs = energy / 360000;

        // Display the results to the user
        System.out.println("The energy released by the complete conversion of " + mass + " kilograms of matter is " + energy + " Joules.");
        System.out.println("This is enough to power " + numLightBulbs + " 100-watt light bulbs for an hour.");
    }
}