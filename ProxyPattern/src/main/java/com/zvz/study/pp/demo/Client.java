package com.zvz.study.pp.demo;

import com.zvz.study.pp.demo.player.GamePlayer;
import com.zvz.study.pp.demo.player.IGamePlayer;
import com.zvz.study.pp.demo.proxy.GamePlayerProxy;

public class Client {

    public static void main(String[] args) {
//定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
//然后再定义一个代练者
        IGamePlayer proxy = new GamePlayerProxy(player);

        proxy.login("zhangSan", "password");
//开始杀怪
        proxy.killBoss();
//升级
        proxy.upgrade();

    }

}
