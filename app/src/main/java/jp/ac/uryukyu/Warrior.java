package jp.ac.uryukyu;

import jp.ac.uryukyu.ie.e205708.Hero;
import jp.ac.uryukyu.ie.e205708.LivingThing;

public class Warrior extends Hero{

    public Warrior(String name,int hp,int attack){
        super(name,hp,attack);
    }

    public void attackWithWeaponSkill(LivingThing opponent){
        if (this.isDead() != true){
            int damage = (int)(this.getAttack() * 1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", this.getName(), opponent.getName(), damage);
            opponent.wounded(damage);
            }
    }
}
