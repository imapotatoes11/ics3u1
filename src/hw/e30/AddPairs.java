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
* Nov 22, 2023
* The program does the following
* - split a given number into 2-digit pairs
* - add each 2-digit pair into a sum
* - return the sum to the user
* */
package hw.e30;

import java.util.ArrayList;
import java.util.Scanner;

public class AddPairs {
    /**
     * Turns a string into an arraylist with each value being one character
     * @param s the string to convert
     * @return converted ArrayList
     */
    private static ArrayList<String> toArrayList(String s) {
        // create an ArrayList<String> object
        ArrayList<String> arrayList = new ArrayList<>();

        // loop through length of string and add each
        // char at each index to the arraylist.
        for (int i = 0; i < s.length(); i++) {
            arrayList.add(String.valueOf(s.charAt(i)));
        }

        // return the ArrayList object
        return arrayList;
    }

    /**
     * Splice an ArrayList into pairs (except for last one if odd)<br>
     * e.g. 2,3,9,4,0,3,8,5,4 -> 23,94,03,85,4
     * @param s input ArrayList (a string passed through AddPairs.toArrayList())
     * @return spliced ArrayList
     */
    public static ArrayList<String> splice(ArrayList<String> s) {
        // create the return object
        ArrayList<String> out = new ArrayList<>();

        // keep removing elements and adding to out
        // while the original string isn't empty
        while (!s.isEmpty()) {
            // create a temporary StringBuilder
            StringBuilder tmp = new StringBuilder();

            // pop the leftmost element of the original
            // string and add to temp StringBuilder
            tmp.append(s.remove(0));

            // if the original string is not empty
            // add another character to the temporary
            // StringBuilder.
            if (!s.isEmpty()) {
                tmp.append(s.remove(0));
            }

            // build the final string and add to the return object
            out.add(tmp.toString());
        }
        // return the return object
        return out;
    }
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        String in;
        int sum = 0;
        ArrayList<String> spliced;

        // ask user for a number
        System.out.print("Enter a number: ");
        in = sc.nextLine();

        // splice number and save to `spliced`
        spliced = AddPairs.splice(AddPairs.toArrayList(in));

        // add sum
        for (String i: spliced) {
            sum += Integer.parseInt(i);
        }

        // output sum
        System.out.println(sum);
        // also print a breakdown of values
        System.out.print("(");
        for (String i: spliced) {
            if (spliced.indexOf(i) != spliced.size() - 1) {
                System.out.printf("%s+", i);
            } else {
                System.out.printf("%s", i);
            }
        }
        System.out.print(")");
    }
}
