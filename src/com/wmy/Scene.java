package com.wmy;

import com.sun.istack.internal.NotNull;
import com.wmy.article.Fist;
import com.wmy.article.LongSword;
import com.wmy.article.ShortSword;
import com.wmy.article.Stick;
import com.wmy.person.*;
import com.wmy.place.Place;
import com.wmy.place.PlaceSet;

/**
 * @description:
 * @author: wmy
 * @date: Created on 2020/5/14
 * @version: 1.0
 * @modified By:
 */
public class Scene {

    public Place currentRoom;

    public void initScene() {
        initPlaces();
        initQiye(placeSet.searchPlaceById("1"));
        initBoss();
    }

    PlaceSet placeSet=new PlaceSet();//定义存放所有房间的对象
    Qiye qiye = new Qiye();
    BossSet bossSet = new BossSet();
    Yayi yayi = new Yayi();
    Yulinwei yulinwei = new Yulinwei();
    Jinjun jinjun = new Jinjun();
    Shouwei shouwei = new Shouwei();
    Qiwang qiwang = new Qiwang();
    PrimeMinister primeMinister = new PrimeMinister();
    Huakui huakui = new Huakui();
    YingtianfuCheng yingtianfuCheng = new YingtianfuCheng();
    Maid maid = new Maid();
    FolianPrincess folianPrincess = new FolianPrincess();
    XuanjiQueen xuanjiQueen = new XuanjiQueen();

    void initPlaces(){
        Place Taiyuan,Wuji,Tiansha,Xuanji,Qiongcang;
        Place Mansion1,Yamen,Palace,Mansion2,QiwangMansion,PrimeMinisterMansion;
        Place Mansion3,GailyPaintedPleasureBoat,Yingtianfu;
        Place Mansion4,PrincessPalace,XuanjiPalace,Mansion5,End;

        //创建地点
        Taiyuan = new Place("1","太渊国");
        Wuji = new Place("2","无极国");
        Tiansha = new Place("3","天煞国");
        Xuanji = new Place("4","璇玑国");
        Qiongcang = new Place("5","穹苍");
        Mansion1 = new Place("6","府邸1");
        Yamen = new Place("7","衙门");
        Palace = new Place("8","皇宫");
        Mansion2 = new Place("9","府邸2");
        QiwangMansion = new Place("10","歧王府");
        PrimeMinisterMansion = new Place("11","丞相府");
        Mansion3 = new Place("12","府邸3");
        GailyPaintedPleasureBoat = new Place("13","画舫");
        Yingtianfu = new Place("14","应天府");
        Mansion4 = new Place("15","府邸4");
        PrincessPalace = new Place("16","佛莲公主的宫殿");
        XuanjiPalace = new Place("17","璇玑宫");
        Mansion5 = new Place("18","府邸5");
        End = new Place("19","灵台（终点）");

        //初始化地点出口
        Taiyuan.setExit("6", Mansion1);
        Mansion1.setExit("7",Yamen);
        Mansion1.setExit("8",Palace);
        Yamen.setExit("8",Palace);
        Palace.setExit("7",Yamen);
        Palace.setExit("2",Wuji);

        Wuji.setExit("9",Mansion2);
        Mansion2.setExit("10",QiwangMansion);
        Mansion2.setExit("11",PrimeMinisterMansion);
        QiwangMansion.setExit("11",PrimeMinisterMansion);
        PrimeMinisterMansion.setExit("10",QiwangMansion);
        PrimeMinisterMansion.setExit("3",Tiansha);

        Tiansha.setExit("12",Mansion3);
        Mansion3.setExit("13",GailyPaintedPleasureBoat);
        Mansion3.setExit("14",Yingtianfu);
        GailyPaintedPleasureBoat.setExit("14",Yingtianfu);
        Yingtianfu.setExit("13",GailyPaintedPleasureBoat);
        Yingtianfu.setExit("4",Xuanji);

        Xuanji.setExit("15",Mansion4);
        Mansion4.setExit("16",PrincessPalace);
        Mansion4.setExit("17",XuanjiPalace);
        PrincessPalace.setExit("17",XuanjiPalace);
        XuanjiPalace.setExit("16",PrincessPalace);
        XuanjiPalace.setExit("5",Qiongcang);

        Qiongcang.setExit("18",Mansion5);
        Mansion5.setExit("19",End);

        placeSet.addPlace(Taiyuan);
        placeSet.addPlace(Wuji);
        placeSet.addPlace(Tiansha);
        placeSet.addPlace(Xuanji);
        placeSet.addPlace(Qiongcang);
        placeSet.addPlace(Mansion1);
        placeSet.addPlace(Yamen);
        placeSet.addPlace(Palace);
        placeSet.addPlace(Mansion2);
        placeSet.addPlace(QiwangMansion);
        placeSet.addPlace(PrimeMinisterMansion);
        placeSet.addPlace(Mansion3);
        placeSet.addPlace(GailyPaintedPleasureBoat);
        placeSet.addPlace(Yingtianfu);
        placeSet.addPlace(Mansion4);
        placeSet.addPlace(PrincessPalace);
        placeSet.addPlace(XuanjiPalace);
        placeSet.addPlace(Mansion5);
        placeSet.addPlace(End);

        //开始位置：太渊国
        currentRoom = Taiyuan;
    }

