package com.namangupta;

public class Main {

    public static void main(String[] args) {

        /*int switchValue = 6;
        String message = "";

        switch (switchValue) {
            case 1:
                message += "Value was 1";
                break;
            case 2:
                message += "Value was 2";
                break;
            case 3: case 4: case 5:
                message += "was a 3, or a 4, or a 5\nActually it was a " + switchValue;
                break;
            default:
                message += "Was not 1, 2, 3, 4 or 5";
                break;
        }
        System.out.println(message);*/

        char choice = 'E';
        String msg = "";

        switch (choice) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                msg += "Found character " + choice;
                break;
            default:
                msg += "Character not found";
                break;
        }
        System.out.println(msg);

        String month = "jAnuaRy-";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
