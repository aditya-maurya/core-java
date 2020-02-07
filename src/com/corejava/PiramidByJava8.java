package com.corejava;

import java.util.Collections;

public class PiramidByJava8 {

    public static void main(String[] args) {

       int rows =5;
        /*
         Full Pyramid
         */

        for (int i = 0; i < rows; i++) {

            System.out.println(String.join("", Collections.nCopies(5 - i - 1, " "))
                    + String.join("", Collections.nCopies(2 * i + 1, "*")));

        }


        /*
            Inverted Pyramid

         */

        for (int i = rows; i > 0; i--) {

            System.out.println(String.join("", Collections.nCopies(5 - i, " "))
                    + String.join("", Collections.nCopies(2 * i - 1, "*")));

        }


    }
}
