package com.offcn.controller;

import java.util.Date;

/**
 * @Auther: wyan
 * @Date: 2020-12-14 16:46
 * @Description:
 */
public class PayController {
    public static void main(String[] args) {
        long time1 = new Date().getTime();
        for(int i=0;i<100;i++){
            System.out.println(i);
        }
        long time2 = new Date().getTime();
        System.out.println(time2-time1);
    }
}
