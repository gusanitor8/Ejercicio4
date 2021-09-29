public class Guerrero extends Jugador{

    public Guerrero(){
        super();
    }

    public Guerrero(String name, Jugador[] jugadores){
        super(jugadores);
        this.name = name;
        this.attack = 4;
        this.life = 25;
        this.itemCapacity = 2;
        this.spawnMessage = "Se ha creado un Guerrero! \n";
        createItems(itemCapacity);
    }

    /*
    public void useItem(Enemigo enemigo){
        for(int i = 0; i < items.length; i++){
            if(items[i] != null){
                items[i].skill(enemigo);
            }
        }
    }

     */


}
