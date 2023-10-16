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
 * The following program asks the user for the capital of Canada and verifies
 * if the answer is correct.
 * */
package hw.e12;

public class Capital {
    public static void main(String[] args) {
        // establish variables
        String capital;

        // ask user for capital
        System.out.printf("What is the capital of Canada? ");
        capital = System.console().readLine();

        // verify answer
        if (capital.equalsIgnoreCase("Ottawa")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