    public void goRoom(@NotNull String place) {
        Place nextRoom = currentRoom.getExit(place);
        if (nextRoom == null) {
            System.out.println("这里没有路！");
        }
        else {
            currentRoom = nextRoom;
            showPrompt1();
        }
    }

    private void initQiye(Place place){
        qiye.setId("戚夜");
        qiye.setDescription("剑客");
        qiye.setCurrentArticle(new Fist("a1","拳头",-20));
        qiye.setCurrentArticle(new Stick("a2","木棍",-40));
        qiye.setCurrentArticle(new ShortSword("a3","短剑",-60));
        qiye.setCurrentArticle(new LongSword("a4","长剑",-80));
        qiye.setHP(500);
        qiye.setCurrentPlace(place);
    }

    private void initBoss(){
        yayi.setId("b1");
        yayi.setDescription("衙役");
        yayi.setCurrentArticle(new Stick("a1","拳头",-20));
        yayi.setHp(200);
        yayi.setDamage(-20);

        yulinwei.setId("b2");
        yulinwei.setDescription("羽林卫");
        yulinwei.setCurrentArticle(new Stick("a2","棍棒攻击",-40));
        yulinwei.setHp(150);
        yulinwei.setDamage(-40);

        jinjun.setId("b3");
        jinjun.setDescription("禁军");
        jinjun.setCurrentArticle(new ShortSword("a3","短剑攻击",-60));
        jinjun.setHp(200);
        jinjun.setDamage(-60);

        shouwei.setId("b4");
        shouwei.setDescription("守卫");
        shouwei.setCurrentArticle(new Stick("a1","拳头",-20));
        shouwei.setHp(100);
        shouwei.setDamage(-20);

        primeMinister.setId("b5");
        primeMinister.setDescription("丞相");
        primeMinister.setCurrentArticle(new ShortSword("a3","短剑攻击",-60));
        primeMinister.setHp(250);
        primeMinister.setDamage(-60);

        huakui.setId("b6");
        huakui.setDescription("花魁");
        huakui.setCurrentArticle(new ShortSword("a2","棍棒攻击",-40));
        huakui.setHp(250);
        huakui.setDamage(-40);

        yingtianfuCheng.setId("b7");
        yingtianfuCheng.setDescription("应天府丞");
        yingtianfuCheng.setCurrentArticle(new ShortSword("a3","短剑攻击",-60));
        yingtianfuCheng.setHp(200);
        yingtianfuCheng.setDamage(-60);

        maid.setId("b8");
        maid.setDescription("婢女");
        maid.setCurrentArticle(new ShortSword("a2","棍棒攻击",-40));
        maid.setHp(250);
        maid.setDamage(-40);

        folianPrincess.setId("b9");
        folianPrincess.setDescription("佛莲公主");
        folianPrincess.setCurrentArticle(new ShortSword("a3","短剑攻击",-60));
        folianPrincess.setHp(300);
        folianPrincess.setDamage(-60);

        xuanjiQueen.setId("b10");
        xuanjiQueen.setDescription("璇玑女王");
        xuanjiQueen.setCurrentArticle(new LongSword("a4","长剑攻击",-80));
        xuanjiQueen.setHp(300);
        xuanjiQueen.setDamage(-80);

        qiwang.setId("b11");
        qiwang.setDescription("歧王");
        qiwang.setCurrentArticle(new ShortSword("a3","短剑攻击",-60));
        qiwang.setHp(250);
        qiwang.setDamage(-60);

        bossSet.getBosses().add(yayi);
        bossSet.getBosses().add(yulinwei);
        bossSet.getBosses().add(jinjun);
        bossSet.getBosses().add(shouwei);
        bossSet.getBosses().add(primeMinister);
        bossSet.getBosses().add(qiwang);
        bossSet.getBosses().add(huakui);
        bossSet.getBosses().add(yingtianfuCheng);
        bossSet.getBosses().add(maid);
        bossSet.getBosses().add(folianPrincess);
        bossSet.getBosses().add(xuanjiQueen);
    }

