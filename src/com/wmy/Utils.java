package com.wmy;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/14
 * @version: 1.0
 * @modified By:
 */
public class Utils {
    public static int randomMonsterChop(int min,int max){
        return(int)(Math.random()*(max-min)+min);
    }
}
