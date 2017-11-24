package com;

import java.util.Scanner;

public class NumericConversionToWords {



        public static void main(String[] args) {
            int number = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please type a number between 1 and 999 OR type 0 to exit:  ");
            number = scanner.nextInt();
            while(number!=0){
                if(number>=1 && number<=999){
                   
                        System.out.print("NUMBER AFTER CONVERSION:\t");
                        numberToWord(((number / 100) % 10), " HUNDRED");
                        numberToWord((number % 100), " ");
                    }

                 else{
                    System.out.print("NUMBER OUT OF RANGE");
                }
                System.out.print("\nPlease type a number between 1 and 999 OR type 0 to exit:  ");
                number = scanner.nextInt();
            }
            System.out.println("Exit");     
        }

        public static void numberToWord(int num, String val) {
            String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"
            };
            String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
            if (num > 19) {
                System.out.print(tens[num / 10] + " " + ones[num % 10]);
            } else {
                System.out.print(ones[num]);
            }
            if (num > 0) {
                System.out.print(val);
            }
        }
    }