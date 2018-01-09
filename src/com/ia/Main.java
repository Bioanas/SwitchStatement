package com.ia;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
//        int value = 10;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

//        int switchvalue = 8;
//
//        switch(switchvalue) {
//            case 1:
//                System.out.println("Value was 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("Value was 3 or 4 or 5");
//                System.out.println("Actually it was a" + switchvalue);
//                break;
//            default:
//                System.out.println("was not1, 2,3,3,5");
//               break;
 //           }

            char swichValue = 'B';
        switch (swichValue){
        case 'A':
            System.out.println("value was A");
            break;
        case 'B':
            System.out.println("Value was B");
            break;
        case 'C':
            System.out.println("Value was C");
            break;
        case 'D':
            System.out.println("Value was D");
            break;
        default:
            System.out.println("Value was not A, B, C, D");
            break;
    }

    String month = "january";
        switch (month.toLowerCase()){
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }


    }


}
