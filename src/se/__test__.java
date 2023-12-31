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
 * Dec. 13, 2023
 * This is a testing class
 * */
package se;

import se2.CSVParser;

import java.io.IOException;
import java.util.Arrays;

public class __test__ {
    public static void main(String[] args) throws IOException {
        final String dir = System.getProperty("user.dir");
//        Kson kson = new Kson(dir + "/src/se/data/000000001.kson");
        CSVParser parser = new CSVParser(dir + "/src/se2/data.csv");
        System.out.println(parser.getLine(123457).getPin());
        System.out.println(parser.getLine(123457).getfName());
    }
}
