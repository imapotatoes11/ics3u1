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
package se;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Kson {
    public String file;
    private Logger logger;
    private ArrayList<String> raw = new ArrayList<>();
    private ArrayList<HashMap<String, String>> formatted = new ArrayList<>();

    public Kson(String file) {
        logger = new Logger();
        this.file = file;

        this.read();
    }

    public void read() {
        try {
            String lineIn;
            BufferedReader reader = new BufferedReader(new FileReader(this.file));

            lineIn = reader.readLine();

            while (lineIn != null) {
                raw.add(lineIn);
                lineIn = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            throw new KsonError("An unexpected error has occurred", e);
        }
    }

    public void parse() {

    }
    public static String[] parseLine(String line) {
        Logger log = new Logger();
        // parse a "key": "value" OR
        // "key/key": "value"
        String key, value;

        // strip the string first??
        line = line.strip();

        int keyQuote1 = -1;
        int keyQuote2 = -1;

        int valQuote1 = -1;
        int valQuote2 = -1;

        boolean isEscaped = false;

        // look for quotes
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '"') {
                // check if each quote is initialized or not, and add to each part
                // also backslashes / or just remove ability to put " as a value/key

                if (i > 0) {
                    if (line.charAt(i - 1) == '\\') {
                        //TODO: remove the remaining \ (unless its also escaped??)
                        isEscaped = true;
                    }
                }

                // if quote was escaped ignore and keep going, otherwise check for indexes
                if (!isEscaped) {
                    if (keyQuote1 == -1) keyQuote1 = i;
                    else if (keyQuote2 == -1) keyQuote2 = i;
                    else if (valQuote1 == -1) valQuote1 = i;
                    else if (valQuote2 == -1) valQuote2 = i;
                } else {
                    isEscaped = false;
                }
            }
        }

        log.info("" + keyQuote1 + keyQuote2 + valQuote1 + valQuote2);
//        return "" + keyQuote1 + keyQuote2 + valQuote1 + valQuote2;
        return new String[] {line.substring(keyQuote1, keyQuote2 + 1), line.substring(valQuote1, valQuote2)};
    }
}


class KsonError extends RuntimeException {
    public KsonError(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
    public KsonError(Throwable err) {
        super(err);
    }
}
class KsonQuoteMismatchError extends RuntimeException {
    public KsonQuoteMismatchError(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
    public KsonQuoteMismatchError(Throwable err) {
        super(err);
    }
}