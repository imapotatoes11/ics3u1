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
 * Dec 01, 2023
 * The program utilizes a method to return a
 * welcome message
 * */
package hw.e31;

public class Welcome {
    /**
     * assertion method mimicking one from org.junit.Assert.*
     * @param expected expected result
     * @param actual actual result
     */
    static void assertEquals(String expected, String actual) {
        System.out.println(expected);
        if(!expected.equals(actual)) {
            throw new AssertionError("Expected " + expected + ", but got " + actual);
        }
    }

    /**
     * assertion method mimicking one from org.junit.Assert.*
     * @param condition the condition
     */
    static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Expected true, but got false");
        }
    }

    /**
     * returns a welcome message given name and visitor number.
     * @param name name (string)
     * @param visitorNum visitor number (integer)
     * @return formatted welcome message (string)
     */
    public static String welcomeMessage(String name, int visitorNum) {
        // create and format a return object
        String out = "Welcome " + name +
                "! You are visitor number " + visitorNum + ".";
        // return object
        return out;
    }
    public static void main(String[] args) {
        // Test with valid inputs
        String result1 = welcomeMessage("Alice", 1);
        assertEquals("Welcome Alice! You are visitor number 1.", result1);

        // Test with another set of valid inputs
        String result2 = welcomeMessage("Bob", 100);
        assertEquals("Welcome Bob! You are visitor number 100.", result2);
    }
}