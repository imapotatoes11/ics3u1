/*
 * Copyright 2024 Kevin Wang
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
package culm_spec;

import java.io.*;
import java.util.*;

public class Bejeweled {
    // user enters this to return to main menu
    public final int MAIN_MENU_CHOICE = -1;

    // minimum size required to form a chain
    public final int CHAIN_REQ = 3;

    // number of moves to be played in one game
    public final int NUMMOVE = 10;

    // number of different piece style
    public final int NUMPIECESTYLE = 7;

    // represents a slot on the game board where the piece has disappeared
    public final int EMPTY = NUMPIECESTYLE + 1;

    // number of rows in the game board
    public final int NUMROW = 8;

    // number of columns in the game board
    public final int NUMCOL = 8;
}
