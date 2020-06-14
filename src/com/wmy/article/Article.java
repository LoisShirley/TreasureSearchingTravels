package com.wmy.article;

import com.wmy.person.Person;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/25
 * @version: 1.0
 * @modified By:
 */
public abstract class Article {
    private String id;
    private String description;
    private int effectValue;

    public abstract void useArticle(Person targetPerson);
    public Article() {
    }

    public Article(String id, String description, int effectValue) {
        this.id = id;
        this.description = description;
        this.effectValue = effectValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
    }
}
