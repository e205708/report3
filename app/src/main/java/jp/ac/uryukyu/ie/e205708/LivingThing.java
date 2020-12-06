package jp.ac.uryukyu.ie.e205708;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    LivingThing(String _name,int _hitPoint,int _attack)
    {
        this.name = _name;
        this.hitPoint = _hitPoint;
        this.attack = _attack;
        dead = false;
    }

    public boolean isDead(){
        return this.dead;
    }

    public String getName(){
        return this.name;
    }

    public void attack(LivingThing opponent){
        if (this.dead != true){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
            }
    }
    
    public void wounded(int damage){
        hitPoint -= damage;
        if (hitPoint < 0){
            this.dead = true;
            System.out.printf("%sは倒れた",this.name);
        }
    }
}
