package com.wmy.place;

import java.util.ArrayList;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/14
 * @version: 1.0
 * @modified By:
 */
public class PlaceSet {
    //定义ArrsyList集合对象(集合元素类型为Place类)places，存放所有的房间数据
    ArrayList<Place> places=new ArrayList<>();

    public void addPlace (Place place) {
        places.add(place);
    }

    public Place searchPlaceById (String placeId) {
        Place place=null;
        for (Place item : places
        ) {
            if (item.getId().equals(placeId)) {
                place=item;
                break;
            }
        }
        return place;
    }
}
