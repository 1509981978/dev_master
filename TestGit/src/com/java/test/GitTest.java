package com.java.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GitTest implements Runnable{

    @Override
    public void run() {
        int compareNum = -1;
        int i = 100;
        while(compareNum != 4 && i != 0){
            SimpleDateFormat dateFormat = new SimpleDateFormat("mm:ss");
            Date nowDate = new Date();
            String nowTimeStr = dateFormat.format(nowDate);
            System.err.println("curr time " + nowTimeStr );
            i--;
            compareNum = Integer.valueOf(nowTimeStr.substring(0,1));
        }

    }
}
