public  class Enemigo extends Combatiente{
    public Enemigo(){
        super();
    }

    public Enemigo(Enemigo[] enemigos, String name){
        super();
        addMe(enemigos);
        this.name = name;

    }

    public void skill(Jugador jugador){

    }

    public void addMe(Enemigo[] enemiesInCombat){
        for(int i = 0; i < enemiesInCombat.length; i++){
            if(enemiesInCombat[i] == null){
                enemiesInCombat[i] = this;
            }
        }
    }

}
