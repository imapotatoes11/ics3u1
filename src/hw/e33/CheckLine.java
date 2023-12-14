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
 * Dec. 08, 2023
 * The program implements a semi-frontend (CLI) for Line.java
 * */
package hw.e33;

import java.util.Scanner;

public class CheckLine {
    public static void main(String[] args) {
        // initialize objects
        Scanner sc = new Scanner(System.in);
        // store coordinates in array for easier access
        //          x1,y1,x2,y2
        int[] l1 = {0, 0, 0, 0};
        int[] l2 = {0, 0, 0, 0};
        // slope 1, 2
        double slope1, slope2;
        // distance 1, 2
        double dist1, dist2;

        // ask for line 1 coordinates
        System.out.println("Please enter the two coordinates of line 1: ");
        System.out.print("Vertex 1 x-value: ");
        l1[0] = sc.nextInt();
        System.out.print("Vertex 1 y-value: ");
        l1[1] = sc.nextInt();

        System.out.print("\nVertex 2 x-value: ");
        l1[2] = sc.nextInt();
        System.out.print("Vertex 2 y-value: ");
        l1[3] = sc.nextInt();


        // ask for line 2 coordinates
        System.out.println("\nPlease enter the two coordinates of line 2: ");
        System.out.print("Vertex 1 x-value: ");
        l2[0] = sc.nextInt();
        System.out.print("Vertex 1 y-value: ");
        l2[1] = sc.nextInt();

        System.out.print("\nVertex 2 x-value: ");
        l2[2] = sc.nextInt();
        System.out.print("Vertex 2 y-value: ");
        l2[3] = sc.nextInt();

        // find the slopes and distances
        slope1 = Line.slope(l1[0], l1[1], l1[2], l1[3]);
        slope2 = Line.slope(l2[0], l2[1], l2[2], l2[3]);

        dist1 = Line.length(l1[0], l1[1], l1[2], l1[3]);
        dist2 = Line.length(l2[0], l2[1], l2[2], l2[3]);

        System.out.println("\nResults: ");

        // length conditions
        if (dist1 == dist2) {
            System.out.println("The two lines have the same length");
        } else {
            System.out.println("The two lines do not have the same length");
        }

        // slope conditions
        if (slope1 == slope2) {
            System.out.println("The two lines are parallel");
        } else if (slope1 == 1 / slope1) {
            System.out.println("The two lines are perpendicular");
        }
    }
}
