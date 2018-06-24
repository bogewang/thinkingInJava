/*
 * Copyright (c) 2018.
 * bogewang
 */

package com.bogewang.ch10._06_00._14;

import org.junit.Test;

/**
 * 使用匿名类实现接口;
 */
public class HorrorShow {
    void u(Monster b){
        b.menace();
    }

    void v(DangerousMonster d){
        d.destroy();
        d.menace();
    }

    void w(Lethal l){
        l.kill();
    }


    DangerousMonster getMonster(){
        return new DangerousMonster() {
            @Override
            public void destroy() {
                System.out.println("dangerousMonster destory");
            }

            @Override
            public void menace() {
                System.out.println("dangerousMonster menace");
            }
        };
    }

    Lethal getLethal(){
        return new Lethal() {
            @Override
            public void kill() {
                System.out.println("lethal kill");
            }
        };
    }

    @Test
    public void test(){
        u(getMonster());
        v(getMonster());
        w(getLethal());
    }


}
