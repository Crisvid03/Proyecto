package Proyecto;

public class Ataque implements  IAttack{
    private  String name ;
    private  int damage ;

    public Ataque (String name , int damage)  {
        this.name = name ;
        this.damage = damage;
    }

    @Override
    public void execute(Pokemon attacker, Pokemon defender) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