    public void showPrompt1(){
        System.out.println("现在你在" + currentRoom);
        System.out.print("出口有: "+currentRoom.getId()+currentRoom.getDescription()+"\n");

        System.out.println("如果需要帮助，请输入 'SOS' 。");
        System.out.println("请输入“go+序号”选择你要去的地方。");
    }

    public void showPrompt2(){
        System.out.print("*************************\n");
        System.out.print("这里的Boss有: \n");
        for (Boss item:bossSet.getBosses()){
            System.out.println(item.getId()+"("+item.getDescription()+"):  HP:"+item.getHp());
        }
        System.out.print("你的生命值为： \n");
        System.out.println(getQiye().getId()+"("+getQiye().getDescription()+"):  HP:"+getQiye().getHP());
        System.out.print("*************************\n");
        System.out.print("你现在可以输入命令攻击Boss：\n");
        System.out.print("eg:\tchop b1\n");
    }

    void Welcome(){
        System.out.println("欢迎来到游戏《寻灵记》(Treasure Searching Travels)\n");
        System.out.println("是穿越还是重生？是初见还是重逢？\n" +
                "从此，你的名字是戚夜。\n" +
                "你将游历过四国，来到穹苍，\n" +
                "在收集的魂珠的一路上，遇见各种各样的人和事。\n" +
                "故事就要拉开序幕……\n");
        System.out.println("**************************************************背景介绍*********************************************");
        System.out.println("是日，你中了彩票三等奖，高兴之余喝了一瓶酒，结果不消息踩到了空酒瓶，整个人后摔到地上，昏死过去……\n" +
                "一觉醒来，发现自己处在一个奇怪的地方，空旷的草地上有一棵树，树下站着一个手上把玩这小青蛇的美丽女人。\n" +
                "原来这个女人是这个世界的造物主——灵主。她告诉你，你已经死了，只要帮助她找到散落人间的九颗魂珠，她就可以帮助你回到原来的世界。\n" +
                "你接受了这场交易并被她送入一个未知的世界。到底有什么在等待着你呢？\n"+
                "故事就从这里开始……\n");
        showPrompt1();
        showPrompt2();
    }

    public PlaceSet getPlaceSet() {
        return placeSet;
    }

    public void setPlaceSet (PlaceSet placeSet) {
        this.placeSet=placeSet;
    }

    public Qiye getQiye () {
        return qiye;
    }

    public void setQiye(Qiye qiye) {
        this.qiye=qiye;
    }

    public BossSet getBossSet() {
        return bossSet;
    }

    public void setBossSet(BossSet bossSet) {
        this.bossSet = bossSet;
    }
}
