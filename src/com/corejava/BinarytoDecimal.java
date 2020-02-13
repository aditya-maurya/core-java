package com.corejava;

import java.util.Scanner;

public class BinarytoDecimal {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

       // String str=  Integer.toString(number);
        String str=  String.valueOf(number);
        System.out.println(Integer.parseInt(str,2));






        ////////////// Other Way.


        String num = String.valueOf(number);
        int dec_value = 0;

        // Initializing base value to 1,
        // i.e 2^0  =>   .....,32,16,8,4,2,1
        int base = 1;

        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value += base;
                 base = base * 2;
        }

        System.out.println(dec_value);

  /////////////// Other ways to

        int decimal = 0;
        int n = 0;
        while(true){
            if(number == 0){
                break;
            } else {
                int temp = number%10;
                decimal += temp*Math.pow(2, n);
                number = number/10;
                n++;
            }
        }
        System.out.println(decimal);


    }




}
