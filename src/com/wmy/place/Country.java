package com.wmy.country;

import com.sun.istack.internal.NotNull;

import java.util.HashMap;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public class Country {
    private String description;
    private HashMap<String,Country> exits = new HashMap<String,Country>();
    //用Hash容器来表达每一个方向上对应的地点

    public Country(String description){
        this.description = description;
    }

    public void setExit(String direction, Country room){
        exits.put(direction,room);
    }

    @Override
    public String toString(){
        return description;
    }

    public String getDescription() {
        StringBuffer sb = new StringBuffer();
        for(String direction : exits.keySet()){
            sb.append(direction);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Country getExit(@NotNull String direction){
        Country ret = exits.get(direction);
        return ret;
    }
    //通过分装降低Main和Country之间的耦合程度
}
