public class Explorador extends Jugador{

    public Explorador(String name, Jugador[] jugadores) {
        super(jugadores);
        this.name = name;
        this.attack = 4;
        this.life = 25;
        this.itemCapacity = 2;
    }


}
