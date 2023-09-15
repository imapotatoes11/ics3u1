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
 * The following program demonstrates the use of the Scanner class for string input
 * */
package hw.e04;

import java.util.Scanner;

public class Input_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Plesae enter word #1:  ");
        String word1 = sc.nextLine();
        System.out.printf("Plesae enter word #2:  ");
        String word2 = sc.nextLine();
        System.out.println(word1 + "\n" + word2);
        System.out.println(word1 + "  " + word2);
    }
}
