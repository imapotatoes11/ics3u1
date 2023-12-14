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
 * The program
 * */
package se2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVParser {
    String file;
    ArrayList<String[]> lines;
    public CSVParser(String fileName) {
        this.file = fileName;
    }

    public void update() throws IOException {
        // read data.csv and store to this.lines
        BufferedReader br = new BufferedReader(new FileReader(this.file));
        String line;
        this.lines = new ArrayList<String[]>();
        while ((line = br.readLine()) != null) {
            this.lines.add(line.split(","));
        }
    }

}
