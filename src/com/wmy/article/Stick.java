package com.wmy.article;

import com.wmy.person.Person;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/25
 * @version: 1.0
 * @modified By:
 */
public class Stick extends Article{
    public Stick(String id, String description, int effectValue) {
        super(id, description, effectValue);
    }

    @Override
    public void useArticle(Person targetPerson) {
        targetPerson.setHP(targetPerson.getHP()+this.getEffectValue());
    }
}
