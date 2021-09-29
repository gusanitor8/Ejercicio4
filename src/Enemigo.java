public  class Enemigo extends Combatiente{
    public Enemigo(){
        super();
    }

    public Enemigo(Enemigo[] enemigos){
        super();
    }

    public void addMe(Enemigo[] enemiesInCombat){
        for(int i = 0; i < enemiesInCombat.length; i++){
            if(enemiesInCombat[i] == null){
                enemiesInCombat[i] = this;
            }
        }
    }

}
