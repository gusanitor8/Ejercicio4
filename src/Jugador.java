public class Jugador extends Combatiente {
    String name;
    int itemCapacity;

    public Jugador(){
        super();
    }

    public Jugador(Jugador[] jugadores){
        super();
        addMe(jugadores);
    }

    public void addMe(Jugador[] playersInCombat){
        for(int i = 0; i < playersInCombat.length; i++){
            if(playersInCombat[i] == null){
                playersInCombat[i] = this;
            }
        }
    }


}
