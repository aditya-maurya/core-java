package com.corejava;

import java.util.Scanner;

public class DescimalToBinary {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int nums = number;
        // Actually this condition would be taken care by StringBuffer initialization.
        if(nums == 0)
            System.out.println(nums);
        StringBuffer sb = new StringBuffer();
        // Iterate by converting num to appropriate binary value.
        while(nums!=0)
        {
            sb.append(nums%2);
            nums = nums/2;
        }
        System.out.println(sb.toString());
        //if(nums!=0)
        System.out.println(sb.reverse().toString());


        //////  Or  Next Way to print Binary Number
        System.out.println(Integer.toBinaryString(number));
    }






}

