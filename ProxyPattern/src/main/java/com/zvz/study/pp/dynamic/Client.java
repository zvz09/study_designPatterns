package com.zvz.study.pp.dynamic;

import com.zvz.study.pp.dynamic.player.GamePlayer;
import com.zvz.study.pp.dynamic.player.IGamePlayer;
import com.zvz.study.pp.dynamic.proxy.GamePlayIH;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) throws Throwable {
//定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
//定义一个handler
        InvocationHandler handler = new GamePlayIH(player);

//获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
//动态产生一个代理者
        IGamePlayer proxy = (IGamePlayer)Proxy.newProxyInstance(cl,new Class[]{IGamePlayer.class},handler);
//登录
        proxy.login("zhangSan", "password");
//开始杀怪
        proxy.killBoss();
//升级
        proxy.upgrade();

    }
}
