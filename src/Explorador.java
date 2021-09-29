public class Explorador extends Jugador{

    public Explorador(String name, Jugador[] jugadores) {
        super(jugadores);
        this.name = name;
        this.attack = 1;
        this.life = 20;
        this.itemCapacity = 5;
        this.spawnMessage = "Se ha creado un Explorador! \n";
        createItems(itemCapacity);
    }



}
