public class Combatiente {
    protected int life;
    protected int attack;
    protected boolean poisoned = false;
    protected String spawnMessage;
    protected String deadMessage;
    protected String winMessage;
    public static Jugador[] playersInCombat = new Jugador[5];
    public static Enemigo[] enemiesInCombat = new Enemigo[5];
    public static Enemigo enemyBoss;

    public Combatiente(){}

    public void setPoisoned(boolean poisoned) {
        this.poisoned = poisoned;
    }

    private void isPoisoned(){
        int counter = 4;
        if((this.poisoned) && (counter != 0)){
            this.life--;
        }else{
            this.poisoned = false;
        }
    }

    public void attackCombatiente(Combatiente combatiente){
        combatiente.life = combatiente.life - this.attack;
    }

    public void turn(){

    }

}
