package com.wmy.person;

import com.wmy.article.Article;
import com.wmy.place.Place;

import java.util.ArrayList;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/14
 * @version: 1.0
 * @modified By:
 */
public class BossSet extends Person{
    private ArrayList<Boss> bosses = new ArrayList<>();
    //根据name(String)来查对应的Monster对象
    public Boss get(String id){
        Boss boss=null;
        for(Boss item:bosses){
            if(true==id.equals(item.getId())){
                boss=item;
                break;
            }
        }
        return boss;
    }

    @Override
    public void attack(Article article, Person targetPerson) {

    }

    @Override
    public void location(Place place, Person targetPlace) {

    }

    public BossSet() {
    }

    public ArrayList<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(ArrayList<Boss> bosses) {
        this.bosses = bosses;
    }
}
