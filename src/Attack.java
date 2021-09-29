public class Attack extends Item{
    public Attack(){
        super();
    }

    @Override
    public void skill(Enemigo enemigo) {
        enemigo.life = enemigo.life -7;
    }
}