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
 * The following program outputs what stage of life the user is in.
 * */
package hw.e12;

import java.util.Scanner;

public class Stages {
    public static void main(String[] args) {
        // establish objects and variables
        Scanner sc = new Scanner(System.in);
        int age;

        // ask user for age
        System.out.printf("How old? ");
        age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are an adult.");
        } else if (age > 12) {
            System.out.println("You are a teenager.");
        } else if (age > 10) {
            System.out.println("You are a preteen.");
        } else if (age > 5) {
            System.out.println("You are a child.");
        } else {
            System.out.println("You are a toddler.");
        }
    }
}
