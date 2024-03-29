package Proyecto;

import java.util.List;


public abstract class Pokemon {
    private  String name ;
    private int health ;
    private List<IAttack> attacks;

    public Pokemon (String name , int health , List<IAttack> attacks ) {
        this.name = name ;
        this.health = health ;
        this.attacks = attacks ;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<IAttack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<IAttack> attacks) {
        this.attacks = attacks;
    }
}
