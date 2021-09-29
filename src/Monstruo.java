public class Monstruo extends Enemigo{
    public Monstruo(){
        super();
    }

    public Monstruo(Enemigo[] enemigos, String name){
        super(enemigos, name);
    }

    public void skill(Jugador jugador){
        jugador.poisoned = true;
    }
}
