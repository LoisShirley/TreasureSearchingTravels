package com.wmy;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public class Handler {
    protected  Main game;

    public Handler(Main game){
        this.game = game;
    }
    public void doCmd(String word){}
    public boolean isBye(){
        return false;
    }
}