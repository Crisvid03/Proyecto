package Proyecto;



public interface IAttack {
    int getDamage();
    String getName() ;
    void execute( Pokemon attacker , Pokemon defender ) ;

}
