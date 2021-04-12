package com.fc.game.a_static;

//玩游戏接口，所有玩游戏的人都要实现接口
public interface GamePlay {

    //游戏登录，需要一个用户名
    void login(String name);

    //打怪方法

    void killBoss();

    //升级方法
    void upGrade();
}
