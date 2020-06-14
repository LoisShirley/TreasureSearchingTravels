package com.wmy;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public class HandlerSOS extends Handler{
    public HandlerSOS(Main game){
        super(game);
    }

    @Override
    public void doCmd(String word){
        System.out.println("如果迷路了你可以做出以下命令：");
        System.out.println("go / SOS / ByeBye");
        System.out.println("eg:\tgo east");
    }
}