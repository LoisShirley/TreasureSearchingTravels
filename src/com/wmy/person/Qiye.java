package com.wmy.person;

import com.wmy.article.Article;
import com.wmy.place.Place;


/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public class Qiye extends Person {

    @Override
    public void attack(Article article, Person targetPerson) {
        article.useArticle(targetPerson);
    }

    @Override
    public void location(Place place, Person targetPlace) {

    }
}