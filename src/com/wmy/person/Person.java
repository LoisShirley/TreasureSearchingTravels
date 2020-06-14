package com.wmy.person;

import java.util.ArrayList;

import com.wmy.article.Article;
import com.wmy.place.Place;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/13
 * @version: 1.0
 * @modified By:
 */
public abstract class Person<PlaceList> {
    private String id;
    private String description;
    private int HP;
    private int damage;//进攻伤害点数
    private Article currentArticle;
    private Place currentPlace;
    private ArrayList<Article> articles = new ArrayList<>();
    private ArrayList<Place> places= new ArrayList<>();
    private int hp;

    public abstract void attack(Article article, Person targetPerson);//当前生物用一种武器攻击目标生物

    public abstract void location(Place place, Person targetPlace);

    public Person() {
    }

    public Person(String id, String description, int HP, int damage) {
        this.id = id;
        this.description = description;
        this.HP = HP;
        this.damage = damage;
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

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Article getCurrentArticle() {
        return currentArticle;
    }

    public void setCurrentArticle(Article currentArticle) {
        this.currentArticle = currentArticle;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public Place getCurrentPlace() {
        return currentPlace;
    }

    public void setCurrentPlace(Place currentPlace) {
        this.currentPlace = currentPlace;
    }

    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<Place> places) {
        this.places = places;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }
}