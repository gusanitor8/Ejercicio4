public class Alien extends Enemigo{
    public Alien(){
        super();
    }

    public Alien(Enemigo[] enemigos, String name){
        super(enemigos, name);
    }

    public void skill(Jugador jugador){
        jugador.life = jugador.life -7;
    }
}
