package com.wmy;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public class HandlerBye extends Handler{
    public HandlerBye(Main game){
        super(game);
    }

    @Override
    public boolean isBye(){
        return true;
    }
}