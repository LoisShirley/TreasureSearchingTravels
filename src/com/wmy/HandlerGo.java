package com.wmy;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public class HandlerGo extends Handler{
    public HandlerGo(Main game){
        super(game);
    }

    @Override
    public void doCmd(String word){
        Scene scene = new Scene();
        scene.goRoom(word);
    }
}