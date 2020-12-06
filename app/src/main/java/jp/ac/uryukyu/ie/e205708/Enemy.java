package jp.ac.uryukyu.ie.e205708;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
 }  
        /**
        * nameのsetter.
        * @param _name 設定したいオブジェクトのname
        */
        public void setName(String _name){
            this.name = _name;
        }
    
        /**
        * hitPointのgetter.
        * @return オブジェクトのhitPoint値
        */
        public int getHitPoint(){
            return this.hitPoint;
        }
    
        /**
        * hitPointのsetter
        * @param _hitPoint 設定したいオブジェクトのhitpoint
        */
        public void setHitPoint(int _hitPoint){
            this.hitPoint = _hitPoint;
        }
    
        /**
        * attackのgetter
        * @return オブジェクトのattackの値
        */
        public int getAttack(){
            return this.attack;
        }
    
        /**
        * attackのsetter
        * @param _attack 設定したいオブジェクトのattack
        */
        public void setAttack(int _attack){
            this.attack = _attack;
        }
    
        /**
        * deadのsetter
        * @param _dead 設定したいオブジェクトのdead
        */
        public void setDead(boolean _dead){
            this.dead = _dead;
        }
}