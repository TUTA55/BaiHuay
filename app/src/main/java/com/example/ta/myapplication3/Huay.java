package com.example.ta.myapplication3;

import java.util.Random;

/**
 * Created by TA on 22/10/2559.
 */

public class Huay {
    Random b = new Random();
    private int lek2 ;
    private int lek3 ;
    public String getRandomTwoDigits(){
        lek2 = b.nextInt(100);
        if(lek2 < 10){
            return  "0"+lek2;
        }
        return ""+lek2;
    }
    public  String  getRandomThreeDigits(){
        lek3 = b.nextInt(1000);
        if(lek3 < 10){
             return  "00"+lek3;
        }
        else if(lek3 < 100 && lek3 > 9){
            return  "0"+lek3;
        }
        return ""+lek3;
    }
}
