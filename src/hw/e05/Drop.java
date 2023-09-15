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
 * The following program demonstrates the use of the Scanner class for double input,
 * as well as calculating the height of an object at a given time.
 * */
package hw.e05;

import java.util.Scanner;

public class Drop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a time less than 4.5 seconds: ");
        double t = sc.nextDouble();
        double h = 100 - 4.9 * t * t;
        System.out.printf("The height of the object at %.2f seconds is %.2f meters.%n", t, h);
    }
}
