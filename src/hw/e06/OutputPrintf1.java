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
 * Sept 21, 2023
 * The following program uses printf to print numbers
 */
package hw.e06;

public class OutputPrintf1 {
    /*
    use printf to print the following:
    Juanita's bank account balance is $2,345,678.99.
       Juan's bank account balance is $   15,455.26.
     */
    public static void main(String[] args) {
        String name1 = "Juanita";
        String name2 = "Juan";
        double balance1 = 2345678.99;
        double balance2 = 15455.26;
        System.out.printf("%s's bank account balance is $%,.2f.%n", name1, balance1);
        System.out.printf("%7s's bank account balance is $%2s%,10.2f.%n", name2, "", balance2);
    }
}
