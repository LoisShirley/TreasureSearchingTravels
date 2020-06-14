package com.wmy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //新建一个场景
        Scene scene = new Scene();
        scene.initScene();
        //输出欢迎消息
        scene.Welcome();

        Main game = new Main();
        scene.Welcome();
        game.play();

        System.out.println("再见！");
    }

    private HashMap<String,Handler> handlers = new HashMap<String,Handler>();

    public Main(){
        handlers.put("go",new HandlerGo(this));
        handlers.put("SOS",new HandlerSOS(this));
        handlers.put("bye",new HandlerBye(this));
        handlers.put("chop",new HandlerChop(this));
        Scene scene = new Scene();
        scene.initPlaces();
    }
    public void play(){
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            Handler handler = handlers.get(words[0]);
            String value = "";
            if(words.length>1)
                value = words[1];
            if(handler != null){
                handler.doCmd(value);
                if(handler.isBye())
                    break;
            }
        }
        in.close();
    }
}