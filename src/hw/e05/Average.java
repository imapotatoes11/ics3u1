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
* Sept 20, 2023
* The following program demonstrates the use of the Scanner class for double input,
 */
package hw.e05;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Number 1: ");
        double num1 = sc.nextDouble();
        System.out.printf("Number 2: ");
        double num2 = sc.nextDouble();
        System.out.printf("Number 3: ");
        double num3 = sc.nextDouble();
        System.out.println("Average: " + (num1 + num2 + num3) / 3);
    }
}
