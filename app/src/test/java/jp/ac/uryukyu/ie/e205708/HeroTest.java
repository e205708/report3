package jp.ac.uryukyu.ie.e205708;

import org.junit.jupiter.api.Test;

import jp.ac.uryukyu.Warrior;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    
    @Test
    void warriorAttackTest(){
        int defaultAttack = 10;
        int defaultEnemyHp = 10000;
        Warrior demoWorrior = new Warrior("テスト",100,defaultAttack);
        Enemy kakashi = new Enemy("カカシ",defaultEnemyHp,0);
        for(int i = 0; i < 3 ; i++){
            demoWorrior.attackWithWeaponSkill(kakashi);
            defaultEnemyHp -= defaultAttack*1.5;
            assertEquals(kakashi.hitPoint,defaultEnemyHp);
        }
    }
}
