package com.wmy.person;

import com.wmy.article.Article;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/6/5
 * @version: 1.0
 * @modified By:
 */
public class Yayi extends Boss{
    @Override
    public void attack(Article article, Person targetPerson) {
        article.useArticle(targetPerson);
    }
}
