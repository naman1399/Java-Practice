package com.namangupta;

public class Main {

    public static void main(String[] args) {

        /*int count = 1;
        while(count!=6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while(true){
            if(count==6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        count=6;
        do {
            System.out.println("Count value was " + count);
            count++;

            if (count>100) {
                break;
            }
        } while (count!=6);*/

        int number = 5;
        int finishNumber = 20;
        int count = 0;
        while (number<=finishNumber){
            if (!isEvenNumber(number)){
                number++;
                continue;
            }
            if (count==5)
                break;
            System.out.println("Even number " + number);
            count++;
            number++;
        }

    }

    public static boolean isEvenNumber(int n){
        if(n%2==0)
            return true;
        return false;
    }
}
