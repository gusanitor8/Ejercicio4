public class Jugador extends Combatiente {
    //String name;
    int itemCapacity;

    public Jugador(){
        super();
    }

    public Jugador(Jugador[] jugadores){
        super();
        addMe(jugadores);
    }

    public void useItem(Enemigo enemigo){
        for(int i = 0; i < items.length; i++){
            if(items[i] != null){
                items[i].skill(enemigo);
            }
        }
    }


    public void addMe(Jugador[] playersInCombat){
        for(int i = 0; i < playersInCombat.length; i++){
            if(playersInCombat[i] == null){
                playersInCombat[i] = this;
            }else{
                System.out.println("No le quedan items \n");
            }
        }
    }


}
