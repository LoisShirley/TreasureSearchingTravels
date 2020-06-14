package com.wmy.place;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public class Place {
    private String id;
    private String description;
    private HashMap<String,Place> exits = new HashMap<String,Place>();

    public void setExit(String placeId,Place place){
        exits.put(placeId,place);
    }

    public Place searchExitPlacesById (String targetPlaceId, HashMap<String,Place> exits) {
        Place place=null;
        if(true == exits.containsKey(targetPlaceId))
        {
            place=exits.get(targetPlaceId);
        }
        return place;
    }

    @Override
    public String toString()
    {
        return this.description;
    }

    public Place () {
    }

    public Place (String id, String description) {
        this.id=id;
        this.description=description;
    }

    public String getDescription() {
        StringBuffer sb = new StringBuffer();
        for(String place : exits.keySet()){
            sb.append(place);
            sb.append(" ");
        }
        return sb.toString();
    }

    public Place getExit(@NotNull String place){
        Place ret = exits.get(place);
        return ret;
    }

    public String getId(){
        return id;
    }

    public void setId (String id) {
        this.id=id;
    }

    public void setDescription (String description) {
        this.description=description;
    }

    public HashMap<String, Place> getExits() {
        return exits;
    }

    public void setExits (HashMap<String, Place> exits) {
        this.exits=exits;
    }
}
