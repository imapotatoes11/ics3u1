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
 * The following program demonstrates the use of the Scanner class for both string and int input
 * */
package hw.e04;

import java.util.Scanner;

public class Input_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What's your name?  ");
        String name = sc.nextLine();
        System.out.printf("How old are you?  ");
        int age = sc.nextInt();
        System.out.printf("So you are %s and you are %d", name, age);
    }
}
